package io.github.daveztong.OpenBooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OpenBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenBooksApplication.class, args);
    }
}
