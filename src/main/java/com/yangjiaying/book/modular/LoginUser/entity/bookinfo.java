package com.yangjiaying.book.modular.LoginUser.entity;

/**
 * @PackageName:com.yangjiaying.book.modular.LoginUser.entity
 * @ClassName:bookinfo
 * @author:yangjiaying
 * @date 2020/1/9 15:13
 */
public class bookinfo {
    private int BID;
    private String BTitle;
    private String BAuthor;
    private double BPrice;
    private int BCategoryID;
    private String BPublisher;
    private String BPhoto;

    @Override
    public String toString() {
        return "bookinfo{" +
                "BID=" + BID +
                ", BTitle='" + BTitle + '\'' +
                ", BAuthor='" + BAuthor + '\'' +
                ", BPrice=" + BPrice +
                ", BCategoryID=" + BCategoryID +
                ", BPublisher='" + BPublisher + '\'' +
                ", BPhoto='" + BPhoto + '\'' +
                '}';
    }

    public int getBID() {
        return BID;
    }

    public void setBID(int BID) {
        this.BID = BID;
    }

    public String getBTitle() {
        return BTitle;
    }

    public void setBTitle(String BTitle) {
        this.BTitle = BTitle;
    }

    public String getBAuthor() {
        return BAuthor;
    }

    public void setBAuthor(String BAuthor) {
        this.BAuthor = BAuthor;
    }

    public double getBPrice() {
        return BPrice;
    }

    public void setBPrice(double BPrice) {
        this.BPrice = BPrice;
    }

    public int getBCategoryID() {
        return BCategoryID;
    }

    public void setBCategoryID(int BCategoryID) {
        this.BCategoryID = BCategoryID;
    }

    public String getBPublisher() {
        return BPublisher;
    }

    public void setBPublisher(String BPublisher) {
        this.BPublisher = BPublisher;
    }

    public String getBPhoto() {
        return BPhoto;
    }

    public void setBPhoto(String BPhoto) {
        this.BPhoto = BPhoto;
    }
}
