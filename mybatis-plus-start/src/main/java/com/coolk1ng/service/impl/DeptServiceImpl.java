package com.coolk1ng.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coolk1ng.entity.User;
import com.coolk1ng.entity.vo.DeptVO;
import com.coolk1ng.mapper.DeptMapper;
import com.coolk1ng.entity.Dept;
import com.coolk1ng.service.DeptService;
import com.coolk1ng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 部门(Dept)ServiceImpl
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
@Service("deptService")
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

    @Autowired
    private UserService userService;

    @Override
    public List<DeptVO> listDeptInfo() {
        List<Dept> deptList = this.list();
        List<DeptVO> deptVOList = deptList.stream().map(DeptVO::new).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(deptVOList)) {
            this.addDeptInfo(deptVOList);
        }
        return deptVOList;
    }

    private void addDeptInfo(List<DeptVO> list) {
        // 拿到deptId集合
        Set<Long> DeptIdList = list.stream().map(Dept::getDeptId).collect(Collectors.toSet());
        // 查询用户信息
        List<User> userList = userService.list(Wrappers.lambdaQuery(User.class).in(User::getDeptId, DeptIdList));
        Map<Long, List<User>> map = userList.stream().collect(Collectors.groupingBy(User::getDeptId));
        list.forEach(item -> item.setUserList(map.get(item.getDeptId())));
    }
}
