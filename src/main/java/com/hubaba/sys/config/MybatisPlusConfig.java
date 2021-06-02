package com.hubaba.sys.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

/**
 * @Author admin
 * @create 2021/2/21 10:01
 * ConditionalOnClass 当容器中存在类时才生效
 */
@Configuration
@ConditionalOnClass(value= {PaginationInterceptor.class})
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor  paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
/**
 * @ConditionalOnBean
 * 在容器中有某个类型的组件才发生以下代码事件
 */