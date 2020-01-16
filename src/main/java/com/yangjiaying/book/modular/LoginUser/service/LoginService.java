package com.yangjiaying.book.modular.LoginUser.service;
import com.yangjiaying.book.modular.LoginUser.entity.User;
import com.yangjiaying.book.modular.LoginUser.entity.bookinfo;
import com.yangjiaying.book.modular.LoginUser.entity.categoryinfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {
    List<User> Login(String user, String password);

    List<categoryinfo> bookzl();

    boolean deletebookzl(int CID);

    boolean addbookzl(String bookname);

    List<bookinfo> booklist();

    boolean addbookinfo(bookinfo bookinfo);

    boolean deletebookinfo(int BID);
}
