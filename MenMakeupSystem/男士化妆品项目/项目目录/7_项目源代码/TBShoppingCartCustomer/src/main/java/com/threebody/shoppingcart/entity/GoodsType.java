package com.threebody.shoppingcart.entity;

public class GoodsType {
    private Integer gtypeid;

    private String gtypename;

    public Integer getGtypeid() {
        return gtypeid;
    }

    public void setGtypeid(Integer gtypeid) {
        this.gtypeid = gtypeid;
    }

    public String getGtypename() {
        return gtypename;
    }

    public void setGtypename(String gtypename) {
        this.gtypename = gtypename == null ? null : gtypename.trim();
    }
}