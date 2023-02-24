package com.li.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//DIV一些定制化的功能，只要写这个组件，然后将它交给springboot,springboot就会帮我们自动装配！
//扩展mvc


@Configurable
@EnableWebMvc ///这玩意就是导入了一个类: DelegatingWebMvcConfiguration:从容器中获取所有的webmvcconfig;
public class MyMvcConfig implements WebMvcConfigurer {

//    //ViewResolver 实现了视图解析器接口类，我们就可以把它看做视图解析器
//    @Bean
//    public ViewResolver myViewResolver(){
//        return  new MyViewResolver();
//    }

//    //自定义视图解析器MyViewResolver
//    public static class MyViewResolver implements ViewResolver{
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }


    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/lili").setViewName("index");
    }
}
