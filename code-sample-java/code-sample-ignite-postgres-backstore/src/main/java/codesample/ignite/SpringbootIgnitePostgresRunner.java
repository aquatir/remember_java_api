package codesample.ignite;

import org.apache.ignite.Ignite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootIgnitePostgresRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootIgnitePostgresRunner.class, args);
    }

    @Bean
    public CommandLineRunner runIgnite() {
        return new CommandLineRunner() {

            @Autowired
            private Ignite igniteClient;

            public void run(String... args)  {
                igniteClient.compute().broadcast(() -> System.out.println("Hello World!"));
                igniteClient.close();
            }
        };
    }
}