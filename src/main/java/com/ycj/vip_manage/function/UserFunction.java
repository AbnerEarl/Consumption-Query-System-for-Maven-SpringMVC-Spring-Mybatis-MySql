package com.ycj.vip_manage.function;

import com.ycj.vip_manage.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * PROJECT_NAME:vip_look
 * PACKAGE_NAME:com.ycj.vip_manage.function
 * USER:Frank
 * DATE:2018/3/12
 * TIME:22:57
 * DAY_NAME_FULL:星期一
 * DESCRIPTION:On the description and function of the document
 **/
public interface UserFunction {
    /*
    用户登录
     */
    public UserEntity login(String account,String password)throws Exception;


    /*
    修改密码
     */

    @Transactional
    UserEntity updatepassword(String id,String oldpassword,String newpassword,String comfirmpassword)throws Exception;
}
