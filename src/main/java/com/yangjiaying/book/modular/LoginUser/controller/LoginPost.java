package com.yangjiaying.book.modular.LoginUser.controller;

import com.yangjiaying.book.modular.LoginUser.entity.User;
import com.yangjiaying.book.modular.LoginUser.entity.bookinfo;
import com.yangjiaying.book.modular.LoginUser.entity.categoryinfo;
import com.yangjiaying.book.modular.LoginUser.service.LoginService;
import com.yangjiaying.book.modular.LoginUser.util.savaFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @PackageName:com.yangjiaying.book.modular.LoginUser.controller
 * @ClassName:LoginPost
 * @author:yangjiaying
 * @date 2020/1/9 13:14
 */
@Controller
public class LoginPost {

    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param request
     * @param response
     * @param session
     * @return
     * @throws IOException
     * @throws ServletException
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException, ServletException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println(user + password);
        List<User> userList = loginService.Login(user, password);
        if (userList.size() != 0) {
            session.setAttribute("name", userList.get(0).getAName());
            Cookie c = new Cookie("name",userList.get(0).getAName());// 新建一个Cookie对象
            c.setMaxAge(5*60);
            c.setPath("/");
            response.addCookie(c);
//            response.sendRedirect(request.getContextPath()+"/index");
            return "/zhuye";
        } else {
//            response.sendRedirect(request.getContextPath()+"/login");
            return "/Login";
        }
    }

    /**
     * 删除种类
     * @param request
     * @return
     */
    @RequestMapping(value = "/deletebookzl",method = RequestMethod.POST)
    @ResponseBody
    public boolean deletebookzl(HttpServletRequest request) {
        int CID = Integer.parseInt(request.getParameter("CID"));
        System.out.println(CID);
        boolean state = loginService.deletebookzl(CID);
//        System.out.println(state);
//        response.setHeader("refresh", "0");//刷新当前网页，不跳转
      return state;
    }

    /**
     * 添加种类
     */
    @RequestMapping(value = "/addbookzl",method = RequestMethod.POST)
    @ResponseBody
    public boolean addbookzl(HttpServletRequest request){
        String bookname = request.getParameter("bookname");
        boolean state = loginService.addbookzl(bookname);
        return state;
    }

    /**
     * 添加图书
     * @param request
     * @return
     */
    @RequestMapping(value = "/addbookinfo",method = RequestMethod.POST)
    @ResponseBody
    public boolean addbookinfo(HttpServletRequest request,@RequestParam("BPhoto") MultipartFile imageFile) throws IOException {
        savaFile savaFile = new savaFile();
        bookinfo bookinfo = new bookinfo();
        bookinfo.setBTitle(request.getParameter("BTitle"));
        bookinfo.setBAuthor(request.getParameter("BAuthor"));
        bookinfo.setBCategoryID(Integer.parseInt(request.getParameter("BCategoryID")));
        bookinfo.setBPrice(Double.parseDouble(request.getParameter("BPrice")));
        bookinfo.setBPublisher(request.getParameter("BPublisher"));
        bookinfo.setBPhoto(imageFile.getOriginalFilename());
        boolean state = false;
        boolean image = false;
            if (!imageFile.isEmpty()) {
                image = savaFile.savePic(imageFile.getInputStream(), request.getParameter("BAuthor"),imageFile.getOriginalFilename());
            }
            if(image){
                 state = loginService.addbookinfo(bookinfo);
            }
        return state;
    }


    @RequestMapping(value = "deletebookinfo",method = RequestMethod.POST)
    @ResponseBody
    public boolean deletebookinfo(HttpServletRequest request){
        int BID = Integer.parseInt(request.getParameter("BID"));
        boolean state = loginService.deletebookinfo(BID);
        return state;
    }

    /**
     * 账户退出
     * @param response
     * @return
     */
    @RequestMapping("/loginout")
    public String tuishu(HttpServletResponse response){
        Cookie cookie = new Cookie("name","delete");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "/Login";
    }
}

