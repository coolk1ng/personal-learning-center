package com.coolk1ng.jpa;

import com.coolk1ng.jpa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest()
class SpringDataJpaStarterApplicationTests {

    @Autowired
    private UserService userService;

	@Test
	void getUserList() {
        System.out.println(userService.getUserList());
    }

    @Test
    void getUserByGender() {
        System.out.println(userService.getUserByGender(0));
    }

}
