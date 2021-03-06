package com.web.player.service.user;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.web.player.dao.mybatis.UserDao;
import com.web.player.model.User;
import com.web.player.util.MybatisUtils;

public class UserService {

    public boolean insert(User user) throws IOException {
        SqlSessionFactory factory = MybatisUtils.createSqlSessionFactory();
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        userDao.insert(user);
        session.commit();
        session.close();
        return true;
    }
}
