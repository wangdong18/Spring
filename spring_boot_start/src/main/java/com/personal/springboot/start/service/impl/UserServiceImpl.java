package com.personal.springboot.start.service.impl;

import com.personal.springboot.start.dao.UserMapper;
import com.personal.springboot.start.entity.User;
import com.personal.springboot.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mortal
 * @since 2020-07-28
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findById(Long id) {
        User byId = userMapper.findById(id);
        return byId;
    }
}
