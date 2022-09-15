package com.coolk1ng;

import com.coolk1ng.pojo.entity.User;
import com.coolk1ng.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationTargetException;

@SpringBootTest
class MybatisPlusStarterApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void getUserListByAllEq() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        User user = new User();
        user.setName("张三");
        user.setAge(11);
        System.out.println(userService.getUserListByAllEq(user));
    }

}
