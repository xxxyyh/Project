package com.threebody.admins.entity;

public class Delivery {
    private String ordersid;

    private String tracknum;

    private String expresscompany;

    public String getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid == null ? null : ordersid.trim();
    }

    public String getTracknum() {
        return tracknum;
    }

    public void setTracknum(String tracknum) {
        this.tracknum = tracknum == null ? null : tracknum.trim();
    }

    public String getExpresscompany() {
        return expresscompany;
    }

    public void setExpresscompany(String expresscompany) {
        this.expresscompany = expresscompany == null ? null : expresscompany.trim();
    }
}