package com.gentlehu.hblog.mapper;

import com.gentlehu.hblog.pojo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gentle-hu on 2017/12/6 0:51.
 * Email:gentle-hu@qq.com
 */
@Repository("articleMapper")
public interface ArticleMapper {
    Article findById(Integer id);
    void insert(Article article);
    void update(Article article);
    void delete(Integer id);
    int getCount();
    List<Integer> findArticleTags(int id);
}
