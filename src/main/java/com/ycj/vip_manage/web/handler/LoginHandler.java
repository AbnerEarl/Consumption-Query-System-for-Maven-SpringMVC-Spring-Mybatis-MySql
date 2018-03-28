package com.ycj.vip_manage.web.handler;

import com.ycj.vip_manage.common.SystemException;
import com.ycj.vip_manage.entity.UserEntity;
import com.ycj.vip_manage.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * PROJECT_NAME:vip_look
 * PACKAGE_NAME:com.ycj.vip_manage.web
 * USER:Frank
 * DATE:2018/3/11
 * TIME:19:43
 * DAY_NAME_FULL:星期日
 * DESCRIPTION:On the description and function of the document
 **/

@Controller
public class LoginHandler {

    @Autowired
    UserFunction fun;

    @RequestMapping("/login.do")
    public String login(String account, String password, HttpServletRequest request){

        try {
            UserEntity u = fun.login(account,password);
            HttpSession session=request.getSession();
            session.setAttribute("currentUser",u);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message",e.getMessage());

            return "forward:/login.jsp";
        }

        return "redirect:/index.do";
    }

    @RequestMapping("/index.do")
    public String index(){
        return "index";
    }


    @RequestMapping("/welcome.do")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/logout.do")
    public String logout(HttpSession session){
        /*
        让session失效
         */
        session.invalidate();
        return "redirect:login.jsp";
    }


    @RequestMapping(method = RequestMethod.GET,path="/updatepasswordview.do")
    public String updatepasswordview(){
        return "updatepassword";
    }

    @RequestMapping(method = RequestMethod.POST,path="/updatepassword.do")
    public String updatepassword(String oldPassword,String newPassword,String newPasswordConfirm,HttpServletRequest request)throws Exception{
        HttpSession session=request.getSession();
        UserEntity us=(UserEntity) session.getAttribute("currentUser");

        try {
            fun.updatepassword(us.getId(),oldPassword,newPassword,newPasswordConfirm);
        }catch (SystemException e){
            session.setAttribute("message",e.toString());
            return "updatepassword";

        }
        session.setAttribute("message","密码修改成功，请重新登录！");

        return "redirect:/login.jsp";
    }

}
