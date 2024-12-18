package com.bmore.Challenge.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpringFoxConfig {

    @Value("${swagger.url}")
    private String url;

    @Bean
    public OpenAPI api() {
        Server devServer = new Server();
        devServer.setUrl(url);

        Info info = new Info()
                .title("Spring boot api")
                .version("1.0")
                .contact(null)
                .description("This API exposes endpoints.")
                .termsOfService(null)
                .license(null);

        return new OpenAPI()
                .info(info).
                servers(List.of());

    }
}
