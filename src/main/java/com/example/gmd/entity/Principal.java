package com.example.gmd.entity;

public class Principal {
    private int prinid;
    private String prinnum,prinpwd,prinna;

    public Principal(String prinnum, String prinpwd) {
        this.prinnum = prinnum;
        this.prinpwd = prinpwd;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "prinid=" + prinid +
                ", prinnum='" + prinnum + '\'' +
                ", prinpwd='" + prinpwd + '\'' +
                ", prinna='" + prinna + '\'' +
                '}';
    }

    public int getPrinid() {
        return prinid;
    }

    public void setPrinid(int prinid) {
        this.prinid = prinid;
    }

    public String getPrinnum() {
        return prinnum;
    }

    public void setPrinnum(String prinnum) {
        this.prinnum = prinnum;
    }

    public String getPrinpwd() {
        return prinpwd;
    }

    public void setPrinpwd(String prinpwd) {
        this.prinpwd = prinpwd;
    }

    public String getPrinna() {
        return prinna;
    }

    public void setPrinna(String prinna) {
        this.prinna = prinna;
    }
}
