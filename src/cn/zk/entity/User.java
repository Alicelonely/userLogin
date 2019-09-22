package cn.zk.entity;

import java.io.Serializable;

public class User implements Serializable {

    private int uId;
    private String uName;
    private String uPass;
    private int uState;
    private int flag;

    public User() {
    }

    public User(String uName) {
        this.uName = uName;
    }

    public User(int uId, String uName, String uPass, int uState, int flag) {
        this.uId = uId;
        this.uName = uName;
        this.uPass = uPass;
        this.uState = uState;
        this.flag = flag;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public int getuState() {
        return uState;
    }

    public void setuState(int uState) {
        this.uState = uState;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
