package com.coolk1ng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coolk1ng.mapper.UserMapper;
import com.coolk1ng.pojo.entity.User;
import com.coolk1ng.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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

    @Override
    public User getUserByEq(String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //queryWrapper.eq(StringUtils.isNotEmpty(user.getUserId()),"user_id","user1");
        queryWrapper.eq(StringUtils.isNotEmpty(name), "name", name);
        return baseMapper.selectOne(queryWrapper);
    }

    @Override
    public IPage<User> getUserPage(User user) {
        // 分页参数
        Page<User> page = Page.of(2, 1);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("age",user.getAge());
        return baseMapper.selectPage(page,queryWrapper);
    }

    @Override
    public List<User> getUserListByIn(String ids) {
        String[] idArr = ids.split(",");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", Arrays.asList(idArr));
        return baseMapper.selectList(queryWrapper);
    }


}
