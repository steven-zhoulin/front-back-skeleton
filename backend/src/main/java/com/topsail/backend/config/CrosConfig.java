package com.topsail.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置
 *
 * 暂时屏蔽，由前端负责解决跨域问题。
 *
 * @author Steven
 * @date 2020-02-02
 */
//@Configuration
public class CrosConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("GET", "POST", "HEAD", "PUT", "DELETE")
            .allowCredentials(true)
            .maxAge(3600)
            .allowedHeaders("*");
    }

}
