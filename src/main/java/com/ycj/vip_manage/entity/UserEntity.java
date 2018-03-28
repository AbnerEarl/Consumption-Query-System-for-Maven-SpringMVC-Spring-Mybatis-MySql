package com.ycj.vip_manage.entity;

/**
 * PROJECT_NAME:vip_look
 * PACKAGE_NAME:com.ycj.vip_manage.entity
 * USER:Frank
 * DATE:2018/3/12
 * TIME:22:23
 * DAY_NAME_FULL:星期一
 * DESCRIPTION:On the description and function of the document
 **/
public class UserEntity {
    private String id;
    private String account;
    private String password;
    private String nickname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
