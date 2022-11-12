package com.coolk1ng;

import com.coolk1ng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusStarterApplicationTests {

    @Autowired
    private UserService userService;

}
