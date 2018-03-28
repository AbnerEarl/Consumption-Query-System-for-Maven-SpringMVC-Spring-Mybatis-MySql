package com.ycj.vip_manage.common;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * PROJECT_NAME:vip_look
 * PACKAGE_NAME:com.ycj.vip_manage.common
 * USER:Frank
 * DATE:2018/3/20
 * TIME:15:01
 * DAY_NAME_FULL:星期二
 * DESCRIPTION:On the description and function of the document
 **/
public interface AbstractDao<T> {
    void insert(T t)throws Exception;
    void update(T t)throws Exception;
    void delete(@Param("key") String ukfield,@Param("value") Object value)throws Exception;
    T select(@Param("key")String ukfield,@Param("value")Object value)throws Exception;
    boolean exsits(@Param("key")String ukfield,@Param("value")Object value)throws Exception;
    List<T> selectLike(@Param("key")String key)throws Exception;
}
