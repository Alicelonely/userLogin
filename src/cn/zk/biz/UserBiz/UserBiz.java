package cn.zk.biz.UserBiz;

import cn.zk.biz.IuserBiz;
import cn.zk.dao.IuserDao;
import cn.zk.dao.impl.UserDao;
import cn.zk.entity.User;

public class UserBiz implements IuserBiz {

    IuserDao iuserDao = new UserDao();

    @Override
    public User userLogin(String uName, String uPass) {
        return iuserDao.userLogin(uName,uPass);
    }
}
