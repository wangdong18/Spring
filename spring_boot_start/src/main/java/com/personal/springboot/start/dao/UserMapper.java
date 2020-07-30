package com.personal.springboot.start.dao;

import com.personal.springboot.start.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findById(Long id);
}
