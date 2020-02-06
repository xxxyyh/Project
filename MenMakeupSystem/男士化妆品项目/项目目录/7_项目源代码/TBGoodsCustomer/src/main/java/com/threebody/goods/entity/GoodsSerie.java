package com.threebody.goods.entity;

public class GoodsSerie {
    private Integer gsid;

    private String gsname;

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    public String getGsname() {
        return gsname;
    }

    public void setGsname(String gsname) {
        this.gsname = gsname == null ? null : gsname.trim();
    }
}