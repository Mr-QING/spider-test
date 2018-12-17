package com.clouddes.dao;

import com.clouddes.entity.DmzjAnimation;

import java.sql.*;

/**
 * 測試類
 *
 * @author 搬砖工qlw
 * @date 2018/12/18 0:44
 */
public class DmzjAnimationDao {
    private Connection conn = null;
    private Statement stmt = null;

    public  DmzjAnimationDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //spider是数据库，用户名，密码，数据格式，要自己配置自己的
            String url = "jdbc:mysql://localhost:3306/spider?user=root&password=xiemo&useUnicode=true&characterEncoding=UTF8";
            conn = (Connection) DriverManager.getConnection(url);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("连接数据库成功");
    }

    public int add(DmzjAnimation dmzjAnimation) {
        try {
            //dmzjAnimation是表名
            String sql = "INSERT INTO `spider`.`dmzjAnimation` (`id`,`hahawebname`,`antag`,`japanname`, `allname`, `year`,`state`,`tag`, `original`,`screenwriter`,`company`, `website`, `content`,`contentdetail`,`goal`,`mentotal`,`url`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dmzjAnimation.getId());
            ps.setString(2, dmzjAnimation.getHahawebname());
            ps.setString(3, dmzjAnimation.getAntag());
            ps.setString(4, dmzjAnimation.getJapanname());
            ps.setString(5, dmzjAnimation.getAllname());
            ps.setString(6, dmzjAnimation.getYear());
            ps.setString(7, dmzjAnimation.getState());
            ps.setString(8, dmzjAnimation.getTag());
            ps.setString(9, dmzjAnimation.getOriginal());
            ps.setString(10, dmzjAnimation.getScreenwriter());
            ps.setString(11, dmzjAnimation.getCompany());
            ps.setString(12, dmzjAnimation.getWebsite());
            ps.setString(13, dmzjAnimation.getContent());
            ps.setString(14, dmzjAnimation.getContentdetail());
            ps.setString(15, dmzjAnimation.getGoal());
            ps.setString(16, dmzjAnimation.getMentotal());
            ps.setString(17, dmzjAnimation.getUrl());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
