package com.web.player.service.user;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.web.player.dao.mybatis.UserDao;
import com.web.player.model.User;
import com.web.player.util.MybatisUtils;

public class UserService {

    public void insert(User user) {
        SqlSessionFactory factory = MybatisUtils.createSqlSessionFactory();
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        userDao.insert(user);
    }
}
