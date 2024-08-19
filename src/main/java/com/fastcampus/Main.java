package com.fastcampus;

import com.fastcampus.Service.SortService;
import com.fastcampus.config.Config;
import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); //Config 불러오기
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result]" + sortService.doSort(Arrays.asList(args)));
    }
}