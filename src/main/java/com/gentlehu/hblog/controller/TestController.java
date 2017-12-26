package com.gentlehu.hblog.controller;

import com.gentlehu.hblog.pojo.Article;
import com.gentlehu.hblog.service.IArticleService;
import com.gentlehu.hblog.utils.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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




    @RequestMapping(value = "/show",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String show(Integer id){
        Article article = articleService.findById(id);
//        HashMap<Object, Object> map = Maps.newHashMap();
        return GsonUtils.toJson(article);
    }

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","alisa");
        return "hello";
    }
}
