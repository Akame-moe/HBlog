package com.gentlehu.hblog.service.impl;

import com.gentlehu.hblog.mapper.TagMapper;
import com.gentlehu.hblog.pojo.Tag;
import com.gentlehu.hblog.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gentle-hu on 2017/12/8 15:42.
 * Email:gentle-hu@qq.com
 */
@Service("tagService")
public class TagServiceImpl implements ITagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public void insert(String name) {
        Tag tag = new Tag();
        tag.setName(name);
        tagMapper.insert(tag);
    }

    @Override
    public void update(int id, String name) {
        Tag tag = new Tag();
        tag.setId(id);
        tag.setName(name);
        tagMapper.update(tag);
    }

    @Override
    public void delete(int id) {
        tagMapper.delete(id);
    }

    @Override
    public Tag findById(int id) {
        return tagMapper.findById(id);
    }
}
