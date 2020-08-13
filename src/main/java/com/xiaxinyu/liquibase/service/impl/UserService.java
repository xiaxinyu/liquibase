package com.xiaxinyu.liquibase.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaxinyu.liquibase.mapper.UserMapper;
import com.xiaxinyu.liquibase.model.User;
import com.xiaxinyu.liquibase.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {
}
