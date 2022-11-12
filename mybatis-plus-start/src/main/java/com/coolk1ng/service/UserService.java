package com.coolk1ng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coolk1ng.entity.User;
import com.coolk1ng.entity.vo.UserVO;

/**
 * 书籍(User)Service
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
public interface UserService extends IService<User> {

    /** 
     * 查询一名用户 (一名用户对应一个部门)
     * @param userId 
     * @return UserVO
     */
    UserVO getOneUser(Integer userId);

}
