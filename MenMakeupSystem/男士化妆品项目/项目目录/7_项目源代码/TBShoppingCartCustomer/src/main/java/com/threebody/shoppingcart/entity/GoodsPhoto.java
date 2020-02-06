package com.threebody.shoppingcart.entity;

public class GoodsPhoto {
    private Integer gphotoid;

    private Integer goodsid;

    private String gphotocode;

    public Integer getGphotoid() {
        return gphotoid;
    }

    public void setGphotoid(Integer gphotoid) {
        this.gphotoid = gphotoid;
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