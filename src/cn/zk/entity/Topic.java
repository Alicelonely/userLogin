package cn.zk.entity;

import java.io.Serializable;

public class Topic implements Serializable {

    private int tId;
    private String tTitle;
    private String tContext;
    private String pTime;
    private int uId;
    private int bId;
    private String tPic;

    public Topic() {
    }

    public Topic(String tTitle, String tContext, String pTime, String tPic) {
        this.tTitle = tTitle;
        this.tContext = tContext;
        this.pTime = pTime;
        this.tPic = tPic;
    }

    public Topic(int tId, String tTitle, String tContext, String pTime, int uId, int bId, String tPic) {
        this.tId = tId;
        this.tTitle = tTitle;
        this.tContext = tContext;
        this.pTime = pTime;
        this.uId = uId;
        this.bId = bId;
        this.tPic = tPic;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public String gettContext() {
        return tContext;
    }

    public void settContext(String tContext) {
        this.tContext = tContext;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String gettPic() {
        return tPic;
    }

    public void settPic(String tPic) {
        this.tPic = tPic;
    }
}
