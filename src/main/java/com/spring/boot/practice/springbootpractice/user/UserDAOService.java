package com.spring.boot.practice.springbootpractice.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hemanthponnuru on 2019-07-30
 */

@Component
public class UserDAOService {

    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1,"User One",new Date()));
        users.add(new User(2,"User Two",new Date()));
        users.add(new User(3,"User Three",new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        for (User user: users) {
            if (id == user.getId()) {
            return user;
            }
        }
        return null;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User delete(int id) {
        for (User user : users) {
            if (id == user.getId()) {
                users.remove(user);
                return user;
            }
        }
        return null;

    }
}

