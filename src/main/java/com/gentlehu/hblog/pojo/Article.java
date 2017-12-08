package com.gentlehu.hblog.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by gentle-hu on 2017/12/6 0:09.
 * Email:gentle-hu@qq.com
 */
@Data
public class Article {
    public Integer id;
    public String title;
    public String content; //markdown style
    public Date postdate;
    public List<Tag> tags;

}
