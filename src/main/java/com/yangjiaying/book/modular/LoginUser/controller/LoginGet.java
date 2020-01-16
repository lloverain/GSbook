package com.yangjiaying.book.modular.LoginUser.controller;

import com.yangjiaying.book.modular.LoginUser.entity.bookinfo;
import com.yangjiaying.book.modular.LoginUser.entity.categoryinfo;
import com.yangjiaying.book.modular.LoginUser.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @PackageName:com.yangjiaying.book.modular.LoginUser.controller
 * @ClassName:LoginGet
 * @author:yangjiaying
 * @date 2020/1/9 12:43
 */
@Controller
public class LoginGet {


    @Autowired
    private LoginService loginService;
    /**
     * 跳转图书分类管理页面
     * @return
     */
    @RequestMapping("/index")
    public String toindex(HttpSession session) {
        System.out.println(session.getAttribute("name"));
        List<categoryinfo> categoryinfoList = loginService.bookzl();
        session.setAttribute("bookzl", categoryinfoList);
        return "index";
    }

    /**
     * 跳转登录
     * @return
     */
    @RequestMapping(value = "/login")
    public String toLogin(){
        return "Login";
    }


    /**
     * 跳转图书管理页面
     * @return
     */
    @RequestMapping(value = "/bookmanagement")
    public String toBookManagement(HttpSession session){
        List<categoryinfo> categoryinfoList = loginService.bookzl();
        List<bookinfo> bookinfoList = loginService.booklist();
        session.setAttribute("bookzl", categoryinfoList);
        session.setAttribute("bookinfo",bookinfoList);
        return "BookManagement";
    }

    @RequestMapping("/zhuye")
    public String tozhuye() {
        return "zhuye";
    }
}
