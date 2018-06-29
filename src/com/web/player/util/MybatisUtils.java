package com.web.player.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.web.player.dao.jdbc.UserDao;

public class MybatisUtils {

    String userName = "yuanyi";
    String password = "123456";
    public static SqlSessionFactory createSqlSessionFactory() {
        DataSource dataSource = new MybatisDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(UserDao.class);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(configuration);
        return factory;
    }
    
    private static class MybatisDataSource implements DataSource{
        
        public static DataSource createDataSource() {
            return new MybatisDataSource();
        }

        @Override
        public PrintWriter getLogWriter() throws SQLException {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void setLogWriter(PrintWriter out) throws SQLException {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setLoginTimeout(int seconds) throws SQLException {
            // TODO Auto-generated method stub
            
        }

        @Override
        public int getLoginTimeout() throws SQLException {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public <T> T unwrap(Class<T> iface) throws SQLException {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean isWrapperFor(Class<?> iface) throws SQLException {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Connection getConnection() throws SQLException {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Connection getConnection(String username, String password) throws SQLException {
            // TODO Auto-generated method stub
            String url = "jdbc:mysql://localhost:3306/first?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true";
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        
    }
    
    /*public static SqlSessionFactory createSqlSessionFactory() throws IOException {
        String resource = "com/web/player/util/mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        return factory;
    }*/
}
