package com.xiaxinyu.liquibase;

import com.xiaxinyu.liquibase.model.User;
import com.xiaxinyu.liquibase.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class LiquibaseApplicationTest {
    @Autowired
    IUserService userService;

    @Test
    public void findUser() {
        User user = userService.getById(1);
        log.info(user.toString());
    }
}

