package com.threebody.admins.entity;

public class GoodsPhoto {
    private Integer goodsid;

    private String gphotocode;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGphotocode() {
        return gphotocode;
    }

    public void setGphotocode(String gphotocode) {
        this.gphotocode = gphotocode == null ? null : gphotocode.trim();
    }
}