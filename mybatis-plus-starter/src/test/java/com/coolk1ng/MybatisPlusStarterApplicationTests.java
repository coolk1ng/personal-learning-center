package com.coolk1ng;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.coolk1ng.pojo.entity.User;
import com.coolk1ng.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusStarterApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void getUserListByAllEq() {
        User user = new User();
        user.setName("张三");
        user.setAge(11);
        System.out.println(userService.getUserListByAllEq(user));
    }

    @Test
    void getUserByEq() {
        User user = new User();
        System.out.println(userService.getUserByEq("张三"));
    }

    @Test
    void getUserPage() {
        User user = new User();
        user.setAge(10);
        IPage<User> userPage = userService.getUserPage(user);
        userPage.getRecords().forEach(System.out::println);
    }
}
