package ru.neoflex.gateway.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Кредитный конвейер",
                description = "API-Gateway", version = "0.0.1",
                contact = @Contact(
                        name = "Khokhlov Dmitry",
                        email = "DmitryXox02@yandex.ru"
                )
        )
)
public class SwaggerConfig {

}