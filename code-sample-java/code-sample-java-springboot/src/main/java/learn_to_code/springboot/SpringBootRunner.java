package learn_to_code.springboot;

import learn_to_code.springboot.props.FooProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Spring boot is a kind of complicated framework, especially if you don't know Spring first. <br>
 * Long story short spring boot is trying to automatically configure your application, using dependencies
 * available on classpath and lauch an app using some servlet container.
 *
 * Spring boot excessively uses sensible default configurations for everything. For example default servlet container
 * choosen is embedded jetty. Default port is 8080. Here we override this in resources/application.yml file
 *
 * Bean definitions scan is also automatically configured. Usually you would use 3 annotations
 * {@code @Configuration, @EnableAutoConfiguration, @ComponentScan} to start spring boot app. Because those 3 annotations
 * are so often to use together, you can simply use {@code @SpringBootApplication}  annotations to wire up all 3 with a single
 * annotations
 */
@SpringBootApplication // this annotation define 3 annotations below
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

/* this is used to enable properties mappers (those allow you to map your properties to classes type-safely */
@EnableConfigurationProperties(FooProperties.class)
public class SpringBootRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunner.class, args);
    }

    /**
     * This is one of the two interfaces you can override if you want to do stuff just before SpringApplication.run finishes.
     * The other interface is {@link org.springframework.boot.ApplicationRunner}. They both have a single method run()
     *
     * The {@link CommandLineRunner} provide access to simple string array, while ApplicationRunner provide both access to string array and also assess
     * to {@link org.springframework.boot.ApplicationArguments} object
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(System.out::println);
        };
    }
}