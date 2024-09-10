package org.myapp.spirngsecurityexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"src/main/java/org/myapp/spirngsecurityexample/repository"})
public class SpirngSecurityExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpirngSecurityExampleApplication.class, args);
    }

}
