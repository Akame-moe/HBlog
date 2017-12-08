package com.gentlehu.hblog.service;

import com.gentlehu.hblog.pojo.Article;

/**
 * Created by gentle-hu on 2017/12/6 0:08.
 * Email:gentle-hu@qq.com
 */

public interface IArticleService {

    Article findById(Integer id);
    void insert(Article article);
    void update(Integer id,Article article);
    void delete(Integer id);
    int getCount();

}
