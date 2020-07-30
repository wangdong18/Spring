package com.personal.springboot.start.service;

import com.personal.springboot.start.entity.User;

/**
 * @author mortal
 * @since 2020-07-28
 */
public interface UserService {
    User findById(Long id);
}
