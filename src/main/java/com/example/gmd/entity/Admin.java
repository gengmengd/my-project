package com.example.gmd.entity;

public class Admin {
    private  int adid;
    private  String adnum,adpwd,adna;

    public Admin(String adnum, String adpwd) {
        this.adnum = adnum;
        this.adpwd = adpwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adid=" + adid +
                ", adnum='" + adnum + '\'' +
                ", adpwd='" + adpwd + '\'' +
                ", adna='" + adna + '\'' +
                '}';
    }

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public String getAdnum() {
        return adnum;
    }

    public void setAdnum(String adnum) {
        this.adnum = adnum;
    }

    public String getAdpwd() {
        return adpwd;
    }

    public void setAdpwd(String adpwd) {
        this.adpwd = adpwd;
    }

    public String getAdna() {
        return adna;
    }

    public void setAdna(String adna) {
        this.adna = adna;
    }
}
