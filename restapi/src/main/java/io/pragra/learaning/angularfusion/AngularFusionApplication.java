package io.pragra.learaning.angularfusion;

import io.pragra.learaning.angularfusion.domain.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class AngularFusionApplication {

    private ProductRepo repo;

    public AngularFusionApplication(ProductRepo repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(AngularFusionApplication.class, args);
    }


    @Bean
    public CommandLineRunner runner(){
        return args -> {
            repo.save(new Product(10L, "abc","https://assets.entrepreneur.com/content/3x2/2000/20191219170611-GettyImages-1152794789.jpeg?width=700&crop=2:1",99.99,"Desc","Desc", "123"));
        };
    }

}
