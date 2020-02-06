package com.threebody.orders.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNull() {
            addCriterion("adminAccount is null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNotNull() {
            addCriterion("adminAccount is not null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountEqualTo(String value) {
            addCriterion("adminAccount =", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotEqualTo(String value) {
            addCriterion("adminAccount <>", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThan(String value) {
            addCriterion("adminAccount >", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThanOrEqualTo(String value) {
            addCriterion("adminAccount >=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThan(String value) {
            addCriterion("adminAccount <", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThanOrEqualTo(String value) {
            addCriterion("adminAccount <=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLike(String value) {
            addCriterion("adminAccount like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotLike(String value) {
            addCriterion("adminAccount not like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIn(List<String> values) {
            addCriterion("adminAccount in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotIn(List<String> values) {
            addCriterion("adminAccount not in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountBetween(String value1, String value2) {
            addCriterion("adminAccount between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotBetween(String value1, String value2) {
            addCriterion("adminAccount not between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameIsNull() {
            addCriterion("adminPetName is null");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameIsNotNull() {
            addCriterion("adminPetName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameEqualTo(String value) {
            addCriterion("adminPetName =", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameNotEqualTo(String value) {
            addCriterion("adminPetName <>", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameGreaterThan(String value) {
            addCriterion("adminPetName >", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminPetName >=", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameLessThan(String value) {
            addCriterion("adminPetName <", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameLessThanOrEqualTo(String value) {
            addCriterion("adminPetName <=", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameLike(String value) {
            addCriterion("adminPetName like", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameNotLike(String value) {
            addCriterion("adminPetName not like", value, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameIn(List<String> values) {
            addCriterion("adminPetName in", values, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameNotIn(List<String> values) {
            addCriterion("adminPetName not in", values, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameBetween(String value1, String value2) {
            addCriterion("adminPetName between", value1, value2, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpetnameNotBetween(String value1, String value2) {
            addCriterion("adminPetName not between", value1, value2, "adminpetname");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("adminPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("adminPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("adminPassword =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("adminPassword <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("adminPassword >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adminPassword >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("adminPassword <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("adminPassword <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("adminPassword like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("adminPassword not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("adminPassword in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("adminPassword not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("adminPassword between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("adminPassword not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyIsNull() {
            addCriterion("adminIdentify is null");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyIsNotNull() {
            addCriterion("adminIdentify is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyEqualTo(String value) {
            addCriterion("adminIdentify =", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyNotEqualTo(String value) {
            addCriterion("adminIdentify <>", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyGreaterThan(String value) {
            addCriterion("adminIdentify >", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyGreaterThanOrEqualTo(String value) {
            addCriterion("adminIdentify >=", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyLessThan(String value) {
            addCriterion("adminIdentify <", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyLessThanOrEqualTo(String value) {
            addCriterion("adminIdentify <=", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyLike(String value) {
            addCriterion("adminIdentify like", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyNotLike(String value) {
            addCriterion("adminIdentify not like", value, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyIn(List<String> values) {
            addCriterion("adminIdentify in", values, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyNotIn(List<String> values) {
            addCriterion("adminIdentify not in", values, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyBetween(String value1, String value2) {
            addCriterion("adminIdentify between", value1, value2, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdminidentifyNotBetween(String value1, String value2) {
            addCriterion("adminIdentify not between", value1, value2, "adminidentify");
            return (Criteria) this;
        }

        public Criteria andAdmingradeIsNull() {
            addCriterion("adminGrade is null");
            return (Criteria) this;
        }

        public Criteria andAdmingradeIsNotNull() {
            addCriterion("adminGrade is not null");
            return (Criteria) this;
        }

        public Criteria andAdmingradeEqualTo(Integer value) {
            addCriterion("adminGrade =", value, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeNotEqualTo(Integer value) {
            addCriterion("adminGrade <>", value, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeGreaterThan(Integer value) {
            addCriterion("adminGrade >", value, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminGrade >=", value, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeLessThan(Integer value) {
            addCriterion("adminGrade <", value, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeLessThanOrEqualTo(Integer value) {
            addCriterion("adminGrade <=", value, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeIn(List<Integer> values) {
            addCriterion("adminGrade in", values, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeNotIn(List<Integer> values) {
            addCriterion("adminGrade not in", values, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeBetween(Integer value1, Integer value2) {
            addCriterion("adminGrade between", value1, value2, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdmingradeNotBetween(Integer value1, Integer value2) {
            addCriterion("adminGrade not between", value1, value2, "admingrade");
            return (Criteria) this;
        }

        public Criteria andAdminstateIsNull() {
            addCriterion("adminState is null");
            return (Criteria) this;
        }

        public Criteria andAdminstateIsNotNull() {
            addCriterion("adminState is not null");
            return (Criteria) this;
        }

        public Criteria andAdminstateEqualTo(String value) {
            addCriterion("adminState =", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotEqualTo(String value) {
            addCriterion("adminState <>", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThan(String value) {
            addCriterion("adminState >", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThanOrEqualTo(String value) {
            addCriterion("adminState >=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThan(String value) {
            addCriterion("adminState <", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThanOrEqualTo(String value) {
            addCriterion("adminState <=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLike(String value) {
            addCriterion("adminState like", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotLike(String value) {
            addCriterion("adminState not like", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateIn(List<String> values) {
            addCriterion("adminState in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotIn(List<String> values) {
            addCriterion("adminState not in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateBetween(String value1, String value2) {
            addCriterion("adminState between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotBetween(String value1, String value2) {
            addCriterion("adminState not between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdmintelIsNull() {
            addCriterion("adminTel is null");
            return (Criteria) this;
        }

        public Criteria andAdmintelIsNotNull() {
            addCriterion("adminTel is not null");
            return (Criteria) this;
        }

        public Criteria andAdmintelEqualTo(String value) {
            addCriterion("adminTel =", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotEqualTo(String value) {
            addCriterion("adminTel <>", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelGreaterThan(String value) {
            addCriterion("adminTel >", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelGreaterThanOrEqualTo(String value) {
            addCriterion("adminTel >=", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelLessThan(String value) {
            addCriterion("adminTel <", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelLessThanOrEqualTo(String value) {
            addCriterion("adminTel <=", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelLike(String value) {
            addCriterion("adminTel like", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotLike(String value) {
            addCriterion("adminTel not like", value, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelIn(List<String> values) {
            addCriterion("adminTel in", values, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotIn(List<String> values) {
            addCriterion("adminTel not in", values, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelBetween(String value1, String value2) {
            addCriterion("adminTel between", value1, value2, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdmintelNotBetween(String value1, String value2) {
            addCriterion("adminTel not between", value1, value2, "admintel");
            return (Criteria) this;
        }

        public Criteria andAdminidcardIsNull() {
            addCriterion("adminIdcard is null");
            return (Criteria) this;
        }

        public Criteria andAdminidcardIsNotNull() {
            addCriterion("adminIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidcardEqualTo(String value) {
            addCriterion("adminIdcard =", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardNotEqualTo(String value) {
            addCriterion("adminIdcard <>", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardGreaterThan(String value) {
            addCriterion("adminIdcard >", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardGreaterThanOrEqualTo(String value) {
            addCriterion("adminIdcard >=", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardLessThan(String value) {
            addCriterion("adminIdcard <", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardLessThanOrEqualTo(String value) {
            addCriterion("adminIdcard <=", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardLike(String value) {
            addCriterion("adminIdcard like", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardNotLike(String value) {
            addCriterion("adminIdcard not like", value, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardIn(List<String> values) {
            addCriterion("adminIdcard in", values, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardNotIn(List<String> values) {
            addCriterion("adminIdcard not in", values, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardBetween(String value1, String value2) {
            addCriterion("adminIdcard between", value1, value2, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminidcardNotBetween(String value1, String value2) {
            addCriterion("adminIdcard not between", value1, value2, "adminidcard");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNull() {
            addCriterion("adminEmail is null");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNotNull() {
            addCriterion("adminEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAdminemailEqualTo(String value) {
            addCriterion("adminEmail =", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotEqualTo(String value) {
            addCriterion("adminEmail <>", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThan(String value) {
            addCriterion("adminEmail >", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThanOrEqualTo(String value) {
            addCriterion("adminEmail >=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThan(String value) {
            addCriterion("adminEmail <", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThanOrEqualTo(String value) {
            addCriterion("adminEmail <=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLike(String value) {
            addCriterion("adminEmail like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotLike(String value) {
            addCriterion("adminEmail not like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailIn(List<String> values) {
            addCriterion("adminEmail in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotIn(List<String> values) {
            addCriterion("adminEmail not in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailBetween(String value1, String value2) {
            addCriterion("adminEmail between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotBetween(String value1, String value2) {
            addCriterion("adminEmail not between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminageIsNull() {
            addCriterion("adminAge is null");
            return (Criteria) this;
        }

        public Criteria andAdminageIsNotNull() {
            addCriterion("adminAge is not null");
            return (Criteria) this;
        }

        public Criteria andAdminageEqualTo(Integer value) {
            addCriterion("adminAge =", value, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageNotEqualTo(Integer value) {
            addCriterion("adminAge <>", value, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageGreaterThan(Integer value) {
            addCriterion("adminAge >", value, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminAge >=", value, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageLessThan(Integer value) {
            addCriterion("adminAge <", value, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageLessThanOrEqualTo(Integer value) {
            addCriterion("adminAge <=", value, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageIn(List<Integer> values) {
            addCriterion("adminAge in", values, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageNotIn(List<Integer> values) {
            addCriterion("adminAge not in", values, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageBetween(Integer value1, Integer value2) {
            addCriterion("adminAge between", value1, value2, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminageNotBetween(Integer value1, Integer value2) {
            addCriterion("adminAge not between", value1, value2, "adminage");
            return (Criteria) this;
        }

        public Criteria andAdminbirthIsNull() {
            addCriterion("adminBirth is null");
            return (Criteria) this;
        }

        public Criteria andAdminbirthIsNotNull() {
            addCriterion("adminBirth is not null");
            return (Criteria) this;
        }

        public Criteria andAdminbirthEqualTo(Date value) {
            addCriterionForJDBCDate("adminBirth =", value, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("adminBirth <>", value, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("adminBirth >", value, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adminBirth >=", value, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthLessThan(Date value) {
            addCriterionForJDBCDate("adminBirth <", value, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adminBirth <=", value, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthIn(List<Date> values) {
            addCriterionForJDBCDate("adminBirth in", values, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("adminBirth not in", values, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adminBirth between", value1, value2, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adminBirth not between", value1, value2, "adminbirth");
            return (Criteria) this;
        }

        public Criteria andAdminiconIsNull() {
            addCriterion("adminIcon is null");
            return (Criteria) this;
        }

        public Criteria andAdminiconIsNotNull() {
            addCriterion("adminIcon is not null");
            return (Criteria) this;
        }

        public Criteria andAdminiconEqualTo(String value) {
            addCriterion("adminIcon =", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconNotEqualTo(String value) {
            addCriterion("adminIcon <>", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconGreaterThan(String value) {
            addCriterion("adminIcon >", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconGreaterThanOrEqualTo(String value) {
            addCriterion("adminIcon >=", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconLessThan(String value) {
            addCriterion("adminIcon <", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconLessThanOrEqualTo(String value) {
            addCriterion("adminIcon <=", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconLike(String value) {
            addCriterion("adminIcon like", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconNotLike(String value) {
            addCriterion("adminIcon not like", value, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconIn(List<String> values) {
            addCriterion("adminIcon in", values, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconNotIn(List<String> values) {
            addCriterion("adminIcon not in", values, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconBetween(String value1, String value2) {
            addCriterion("adminIcon between", value1, value2, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminiconNotBetween(String value1, String value2) {
            addCriterion("adminIcon not between", value1, value2, "adminicon");
            return (Criteria) this;
        }

        public Criteria andAdminintegralIsNull() {
            addCriterion("adminIntegral is null");
            return (Criteria) this;
        }

        public Criteria andAdminintegralIsNotNull() {
            addCriterion("adminIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andAdminintegralEqualTo(Integer value) {
            addCriterion("adminIntegral =", value, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralNotEqualTo(Integer value) {
            addCriterion("adminIntegral <>", value, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralGreaterThan(Integer value) {
            addCriterion("adminIntegral >", value, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminIntegral >=", value, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralLessThan(Integer value) {
            addCriterion("adminIntegral <", value, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralLessThanOrEqualTo(Integer value) {
            addCriterion("adminIntegral <=", value, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralIn(List<Integer> values) {
            addCriterion("adminIntegral in", values, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralNotIn(List<Integer> values) {
            addCriterion("adminIntegral not in", values, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralBetween(Integer value1, Integer value2) {
            addCriterion("adminIntegral between", value1, value2, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("adminIntegral not between", value1, value2, "adminintegral");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeIsNull() {
            addCriterion("adminLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeIsNotNull() {
            addCriterion("adminLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeEqualTo(Date value) {
            addCriterion("adminLoginTime =", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeNotEqualTo(Date value) {
            addCriterion("adminLoginTime <>", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeGreaterThan(Date value) {
            addCriterion("adminLoginTime >", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adminLoginTime >=", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeLessThan(Date value) {
            addCriterion("adminLoginTime <", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("adminLoginTime <=", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeIn(List<Date> values) {
            addCriterion("adminLoginTime in", values, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeNotIn(List<Date> values) {
            addCriterion("adminLoginTime not in", values, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeBetween(Date value1, Date value2) {
            addCriterion("adminLoginTime between", value1, value2, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("adminLoginTime not between", value1, value2, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeIsNull() {
            addCriterion("adminRegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeIsNotNull() {
            addCriterion("adminRegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeEqualTo(Date value) {
            addCriterion("adminRegisterTime =", value, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeNotEqualTo(Date value) {
            addCriterion("adminRegisterTime <>", value, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeGreaterThan(Date value) {
            addCriterion("adminRegisterTime >", value, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adminRegisterTime >=", value, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeLessThan(Date value) {
            addCriterion("adminRegisterTime <", value, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeLessThanOrEqualTo(Date value) {
            addCriterion("adminRegisterTime <=", value, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeIn(List<Date> values) {
            addCriterion("adminRegisterTime in", values, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeNotIn(List<Date> values) {
            addCriterion("adminRegisterTime not in", values, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeBetween(Date value1, Date value2) {
            addCriterion("adminRegisterTime between", value1, value2, "adminregistertime");
            return (Criteria) this;
        }

        public Criteria andAdminregistertimeNotBetween(Date value1, Date value2) {
            addCriterion("adminRegisterTime not between", value1, value2, "adminregistertime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}