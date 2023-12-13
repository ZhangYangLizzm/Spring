package com.example.controller;

import com.example.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/article")
public class ArticleController {

    @RequestMapping("/list")
    public Result list() {
        return Result.success("文章数据");
    }
}
