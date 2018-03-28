package com.ycj.vip_manage.function.impl;

import static com.ycj.vip_manage.common.SystemUtil.*;

import com.ycj.vip_manage.common.SystemException;

import com.ycj.vip_manage.dao.UserDao;
import com.ycj.vip_manage.entity.UserEntity;
import com.ycj.vip_manage.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PROJECT_NAME:vip_look
 * PACKAGE_NAME:com.ycj.vip_manage.function.impl
 * USER:Frank
 * DATE:2018/3/12
 * TIME:22:59
 * DAY_NAME_FULL:星期一
 * DESCRIPTION:On the description and function of the document
 **/

@Service
public class UserFunciontImpl implements UserFunction {
    @Autowired
    UserDao userDao;

    @Override
    public UserEntity login(String account, String password) throws Exception {


        account= $("账号不能为空！",account);
        password= $("密码不能为空！",password);

        UserEntity u=userDao.select("account",account);
        if (u==null){
            throw new SystemException("账号不存在！"+account);
        }
        if (!u.getPassword().equals(password)){
            throw new SystemException("密码错误！");
        }
        return u;
    }

    @Override
    public UserEntity updatepassword(String id,String oldpassword, String newpassword, String comfirmpassword) throws Exception {

        /**
         * 验证参数
         * 找到用户
         * 验证旧密码
         * 更新密码
         */
        id=$("id不能为空",id);
        oldpassword=$("旧密码不能为空",oldpassword);
        newpassword=$("新密码不能为空",newpassword);
        comfirmpassword=$("确认密码不能为空",comfirmpassword);

        assertNotEquals("新密码和旧密码不能一样！",oldpassword,newpassword);
        assertEquals("两次密码不一致！",newpassword,comfirmpassword);
        UserEntity uu=userDao.select("id",id);
        assertNotNull("无法找到用户",uu);
        assertEquals("旧密码不正确！",uu.getPassword(),oldpassword);


        uu.setPassword(comfirmpassword);
        userDao.update(uu);


        return uu;
    }
}
