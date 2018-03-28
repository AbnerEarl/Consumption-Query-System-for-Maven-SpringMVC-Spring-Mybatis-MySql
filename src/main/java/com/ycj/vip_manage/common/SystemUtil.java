package com.ycj.vip_manage.common;

/**
 * PROJECT_NAME:vip_look
 * PACKAGE_NAME:com.ycj.vip_manage.common
 * USER:Frank
 * DATE:2018/3/12
 * TIME:23:24
 * DAY_NAME_FULL:星期一
 * DESCRIPTION:On the description and function of the document
 **/
public class SystemUtil {
    public static String throwIfBlank(String message,String target){
        if (target==null||(target=target.trim()).length()==0){
            throw new SystemException(message);
        }
        return target;
    }

    public static String $(String message,String target){
        return throwIfBlank(message,target);
    }

    public static void assertNotNull(String message,Object o){
        if (o==null){
            throw  new SystemException(message);
        }
    }

    public static void assertEquals(String message,Object a,Object b){
        if (a==null?a!=b:!a.equals(b)){
            throw new SystemException(message);
        }
    }

    public static void assertNotEquals(String message,Object a,Object b){
        if (a==null?a==b:a.equals(b)){
            throw new SystemException(message);
        }
    }

}
