package com.example.lims.Config;


import io.swagger.annotations.ApiImplicitParams;
import org.hibernate.cache.internal.SimpleCacheKeysFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig
{

    @Bean
    public Docket CreateSwageer()
    {

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();


    }

private ApiInfo apiInfo()
{

    return new ApiInfoBuilder().build();
}


}
