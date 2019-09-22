package cn.zk.dao.impl;

import cn.zk.dao.ItopicDao;
import cn.zk.entity.Topic;
import cn.zk.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicDao extends DBUtil implements ItopicDao {

    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    @Override
    public List<Topic> getAllTopic() {
        List<Topic> ls = new ArrayList();
        conn = getConn();
        String sql = "select * from topic";
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                Topic topic = new Topic(rs.getString("title"),rs.getString("context"),rs.getString("pTime"),rs.getString("pic"));
                ls.add(topic);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ls;
    }
}
