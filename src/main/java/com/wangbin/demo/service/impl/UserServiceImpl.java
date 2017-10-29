package com.wangbin.demo.service.impl;

import com.wangbin.demo.dao.UserMapper;
import com.wangbin.demo.entity.User;
import com.wangbin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 操作用户实现业务层接口的实现类.
 * Created by wangbin on 2017/10/29.
 */
@Component
public class UserServiceImpl implements UserService {


    //依赖注入
    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户信息.
     *
     * @return 用户信息
     */
    @Override
    public User getUserInfo(String name) {
        return userMapper.selectUserByName(name);
    }
}
