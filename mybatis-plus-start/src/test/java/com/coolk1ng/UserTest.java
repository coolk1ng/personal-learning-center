package com.coolk1ng;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coolk1ng.entity.User;
import com.coolk1ng.entity.vo.UserVO;
import com.coolk1ng.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author coolk1ng
 * @since 2022/10/29 21:59
 */
@SpringBootTest
public class UserTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void userInfoAddDeptName() {
        UserVO userVO = userService.getOneUser(1);
        LOGGER.info("添加部门名称后的用户信息:{}", userVO);
    }

    @Test
    public void getOneUser() {
        User user = new User();
        System.out.println(user.selectById(1));
    }

    @Test
    public void getUserPage() {
        User user = new User();
        Page<User> page = Page.of(2, 2);
        Page<User> userPage = user.selectPage(page, null);
        userPage.getRecords().forEach(System.out::println);
    }
}
