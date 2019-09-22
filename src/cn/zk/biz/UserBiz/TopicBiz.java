package cn.zk.biz.UserBiz;

import cn.zk.biz.ItopicBiz;
import cn.zk.dao.ItopicDao;
import cn.zk.dao.impl.TopicDao;
import cn.zk.entity.Topic;

import java.util.List;

public class TopicBiz implements ItopicBiz {
    ItopicDao itopicDao = new TopicDao();

    @Override
    public List<Topic> getAllTopic() {
        return itopicDao.getAllTopic();
    }
}
