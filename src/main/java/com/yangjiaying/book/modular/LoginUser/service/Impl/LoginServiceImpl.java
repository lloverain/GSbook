package com.yangjiaying.book.modular.LoginUser.service.Impl;

import com.yangjiaying.book.modular.LoginUser.dao.LoginMapper;
import com.yangjiaying.book.modular.LoginUser.entity.User;
import com.yangjiaying.book.modular.LoginUser.entity.bookinfo;
import com.yangjiaying.book.modular.LoginUser.entity.categoryinfo;
import com.yangjiaying.book.modular.LoginUser.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName:com.yangjiaying.book.modular.LoginUser.service.Impl
 * @ClassName:LoginServiceImpl
 * @author:yangjiaying
 * @date 2020/1/9 13:26
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public List<User> Login(String user, String password) {
        return loginMapper.Login(user, password);
    }

    @Override
    public List<categoryinfo> bookzl() {
        return loginMapper.bookzl();
    }

    @Override
    public boolean deletebookzl(int CID) {
        return loginMapper.deletebookzl(CID);
    }

    @Override
    public boolean addbookzl(String bookname) {
        return loginMapper.addbookzl(bookname);
    }

    @Override
    public List<bookinfo> booklist() {
        return loginMapper.booklist();
    }

    @Override
    public boolean addbookinfo(bookinfo bookinfo) {
        return loginMapper.addbookinfo(bookinfo);
    }

    @Override
    public boolean deletebookinfo(int BID) {
        return loginMapper.deletebookinfo(BID);
    }
}
