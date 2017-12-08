package com.gentlehu.hblog.controller;

import com.gentlehu.hblog.pojo.Article;
import com.gentlehu.hblog.service.IArticleService;
import com.gentlehu.hblog.utils.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gentle-hu on 2017/12/5 23:26.
 * Email:gentle-hu@qq.com
 */
@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private IArticleService articleService;

    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return "hello world.alisa";
    }


    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        Article article = articleService.findById(1);
        return GsonUtils.toJson(article);
    }
}
