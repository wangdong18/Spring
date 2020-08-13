package com.spring.boot.manual.service.impl;

import com.spring.boot.manual.pojo.User;
import com.spring.boot.manual.service.UserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author mortal
 * @since 2020-08-13
 */
@CacheConfig(cacheNames ="userService")
@Service
public class UserServiceImpl implements UserService {

    @Cacheable(key = "'user'")
    @Override
    public User getUser() {
        System.err.println("get user");
        User user = new User();
        user.setName("zhangsan");
        user.setAge(22);
        return user;

    }

    @CachePut(key = "'user'")
    @Override
    public User UpdateUser() {
        User user = new User();
        user.setName("lisi");
        user.setAge(55);
        return user;
    }

    @CachePut(key = "'user'")
    @Override
    public User updateUserInnerUser() {
       return innsupdate();
    }

//    @CachePut(key = "'user'")
//    @Override
    public User innsupdate() {
        System.err.println("innser update");
        User user = new User();
        user.setName("wangwu");
        user.setAge(19);
        return user;
    }



}
