package com.fastcampus.web;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

import com.fastcampus.config.Config;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//DispatcherServlet을 initialize한다.
//tomcat에 이 코드를 올리게 되면 onStartUp이 자동으로 인식되어서 ApplicationContext가 생성된다
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {

        // Load Spring web application configuration
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(Config.class); // AppConfig는 우리가 기존에 만들었던 Config 클래스 말하는 것

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }

}