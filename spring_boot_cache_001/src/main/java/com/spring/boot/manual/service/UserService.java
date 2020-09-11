package com.spring.boot.manual.service;

import com.spring.boot.manual.pojo.User;

/**
 * @author mortal
 * @since 2020-08-13
 */
public interface UserService {
    User getUser();

    User UpdateUser();

    User updateUserInnerUser();

    User innsupdate();
}
