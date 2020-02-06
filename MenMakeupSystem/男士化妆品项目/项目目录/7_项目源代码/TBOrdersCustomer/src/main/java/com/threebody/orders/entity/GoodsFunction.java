package com.threebody.orders.entity;

import java.io.Serializable;

public class GoodsFunction implements Serializable{
    private Integer gfid;

    private String gfname;

    public Integer getGfid() {
        return gfid;
    }

    public void setGfid(Integer gfid) {
        this.gfid = gfid;
    }

    public String getGfname() {
        return gfname;
    }

    public void setGfname(String gfname) {
        this.gfname = gfname == null ? null : gfname.trim();
    }
}