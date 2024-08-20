package com.fastcampus.controller;

import com.fastcampus.Service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final SortService sortService;

    public Controller(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam(name = "list") List<String> list) {

        return sortService.doSort(list).toString();
    }

}
