package com.yangjiaying.book.modular.LoginUser.entity;

/**
 * @PackageName:com.yangjiaying.book.modular.LoginUser.entity
 * @ClassName:bookinfo
 * @author:yangjiaying
 * @date 2020/1/9 14:14
 */
public class categoryinfo {

    private int CID;
    private String CName;

    @Override
    public String toString() {
        return "categoryinfo{" +
                "CID=" + CID +
                ", CName='" + CName + '\'' +
                '}';
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }
}
