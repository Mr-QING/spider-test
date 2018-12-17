package com.clouddes.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 實體類
 *
 * @author 搬砖工qlw
 * @date 2018/12/18 0:41
 */
@Data
@ToString
public class DmzjAnimation {
    private int id;
    private String hahawebname;// 标题
    private String antag;//动画种类
    private String japanname;//日文名
    private String allname;//别名
    private String year;//播放时间
    private String state;//播放状态
    private String tag;//类型
    private String original;//原作
    private String screenwriter;//监督
    private String company;//制作公司
    private String website;//官网
    private String content;//剧情简介
    private String contentdetail;//剧情简介
    private String goal;//评分
    private String mentotal;//评分人数
    private String url;//相关url

}
