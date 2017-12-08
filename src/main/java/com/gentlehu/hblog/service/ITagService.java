package com.gentlehu.hblog.service;

import com.gentlehu.hblog.pojo.Tag;
import org.springframework.stereotype.Service;

/**
 * Created by gentle-hu on 2017/12/8 15:40.
 * Email:gentle-hu@qq.com
 */

public interface ITagService {
    void insert(String name);
    void update(int id,String name);
    void delete(int id);
    Tag findById(int id);
}
