package com.clouddes.dao;

import com.clouddes.entity.CsdnBlog;

import java.sql.*;

/**
 * 数据库入库
 *
 * @author 搬砖工qlw
 * @date 2018/12/17 22:07
 */
public class CsdnBlogDao {
    private Connection conn = null;
    private Statement stmt = null;

    public CsdnBlogDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/spider?user=root&password=qingliwei0630";
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) { // 关闭声明
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) { // 关闭连接对象
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //数据库入库
    public int add(CsdnBlog csdnBlog) {
        try {
            String sql = "INSERT INTO `spider`.`csdnblog` (`id`, `title`, `date`, `tags`, `category`, `view`, `comments`, `copyright`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, csdnBlog.getId());
            ps.setString(2, csdnBlog.getTitle());
            ps.setString(3, csdnBlog.getDate());
            ps.setString(4, csdnBlog.getTags());
            ps.setString(5, csdnBlog.getCategory());
            ps.setInt(6, csdnBlog.getView());
            ps.setInt(7, csdnBlog.getComments());
            ps.setInt(8, csdnBlog.getCopyright());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

}
