package com.wangbin.demo.dao;

import com.wangbin.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 访问数据库表dao.
 * Created by wangbin on 2017/10/29.
 */
@Mapper  //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {

    /**
     * 通过用户名查询用户信息.
     *
     * @param name 用户名
     * @return User 用户信息
     */
    User selectUserByName(String name);
}
