package cn.zk.dao.impl;

import cn.zk.dao.IuserDao;
import cn.zk.entity.User;
import cn.zk.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends DBUtil implements IuserDao {

    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    @Override
    public User userLogin(String uName, String uPass) {
        User user = null;
        conn = getConn();
        String sql = "select * from user where uName = ? and uPass = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,uName);
            pstm.setString(2,uPass);
            rs = pstm.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString("uName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
