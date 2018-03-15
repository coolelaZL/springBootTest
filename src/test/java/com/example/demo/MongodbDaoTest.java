package com.example.demo;

import com.example.demo.dao.MongodbDao;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbDaoTest {

    @Autowired
    private MongodbDao mongodbDao;

    @Test
    public void testSet() {
        String key = "name";
        String value = "zhangsan";
        User user = new User();
        user.setId(3);
        user.setBirthday(new Date());
        user.setUsername("niuniu");
        user.setPassword("123456");
        this.mongodbDao.insert(user);
    }

    @Test
    public void testGet() {
        User user = this.mongodbDao.getById(3);
        System.out.println(user);
    }

    @Test
    public void testDelete() {
        this.mongodbDao.deleteById(3);
    }
}