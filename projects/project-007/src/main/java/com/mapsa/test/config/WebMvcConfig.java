//package com.mapsa.test.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
///**
// * @author Esmaeil Sadeghi, 7/30/20 9:26 PM
// */
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = { "com.mapsa.test"})
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    @Bean
//    public InternalResourceViewResolver resolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setViewClass(JstlView.class);
//        resolver.setPrefix("/WEB-INF/view/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//}
//
