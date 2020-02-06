package com.threebody.orders.entity;

import java.util.ArrayList;
import java.util.List;

public class DeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryExample() {
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

        public Criteria andOrdersidIsNull() {
            addCriterion("ordersId is null");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNotNull() {
            addCriterion("ordersId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersidEqualTo(String value) {
            addCriterion("ordersId =", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotEqualTo(String value) {
            addCriterion("ordersId <>", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThan(String value) {
            addCriterion("ordersId >", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThanOrEqualTo(String value) {
            addCriterion("ordersId >=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThan(String value) {
            addCriterion("ordersId <", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThanOrEqualTo(String value) {
            addCriterion("ordersId <=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLike(String value) {
            addCriterion("ordersId like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotLike(String value) {
            addCriterion("ordersId not like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidIn(List<String> values) {
            addCriterion("ordersId in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotIn(List<String> values) {
            addCriterion("ordersId not in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidBetween(String value1, String value2) {
            addCriterion("ordersId between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotBetween(String value1, String value2) {
            addCriterion("ordersId not between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andTracknumIsNull() {
            addCriterion("trackNum is null");
            return (Criteria) this;
        }

        public Criteria andTracknumIsNotNull() {
            addCriterion("trackNum is not null");
            return (Criteria) this;
        }

        public Criteria andTracknumEqualTo(String value) {
            addCriterion("trackNum =", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumNotEqualTo(String value) {
            addCriterion("trackNum <>", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumGreaterThan(String value) {
            addCriterion("trackNum >", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumGreaterThanOrEqualTo(String value) {
            addCriterion("trackNum >=", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumLessThan(String value) {
            addCriterion("trackNum <", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumLessThanOrEqualTo(String value) {
            addCriterion("trackNum <=", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumLike(String value) {
            addCriterion("trackNum like", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumNotLike(String value) {
            addCriterion("trackNum not like", value, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumIn(List<String> values) {
            addCriterion("trackNum in", values, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumNotIn(List<String> values) {
            addCriterion("trackNum not in", values, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumBetween(String value1, String value2) {
            addCriterion("trackNum between", value1, value2, "tracknum");
            return (Criteria) this;
        }

        public Criteria andTracknumNotBetween(String value1, String value2) {
            addCriterion("trackNum not between", value1, value2, "tracknum");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyIsNull() {
            addCriterion("expressCompany is null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyIsNotNull() {
            addCriterion("expressCompany is not null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyEqualTo(String value) {
            addCriterion("expressCompany =", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotEqualTo(String value) {
            addCriterion("expressCompany <>", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyGreaterThan(String value) {
            addCriterion("expressCompany >", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyGreaterThanOrEqualTo(String value) {
            addCriterion("expressCompany >=", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyLessThan(String value) {
            addCriterion("expressCompany <", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyLessThanOrEqualTo(String value) {
            addCriterion("expressCompany <=", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyLike(String value) {
            addCriterion("expressCompany like", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotLike(String value) {
            addCriterion("expressCompany not like", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyIn(List<String> values) {
            addCriterion("expressCompany in", values, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotIn(List<String> values) {
            addCriterion("expressCompany not in", values, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyBetween(String value1, String value2) {
            addCriterion("expressCompany between", value1, value2, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotBetween(String value1, String value2) {
            addCriterion("expressCompany not between", value1, value2, "expresscompany");
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