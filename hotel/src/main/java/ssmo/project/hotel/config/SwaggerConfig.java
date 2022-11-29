package ssmo.project.hotel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("Authorization")
    private String JWT_HEADER;

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("REST API")
                .description("Ssmo REST API Document")
                .version("1.0")
                .build();
    }

    @Bean
    public Docket userSwagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Ssmo REST API")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("ssmo.project.hotel.controller"))
                .paths(PathSelectors.ant("/user/**"))
                .build();
    }
}
