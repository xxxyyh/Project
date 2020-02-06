package com.threebody.orders.entity;

import java.util.ArrayList;
import java.util.List;

public class UserAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAddressExample() {
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

        public Criteria andUseraddressidIsNull() {
            addCriterion("userAddressId is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressidIsNotNull() {
            addCriterion("userAddressId is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressidEqualTo(Integer value) {
            addCriterion("userAddressId =", value, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidNotEqualTo(Integer value) {
            addCriterion("userAddressId <>", value, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidGreaterThan(Integer value) {
            addCriterion("userAddressId >", value, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userAddressId >=", value, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidLessThan(Integer value) {
            addCriterion("userAddressId <", value, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidLessThanOrEqualTo(Integer value) {
            addCriterion("userAddressId <=", value, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidIn(List<Integer> values) {
            addCriterion("userAddressId in", values, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidNotIn(List<Integer> values) {
            addCriterion("userAddressId not in", values, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidBetween(Integer value1, Integer value2) {
            addCriterion("userAddressId between", value1, value2, "useraddressid");
            return (Criteria) this;
        }

        public Criteria andUseraddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("userAddressId not between", value1, value2, "useraddressid");
            return (Criteria) this;
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

        public Criteria andUseraddrIsNull() {
            addCriterion("userAddr is null");
            return (Criteria) this;
        }

        public Criteria andUseraddrIsNotNull() {
            addCriterion("userAddr is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddrEqualTo(String value) {
            addCriterion("userAddr =", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotEqualTo(String value) {
            addCriterion("userAddr <>", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrGreaterThan(String value) {
            addCriterion("userAddr >", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrGreaterThanOrEqualTo(String value) {
            addCriterion("userAddr >=", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLessThan(String value) {
            addCriterion("userAddr <", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLessThanOrEqualTo(String value) {
            addCriterion("userAddr <=", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLike(String value) {
            addCriterion("userAddr like", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotLike(String value) {
            addCriterion("userAddr not like", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrIn(List<String> values) {
            addCriterion("userAddr in", values, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotIn(List<String> values) {
            addCriterion("userAddr not in", values, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrBetween(String value1, String value2) {
            addCriterion("userAddr between", value1, value2, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotBetween(String value1, String value2) {
            addCriterion("userAddr not between", value1, value2, "useraddr");
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

        public Criteria andUserconsigneeIsNull() {
            addCriterion("userConsignee is null");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeIsNotNull() {
            addCriterion("userConsignee is not null");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeEqualTo(String value) {
            addCriterion("userConsignee =", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeNotEqualTo(String value) {
            addCriterion("userConsignee <>", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeGreaterThan(String value) {
            addCriterion("userConsignee >", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("userConsignee >=", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeLessThan(String value) {
            addCriterion("userConsignee <", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeLessThanOrEqualTo(String value) {
            addCriterion("userConsignee <=", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeLike(String value) {
            addCriterion("userConsignee like", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeNotLike(String value) {
            addCriterion("userConsignee not like", value, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeIn(List<String> values) {
            addCriterion("userConsignee in", values, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeNotIn(List<String> values) {
            addCriterion("userConsignee not in", values, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeBetween(String value1, String value2) {
            addCriterion("userConsignee between", value1, value2, "userconsignee");
            return (Criteria) this;
        }

        public Criteria andUserconsigneeNotBetween(String value1, String value2) {
            addCriterion("userConsignee not between", value1, value2, "userconsignee");
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