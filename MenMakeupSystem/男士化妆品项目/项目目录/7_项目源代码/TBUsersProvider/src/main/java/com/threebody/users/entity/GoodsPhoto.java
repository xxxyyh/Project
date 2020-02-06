package com.threebody.users.entity;

public class GoodsPhoto {
    private Integer goodsphotoid;

    private Integer goodsid;

    private String gphotocode;

    public Integer getGoodsphotoid() {
        return goodsphotoid;
    }

    public void setGoodsphotoid(Integer goodsphotoid) {
        this.goodsphotoid = goodsphotoid;
    }

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