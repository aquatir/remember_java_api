package com.codesample.ktor

import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.util.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.slf4j.event.Level
import java.lang.RuntimeException

@Serializable
data class HelloWorld(val word1: String, val word2: String)

@Serializable
data class RequestData(val hello: String)

@Serializable
data class StatusResponse(val status: Status = Status.OK)

enum class Status {
    OK, NOT_OK, UNKNOWN
}

object MyAttributeKeys {
    val strKey = AttributeKey<String>("atrkey")
    val mapKey = AttributeKey<Map<String, String>>("atrmap")

    val timestart = AttributeKey<Long>("timestart") // use for filter functionality
}

//fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
fun main(args: Array<String>) {
    server(false).start(true)
}

fun server(test: Boolean): NettyApplicationEngine {
    return embeddedServer(Netty,
        port = 8080,
        //watchPaths = listOf("/build/classes/kotlin"), // TODO: Fails with 'Module function provided as lambda cannot be unlinked for reload'
        configure = {
            responseWriteTimeoutSeconds = 10
        }) {

        // installs

        install(CallLogging) {
            level = Level.INFO
            format { "Request ${it.request.httpMethod.value} on '${it.request.uri}' - status: ${it.response.status()?.value ?: "unset"}. Took: ${System.currentTimeMillis() - it.attributes.get(MyAttributeKeys.timestart)}ms" }
        }

        install(ContentNegotiation) {
            json(
                contentType = ContentType.Application.Json,
                json = Json {
                    encodeDefaults = true
                    useArrayPolymorphism = true
                    ignoreUnknownKeys = true
                }
            )
        }

        install(StatusPages) {
            exception<ServerException> { _ ->
                call.respond(HttpStatusCode.InternalServerError, StatusResponse(Status.NOT_OK))
            }
            exception<RuntimeException> {
                call.respond(HttpStatusCode.InternalServerError, StatusResponse(Status.UNKNOWN))
            }
        }

        // interceptors

        intercept(ApplicationCallPipeline.Setup) {
            call.attributes.put(MyAttributeKeys.timestart, System.currentTimeMillis())
        }

        intercept(ApplicationCallPipeline.Call) {
            call.attributes.put(MyAttributeKeys.strKey, "atrValue")
            call.attributes.put(MyAttributeKeys.mapKey, mapOf("key" to "value"))
        }

        this.environment.monitor.subscribe(ApplicationStarted) {
            log.info("Caught 'ApplicationStarted' event")
        }

        routing {
            get("/") {
                val reqHeader = call.request.header("X-Other-Header")
                val hello = HelloWorld("Hello, ", "world!!!")


                call.response.header("X-My-Header", "My-value")
                call.respond(HttpStatusCode.OK, hello)
            }


            get("/map") {
                log.info("att str key: '${call.attributes[MyAttributeKeys.strKey]}'")
                log.info("att map key: '${call.attributes[MyAttributeKeys.mapKey]}'")
                call.respond(mapOf("key" to "value"))
            }

            get("/params/{requiredParam}/{optionalParam?}") {
                val params = call.request.queryParameters
                log.info("one: '${params["one"]}' two: '${params["two"]}'")

                val req = call.parameters["requiredParam"]
                val part = call.parameters["optionalParam"]
                log.info("path param required: '$req', optional: '$part'")

                call.respond(HttpStatusCode.OK, StatusResponse())
            }

            get("/ex1") {
                throw ServerException("ex!")
            }
            get("/ex2") {
                throw RuntimeException("ex")
            }

            get("/multiparam/{restOfPath...}") {
                val params = call.parameters.getAll("restOfPath")
                log.info("params: $params")
                call.respond(HttpStatusCode.OK, StatusResponse())
            }


            other()

            post<RequestData>("/body") {
                call.respond(StatusResponse())
            }

        }
    }
}


