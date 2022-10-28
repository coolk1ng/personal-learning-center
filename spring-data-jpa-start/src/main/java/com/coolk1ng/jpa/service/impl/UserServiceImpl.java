package com.coolk1ng.jpa.service.impl;

import com.coolk1ng.jpa.entity.User;
import com.coolk1ng.jpa.repository.UserRepository;
import com.coolk1ng.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author coolk1ng
 * @since 2022/9/15 02:11
 */
@Service(value = "UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUserByGender(Integer gender) {
        return userRepository.getUserByGender(gender);
    }
}
