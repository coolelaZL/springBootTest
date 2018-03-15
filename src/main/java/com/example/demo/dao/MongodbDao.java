package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongodbDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(User user) {
        this.mongoTemplate.insert(user);
    }

    public void deleteById(int id) {
        Criteria criteria = Criteria.where("id").is(id);
        Query query = new Query(criteria);
        this.mongoTemplate.remove(query, User.class);
    }

    public void update(User User) {
        Criteria criteria = Criteria.where("id").is(User.getId());
        Query query = new Query(criteria);
        Update update = new Update();
        update.set("password", User.getPassword());
        this.mongoTemplate.updateMulti(query, update, User.class);
    }

    public User getById(int id) {
        Criteria criteria = Criteria.where("id").is(id);
        Query query = new Query(criteria);
        return this.mongoTemplate.findOne(query, User.class);
    }

    public List<User> getAll() {
        List<User> userList = this.mongoTemplate.findAll(User.class);
        return userList;
    }

}
