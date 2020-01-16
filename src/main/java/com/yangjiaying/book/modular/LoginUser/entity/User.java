package com.yangjiaying.book.modular.LoginUser.entity;

/**
 * @PackageName:com.yangjiaying.book.modular.LoginUser.dao
 * @ClassName:User
 * @author:yangjiaying
 * @date 2020/1/9 13:15
 */
public class User {
    private int AID;
    private String ALoginID;
    private String ALoginPsw;
    private String AName;

    @Override
    public String toString() {
        return "User{" +
                "AID=" + AID +
                ", ALoginID='" + ALoginID + '\'' +
                ", ALoginPsw='" + ALoginPsw + '\'' +
                ", AName='" + AName + '\'' +
                '}';
    }

    public int getAID() {
        return AID;
    }

    public void setAID(int AID) {
        this.AID = AID;
    }

    public String getALoginID() {
        return ALoginID;
    }

    public void setALoginID(String ALoginID) {
        this.ALoginID = ALoginID;
    }

    public String getALoginPsw() {
        return ALoginPsw;
    }

    public void setALoginPsw(String ALoginPsw) {
        this.ALoginPsw = ALoginPsw;
    }

    public String getAName() {
        return AName;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }
}
