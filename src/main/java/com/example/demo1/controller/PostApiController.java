package com.example.demo1.controller;

import com.example.demo1.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
        /*requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("Value : " + value);
        });*/
        System.out.println(requestData);
    }
}
