package com.coolk1ng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coolk1ng.entity.Dept;
import com.coolk1ng.entity.User;
import com.coolk1ng.entity.vo.UserVO;
import com.coolk1ng.mapper.UserMapper;
import com.coolk1ng.service.DeptService;
import com.coolk1ng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xin.altitude.cms.common.util.EntityUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 书籍(User)ServiceImpl
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private DeptService deptService;

    @Override
    public UserVO getOneUser(Integer userId) {
        LambdaQueryWrapper<User> lambdaQuery = Wrappers.lambdaQuery(User.class).eq(User::getUserId, userId);
        UserVO userVO = EntityUtils.toObj(getOne(lambdaQuery), UserVO::new);
        // 从其他表查询信息封装vo
        Optional.ofNullable(userVO).ifPresent(this::addDeptNameInfo);
        return userVO;
    }


    /**
     * 设置部门名称信息
     * @param userVO
     * @return void
     */
    private void addDeptNameInfo(UserVO userVO) {
        LambdaQueryWrapper<Dept> lambdaQuery = Wrappers.lambdaQuery(Dept.class).eq(Dept::getDeptId, userVO.getDeptId());
        Dept dept = deptService.getOne(lambdaQuery);
        Optional.ofNullable(dept).ifPresent(item -> userVO.setDepName(item.getDeptName()));
    }
}
