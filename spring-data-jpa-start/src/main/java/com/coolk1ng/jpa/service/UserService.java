package com.coolk1ng.jpa.service;

import com.coolk1ng.jpa.entity.User;

import java.util.List;

/**
 * UserService
 *
 * @author coolk1ng
 * @since 2022/9/15 02:19
 */
public interface UserService {

    List<User> getUserList();

    List<User> getUserByGender(Integer gender);
}
