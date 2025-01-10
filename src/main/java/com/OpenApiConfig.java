package com;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: openapi 界面配置
 * @Author: junqiang.lu
 * @Date: 2023/8/15
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SpringBoot API 管理")
                        .contact(new Contact().name("开发者").email("developer@example.com"))
                        .version("1.0")
                        .description("SpringBoot 集成 Knife4j 示例"));
    }

    @Bean
    public GroupedOpenApi siteApi() {
        return GroupedOpenApi.builder()
                .group("site接口")
                .packagesToScan("com")
                .build();
    }

    @Bean
    public GroupedOpenApi webnApi() {
        return GroupedOpenApi.builder()
                .group("web接口")
                .packagesToScan("com")
                .build();
    }
}
