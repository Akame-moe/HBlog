package com.gentlehu.hblog.service.impl;

import com.gentlehu.hblog.mapper.ArticleMapper;
import com.gentlehu.hblog.pojo.Article;
import com.gentlehu.hblog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gentle-hu on 2017/12/6 0:08.
 * Email:gentle-hu@qq.com
 */
@Service("articleService")
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Article findById(Integer id) {
        return articleMapper.findById(id);
    }

    @Override
    public void insert(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public void update(Integer id, Article article) {
        article.setId(id);
        articleMapper.update(article);
    }

    @Override
    public void delete(Integer id) {
        articleMapper.delete(id);
    }

    @Override
    public int getCount() {
        return articleMapper.getCount();
    }
}
