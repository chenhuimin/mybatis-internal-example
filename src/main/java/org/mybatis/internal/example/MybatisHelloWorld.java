package org.mybatis.internal.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.internal.example.pojo.User;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by selina on 2018/4/3.
 */
public class MybatisHelloWorld {
    public static void main(String[] args) {
        String resource = "org/mybatis/internal/example/Configuration.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sessionFactory.openSession();
            User user = (User) session.selectOne("org.mybatis.internal.example.mapper.UserMapper.getUser", 1);
            System.out.println(user.getLfPartyId() + "," + user.getPartyName());
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
