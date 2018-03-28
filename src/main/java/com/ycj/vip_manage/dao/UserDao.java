package com.ycj.vip_manage.dao;

import com.ycj.vip_manage.common.AbstractDao;
import com.ycj.vip_manage.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * PROJECT_NAME:vip_look
 * PACKAGE_NAME:com.ycj.vip_manage.dao
 * USER:Frank
 * DATE:2018/3/12
 * TIME:22:26
 * DAY_NAME_FULL:星期一
 * DESCRIPTION:On the description and function of the document
 **/


public interface UserDao extends AbstractDao<UserEntity> {
    //public UserEntity getUserByAccount(@Param("account") String account)throws Exception;
}
