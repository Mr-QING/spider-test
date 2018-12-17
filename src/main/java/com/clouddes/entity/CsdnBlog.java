package com.clouddes.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 数据库实体类
 *
 * @author 搬砖工qlw
 * @date 2018/12/17 21:25
 */
@Data
@ToString
public class CsdnBlog {
    private int id;// 编号

    private String title;// 标题

    private String date;// 日期

    private String tags;// 标签

    private String category;// 分类

    private int view;// 阅读人数

    private int comments;// 评论人数

    private int copyright;// 是否原创

}
