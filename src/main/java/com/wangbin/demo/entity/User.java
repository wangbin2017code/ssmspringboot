package com.wangbin.demo.entity;

/**
 * 用户实体类.
 * Created by wangbin on 2017/10/29.
 */
public class User {

    /**
     * ID 主键.
     */
    private Integer id;

    /**
     * 用户名.
     */
    private String username;

    /**
     * 密码.
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
