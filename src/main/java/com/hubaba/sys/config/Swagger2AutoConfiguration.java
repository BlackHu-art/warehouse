package com.hubaba.sys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author admin
 * @create 2021/2/21 10:01
 */
@Configuration
@EnableSwagger2 //启用Swagger2
public class Swagger2AutoConfiguration {

    /**
     * 在IOC容器里面创建可以扫描Controller里面的是否有Swagger相关的注解
     * @return
     */
    @Bean
    public Docket swaggerSpringMvcPlugin(){
        return new Docket(DocumentationType.SWAGGER_2)
                //apiInfo指定测试文档基本信息，这部分将在页面展示
                .apiInfo(apiInfo())
                .select()
                //apis() 控制哪些接口暴露给swagger，
                // RequestHandlerSelectors.any() 所有都暴露
                // RequestHandlerSelectors.basePackage("com.info.*")  指定包位置
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).build();
    }

    //基本信息，页面展示
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().description("仓库后台管理系统SwaggerUI接口工具")
                //名片
                .contact(new Contact("hubaba","http://39.97.277.129","572890907@qq.com"))
                //版本
                .version("1.0")
                //所有者
                .license("hubaba")
                //构造
                .build();
    }

}
