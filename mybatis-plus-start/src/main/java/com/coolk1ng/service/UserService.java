package com.coolk1ng.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
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

    /**
     * allEq
     * @param user
     * @return List<User>
     */
    List<User> getUserListByAllEq(User user);

    /**
     * eq
     * @param name
     * @return String
     */
    User getUserByEq(String name);

    /**
     * page
     * @param user
     * @return IPage<User>
     */
    IPage<User> getUserPage(User user);

    /**
     * in
     * @param ids
     * @return List<User>
     */
    List<User> getUserListByIn(String ids);
}
