package com.threebody.shoppingcart.entity;

import java.util.Date;

public class GoodsEvaluation {
    private Integer gevaid;

    private Integer goodsid;

    private String gevatext;

    private Integer userid;

    private Integer gevalevel;

    private Date gevadate;

    public Integer getGevaid() {
        return gevaid;
    }

    public void setGevaid(Integer gevaid) {
        this.gevaid = gevaid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGevatext() {
        return gevatext;
    }

    public void setGevatext(String gevatext) {
        this.gevatext = gevatext == null ? null : gevatext.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGevalevel() {
        return gevalevel;
    }

    public void setGevalevel(Integer gevalevel) {
        this.gevalevel = gevalevel;
    }

    public Date getGevadate() {
        return gevadate;
    }

    public void setGevadate(Date gevadate) {
        this.gevadate = gevadate;
    }
}