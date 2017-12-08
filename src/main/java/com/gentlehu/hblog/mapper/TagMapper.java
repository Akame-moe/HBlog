package com.gentlehu.hblog.mapper;

import com.gentlehu.hblog.pojo.Tag;
import org.springframework.stereotype.Repository;

/**
 * Created by gentle-hu on 2017/12/8 15:37.
 * Email:gentle-hu@qq.com
 */
@Repository("tagMapper")
public interface TagMapper {
    void insert(Tag tag);
    void update(Tag tag);
    void delete(int id);
    Tag findById(int id);
}
