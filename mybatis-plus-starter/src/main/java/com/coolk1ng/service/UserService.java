package com.coolk1ng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coolk1ng.pojo.entity.User;

import java.util.List;

/**
 * UserService
 *
 * @author coolk1ng
 * @since 2022/9/16 01:46
 */
public interface UserService extends IService<User> {

    List<User> getUserListByAllEq(User user);
}
