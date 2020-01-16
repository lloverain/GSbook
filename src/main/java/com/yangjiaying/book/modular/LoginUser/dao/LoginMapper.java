package com.yangjiaying.book.modular.LoginUser.dao;

import com.yangjiaying.book.modular.LoginUser.entity.User;
import com.yangjiaying.book.modular.LoginUser.entity.bookinfo;
import com.yangjiaying.book.modular.LoginUser.entity.categoryinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LoginMapper {
    /**
     * 根据账户密码验证登录
     *
     * @param user
     * @param password
     * @return
     */
    @Select("select * from admininfo where ALoginID = #{ALoginID} and ALoginPsw = #{ALoginPsw}")
    List<User> Login(@Param("ALoginID") String user
            , @Param("ALoginPsw") String password);

    /**
     * 查询书的种类
     *
     * @return
     */
    @Select("select * from categoryinfo")
    List<categoryinfo> bookzl();

    /**
     * 根据CID删除图书种类
     *
     * @param CID
     * @return
     */
    @Delete("delete from categoryinfo where CID = #{CID}")
    boolean deletebookzl(@Param("CID") int CID);

    /**
     * 添加图书种类
     *
     * @param bookname
     * @return
     */
    @Insert("insert into categoryinfo(CName) values(#{CName})")
    boolean addbookzl(@Param("CName") String bookname);

    /**
     * 查询所有图书
     * @return
     */
    @Select("select * from bookinfo")
    List<bookinfo> booklist();

    /**
     * 插入图书
     * @param bookinfo
     * @return
     */
    @Insert("insert into bookinfo(BTitle,BAuthor,BPrice,BCategoryID,BPublisher,BPhoto)values(#{BTitle},#{BAuthor},#{BPrice},#{BCategoryID},#{BPublisher},#{BPhoto})")
    boolean addbookinfo(bookinfo bookinfo);

    /**
     * 根据BID删除图书
     * @param BID
     * @return
     */
    @Delete("delete from bookinfo where BID = #{BID}")
    boolean deletebookinfo(@Param("BID") int BID);
}
