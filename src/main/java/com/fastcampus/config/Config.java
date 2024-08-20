package com.fastcampus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.fastcampus") //이 패키지 이하의 모든 Bean을 스캔한다.
@Configuration //Spring 전용 Configuration 클래스로 지정 -> AOP
public class Config {


}
