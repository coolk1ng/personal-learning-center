package com.coolk1ng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coolk1ng.mapper.UserMapper;
import com.coolk1ng.pojo.entity.User;
import com.coolk1ng.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * UserServiceImpl
 *
 * @author coolk1ng
 * @since 2022/9/16 01:47
 */
@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> getUserListByAllEq(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        map.put("age", user.getAge());
        map.put("user_id", "");
        queryWrapper.allEq(map, false);
        return baseMapper.selectList(queryWrapper);
    }
}
