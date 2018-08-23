package codesample.kotlin.jwtexample.security

import codesample.kotlin.jwtexample.KotlinJwtAppRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = [KotlinJwtAppRunner::class])
@AutoConfigureMockMvc
class AuthTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun authTest() {
        mockMvc.perform(get("/auth"))
                .andDo(print())
    }
}