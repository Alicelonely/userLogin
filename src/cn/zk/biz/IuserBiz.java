package cn.zk.biz;

import cn.zk.entity.User;

public interface IuserBiz {

    User userLogin(String uName, String uPass);

}
