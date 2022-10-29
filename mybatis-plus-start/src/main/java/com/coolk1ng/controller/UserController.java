package com.coolk1ng.controller;


import com.coolk1ng.entity.vo.UserVO;
import com.coolk1ng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 书籍(User)Controller
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getOneUser/{userId}")
    public UserVO getOneUser(@PathVariable("userId") Integer userId) {
        return userService.getOneUser(userId);
    }

}
