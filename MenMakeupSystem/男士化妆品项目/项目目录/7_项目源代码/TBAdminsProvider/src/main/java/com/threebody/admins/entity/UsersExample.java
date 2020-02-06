package com.threebody.admins.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNull() {
            addCriterion("userAccount is null");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNotNull() {
            addCriterion("userAccount is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccountEqualTo(String value) {
            addCriterion("userAccount =", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotEqualTo(String value) {
            addCriterion("userAccount <>", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThan(String value) {
            addCriterion("userAccount >", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThanOrEqualTo(String value) {
            addCriterion("userAccount >=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThan(String value) {
            addCriterion("userAccount <", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThanOrEqualTo(String value) {
            addCriterion("userAccount <=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLike(String value) {
            addCriterion("userAccount like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotLike(String value) {
            addCriterion("userAccount not like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountIn(List<String> values) {
            addCriterion("userAccount in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotIn(List<String> values) {
            addCriterion("userAccount not in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountBetween(String value1, String value2) {
            addCriterion("userAccount between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotBetween(String value1, String value2) {
            addCriterion("userAccount not between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpetnameIsNull() {
            addCriterion("userPetName is null");
            return (Criteria) this;
        }

        public Criteria andUserpetnameIsNotNull() {
            addCriterion("userPetName is not null");
            return (Criteria) this;
        }

        public Criteria andUserpetnameEqualTo(String value) {
            addCriterion("userPetName =", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameNotEqualTo(String value) {
            addCriterion("userPetName <>", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameGreaterThan(String value) {
            addCriterion("userPetName >", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameGreaterThanOrEqualTo(String value) {
            addCriterion("userPetName >=", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameLessThan(String value) {
            addCriterion("userPetName <", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameLessThanOrEqualTo(String value) {
            addCriterion("userPetName <=", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameLike(String value) {
            addCriterion("userPetName like", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameNotLike(String value) {
            addCriterion("userPetName not like", value, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameIn(List<String> values) {
            addCriterion("userPetName in", values, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameNotIn(List<String> values) {
            addCriterion("userPetName not in", values, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameBetween(String value1, String value2) {
            addCriterion("userPetName between", value1, value2, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpetnameNotBetween(String value1, String value2) {
            addCriterion("userPetName not between", value1, value2, "userpetname");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userPassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("userSex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("userSex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("userSex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("userSex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("userSex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("userSex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("userSex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("userSex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("userSex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("userSex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("userSex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("userSex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(String value) {
            addCriterion("userState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(String value) {
            addCriterion("userState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(String value) {
            addCriterion("userState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(String value) {
            addCriterion("userState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(String value) {
            addCriterion("userState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(String value) {
            addCriterion("userState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLike(String value) {
            addCriterion("userState like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotLike(String value) {
            addCriterion("userState not like", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<String> values) {
            addCriterion("userState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<String> values) {
            addCriterion("userState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(String value1, String value2) {
            addCriterion("userState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(String value1, String value2) {
            addCriterion("userState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("userTel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("userTel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("userTel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("userTel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("userTel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("userTel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("userTel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("userTel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("userTel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("userTel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("userTel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("userTel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("userTel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("userTel not between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUseridcardIsNull() {
            addCriterion("userIdcard is null");
            return (Criteria) this;
        }

        public Criteria andUseridcardIsNotNull() {
            addCriterion("userIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andUseridcardEqualTo(String value) {
            addCriterion("userIdcard =", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardNotEqualTo(String value) {
            addCriterion("userIdcard <>", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardGreaterThan(String value) {
            addCriterion("userIdcard >", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardGreaterThanOrEqualTo(String value) {
            addCriterion("userIdcard >=", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardLessThan(String value) {
            addCriterion("userIdcard <", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardLessThanOrEqualTo(String value) {
            addCriterion("userIdcard <=", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardLike(String value) {
            addCriterion("userIdcard like", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardNotLike(String value) {
            addCriterion("userIdcard not like", value, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardIn(List<String> values) {
            addCriterion("userIdcard in", values, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardNotIn(List<String> values) {
            addCriterion("userIdcard not in", values, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardBetween(String value1, String value2) {
            addCriterion("userIdcard between", value1, value2, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseridcardNotBetween(String value1, String value2) {
            addCriterion("userIdcard not between", value1, value2, "useridcard");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("userEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("userEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("userEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("userEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("userEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("userEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUserageIsNull() {
            addCriterion("userAge is null");
            return (Criteria) this;
        }

        public Criteria andUserageIsNotNull() {
            addCriterion("userAge is not null");
            return (Criteria) this;
        }

        public Criteria andUserageEqualTo(Integer value) {
            addCriterion("userAge =", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotEqualTo(Integer value) {
            addCriterion("userAge <>", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageGreaterThan(Integer value) {
            addCriterion("userAge >", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageGreaterThanOrEqualTo(Integer value) {
            addCriterion("userAge >=", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageLessThan(Integer value) {
            addCriterion("userAge <", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageLessThanOrEqualTo(Integer value) {
            addCriterion("userAge <=", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageIn(List<Integer> values) {
            addCriterion("userAge in", values, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotIn(List<Integer> values) {
            addCriterion("userAge not in", values, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageBetween(Integer value1, Integer value2) {
            addCriterion("userAge between", value1, value2, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotBetween(Integer value1, Integer value2) {
            addCriterion("userAge not between", value1, value2, "userage");
            return (Criteria) this;
        }

        public Criteria andUserbirthIsNull() {
            addCriterion("userBirth is null");
            return (Criteria) this;
        }

        public Criteria andUserbirthIsNotNull() {
            addCriterion("userBirth is not null");
            return (Criteria) this;
        }

        public Criteria andUserbirthEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth =", value, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth <>", value, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("userBirth >", value, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth >=", value, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthLessThan(Date value) {
            addCriterionForJDBCDate("userBirth <", value, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("userBirth <=", value, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthIn(List<Date> values) {
            addCriterionForJDBCDate("userBirth in", values, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("userBirth not in", values, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userBirth between", value1, value2, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUserbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("userBirth not between", value1, value2, "userbirth");
            return (Criteria) this;
        }

        public Criteria andUsericonIsNull() {
            addCriterion("userIcon is null");
            return (Criteria) this;
        }

        public Criteria andUsericonIsNotNull() {
            addCriterion("userIcon is not null");
            return (Criteria) this;
        }

        public Criteria andUsericonEqualTo(String value) {
            addCriterion("userIcon =", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotEqualTo(String value) {
            addCriterion("userIcon <>", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonGreaterThan(String value) {
            addCriterion("userIcon >", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonGreaterThanOrEqualTo(String value) {
            addCriterion("userIcon >=", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonLessThan(String value) {
            addCriterion("userIcon <", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonLessThanOrEqualTo(String value) {
            addCriterion("userIcon <=", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonLike(String value) {
            addCriterion("userIcon like", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotLike(String value) {
            addCriterion("userIcon not like", value, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonIn(List<String> values) {
            addCriterion("userIcon in", values, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotIn(List<String> values) {
            addCriterion("userIcon not in", values, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonBetween(String value1, String value2) {
            addCriterion("userIcon between", value1, value2, "usericon");
            return (Criteria) this;
        }

        public Criteria andUsericonNotBetween(String value1, String value2) {
            addCriterion("userIcon not between", value1, value2, "usericon");
            return (Criteria) this;
        }

        public Criteria andUserintegralIsNull() {
            addCriterion("userIntegral is null");
            return (Criteria) this;
        }

        public Criteria andUserintegralIsNotNull() {
            addCriterion("userIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andUserintegralEqualTo(Integer value) {
            addCriterion("userIntegral =", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralNotEqualTo(Integer value) {
            addCriterion("userIntegral <>", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralGreaterThan(Integer value) {
            addCriterion("userIntegral >", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("userIntegral >=", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralLessThan(Integer value) {
            addCriterion("userIntegral <", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralLessThanOrEqualTo(Integer value) {
            addCriterion("userIntegral <=", value, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralIn(List<Integer> values) {
            addCriterion("userIntegral in", values, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralNotIn(List<Integer> values) {
            addCriterion("userIntegral not in", values, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralBetween(Integer value1, Integer value2) {
            addCriterion("userIntegral between", value1, value2, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("userIntegral not between", value1, value2, "userintegral");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIsNull() {
            addCriterion("userLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIsNotNull() {
            addCriterion("userLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeEqualTo(Date value) {
            addCriterion("userLoginTime =", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotEqualTo(Date value) {
            addCriterion("userLoginTime <>", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeGreaterThan(Date value) {
            addCriterion("userLoginTime >", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userLoginTime >=", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeLessThan(Date value) {
            addCriterion("userLoginTime <", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("userLoginTime <=", value, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeIn(List<Date> values) {
            addCriterion("userLoginTime in", values, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotIn(List<Date> values) {
            addCriterion("userLoginTime not in", values, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeBetween(Date value1, Date value2) {
            addCriterion("userLoginTime between", value1, value2, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("userLoginTime not between", value1, value2, "userlogintime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeIsNull() {
            addCriterion("userRegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeIsNotNull() {
            addCriterion("userRegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeEqualTo(Date value) {
            addCriterion("userRegisterTime =", value, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeNotEqualTo(Date value) {
            addCriterion("userRegisterTime <>", value, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeGreaterThan(Date value) {
            addCriterion("userRegisterTime >", value, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userRegisterTime >=", value, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeLessThan(Date value) {
            addCriterion("userRegisterTime <", value, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeLessThanOrEqualTo(Date value) {
            addCriterion("userRegisterTime <=", value, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeIn(List<Date> values) {
            addCriterion("userRegisterTime in", values, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeNotIn(List<Date> values) {
            addCriterion("userRegisterTime not in", values, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeBetween(Date value1, Date value2) {
            addCriterion("userRegisterTime between", value1, value2, "userregistertime");
            return (Criteria) this;
        }

        public Criteria andUserregistertimeNotBetween(Date value1, Date value2) {
            addCriterion("userRegisterTime not between", value1, value2, "userregistertime");
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