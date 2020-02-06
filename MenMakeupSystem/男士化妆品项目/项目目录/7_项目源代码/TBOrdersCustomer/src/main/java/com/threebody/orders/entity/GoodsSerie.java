package com.threebody.orders.entity;

import java.io.Serializable;

public class GoodsSerie implements Serializable{
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