package com.coolk1ng.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coolk1ng.base.Result;
import com.coolk1ng.pojo.entity.User;
import com.coolk1ng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * UserController
 *
 * @author coolk1ng
 * @since 2022/9/18 00:15
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getUserList")
    public Result getUserList(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            bindingResult.getAllErrors().forEach(item -> {
                errorList.add(item.getDefaultMessage());
            });
            return Result.fail(errorList);
        }
        return Result.success(userService.list(new QueryWrapper<User>()
                .eq("id",user.getId())
                .eq("user_id",user.getUserId())));
    }
}
