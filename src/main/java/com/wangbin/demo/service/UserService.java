package com.wangbin.demo.service;

import com.wangbin.demo.entity.User;
import org.springframework.stereotype.Service;

/**
 * 操作用户的业务层接口.
 * Created by wangbin on 2017/10/29.
 */
@Service
public interface UserService {

    /**
     * 通过用户名获取用户信息.
     *
     * @return 用户信息
     * @Param name 用户名
     */
    User getUserInfo(String name);
}
