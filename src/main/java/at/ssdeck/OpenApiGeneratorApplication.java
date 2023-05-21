package at.ssdeck;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication
//@EntityScan("at.ssdeck.persistence.entities")
@ComponentScan(
    basePackages = {"org.openapitools", "at.ssdeck.business.rest","at.ssdeck.persistence.entities" ,"at.ssdeck.persistence.repositories","at.ssdeck.configuration","at.ssdeck.business.rest.services.serviceimplementation" ,"at.ssdeck.business.rest.services"},
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class OpenApiGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenApiGeneratorApplication.class, args);
    }

    @Bean(name = "at.ssdeck.OpenApiGeneratorApplication.jsonNullableModule")
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }





}