package com.threebody.useraddress.entity;

import java.util.Date;

public class Admins {
    private Integer adminid;

    private String adminaccount;

    private String adminpetname;

    private String adminpassword;

    private String adminidentify;

    private Integer admingrade;

    private String adminstate;

    private String admintel;

    private String adminidcard;

    private String adminemail;

    private Integer adminage;

    private Date adminbirth;

    private String adminicon;

    private Integer adminintegral;

    private Date adminlogintime;

    private Date adminregistertime;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpetname() {
        return adminpetname;
    }

    public void setAdminpetname(String adminpetname) {
        this.adminpetname = adminpetname == null ? null : adminpetname.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdminidentify() {
        return adminidentify;
    }

    public void setAdminidentify(String adminidentify) {
        this.adminidentify = adminidentify == null ? null : adminidentify.trim();
    }

    public Integer getAdmingrade() {
        return admingrade;
    }

    public void setAdmingrade(Integer admingrade) {
        this.admingrade = admingrade;
    }

    public String getAdminstate() {
        return adminstate;
    }

    public void setAdminstate(String adminstate) {
        this.adminstate = adminstate == null ? null : adminstate.trim();
    }

    public String getAdmintel() {
        return admintel;
    }

    public void setAdmintel(String admintel) {
        this.admintel = admintel == null ? null : admintel.trim();
    }

    public String getAdminidcard() {
        return adminidcard;
    }

    public void setAdminidcard(String adminidcard) {
        this.adminidcard = adminidcard == null ? null : adminidcard.trim();
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
    }

    public Integer getAdminage() {
        return adminage;
    }

    public void setAdminage(Integer adminage) {
        this.adminage = adminage;
    }

    public Date getAdminbirth() {
        return adminbirth;
    }

    public void setAdminbirth(Date adminbirth) {
        this.adminbirth = adminbirth;
    }

    public String getAdminicon() {
        return adminicon;
    }

    public void setAdminicon(String adminicon) {
        this.adminicon = adminicon == null ? null : adminicon.trim();
    }

    public Integer getAdminintegral() {
        return adminintegral;
    }

    public void setAdminintegral(Integer adminintegral) {
        this.adminintegral = adminintegral;
    }

    public Date getAdminlogintime() {
        return adminlogintime;
    }

    public void setAdminlogintime(Date adminlogintime) {
        this.adminlogintime = adminlogintime;
    }

    public Date getAdminregistertime() {
        return adminregistertime;
    }

    public void setAdminregistertime(Date adminregistertime) {
        this.adminregistertime = adminregistertime;
    }
}