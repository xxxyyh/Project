package com.threebody.orders.entity;

import java.io.Serializable;

public class UserAddress implements Serializable{
    private Integer useraddressid;

    private Integer userid;

    private String useraddr;

    private String usertel;

    private String userconsignee;

    public Integer getUseraddressid() {
        return useraddressid;
    }

    public void setUseraddressid(Integer useraddressid) {
        this.useraddressid = useraddressid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr == null ? null : useraddr.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUserconsignee() {
        return userconsignee;
    }

    public void setUserconsignee(String userconsignee) {
        this.userconsignee = userconsignee == null ? null : userconsignee.trim();
    }
}