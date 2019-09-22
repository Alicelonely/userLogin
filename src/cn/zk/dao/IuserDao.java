package cn.zk.dao;

import cn.zk.entity.User;

public interface IuserDao {

    User userLogin(String uName,String uPass);

}
