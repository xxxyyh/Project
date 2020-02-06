package com.threebody.goods.entity;

public class GoodsPhoto {
    private Integer gpid;

    private Integer goodsid;

    private String gphotocode;

    public Integer getGpid() {
        return gpid;
    }

    public void setGpid(Integer gpid) {
        this.gpid = gpid;
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