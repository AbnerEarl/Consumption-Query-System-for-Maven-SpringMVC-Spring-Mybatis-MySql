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
public class SystemException extends RuntimeException {
    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
