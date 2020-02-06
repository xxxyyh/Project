package com.threebody.orders.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsFunctionExample() {
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

        public Criteria andGfidIsNull() {
            addCriterion("gfId is null");
            return (Criteria) this;
        }

        public Criteria andGfidIsNotNull() {
            addCriterion("gfId is not null");
            return (Criteria) this;
        }

        public Criteria andGfidEqualTo(Integer value) {
            addCriterion("gfId =", value, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidNotEqualTo(Integer value) {
            addCriterion("gfId <>", value, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidGreaterThan(Integer value) {
            addCriterion("gfId >", value, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gfId >=", value, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidLessThan(Integer value) {
            addCriterion("gfId <", value, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidLessThanOrEqualTo(Integer value) {
            addCriterion("gfId <=", value, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidIn(List<Integer> values) {
            addCriterion("gfId in", values, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidNotIn(List<Integer> values) {
            addCriterion("gfId not in", values, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidBetween(Integer value1, Integer value2) {
            addCriterion("gfId between", value1, value2, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfidNotBetween(Integer value1, Integer value2) {
            addCriterion("gfId not between", value1, value2, "gfid");
            return (Criteria) this;
        }

        public Criteria andGfnameIsNull() {
            addCriterion("gfName is null");
            return (Criteria) this;
        }

        public Criteria andGfnameIsNotNull() {
            addCriterion("gfName is not null");
            return (Criteria) this;
        }

        public Criteria andGfnameEqualTo(String value) {
            addCriterion("gfName =", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameNotEqualTo(String value) {
            addCriterion("gfName <>", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameGreaterThan(String value) {
            addCriterion("gfName >", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameGreaterThanOrEqualTo(String value) {
            addCriterion("gfName >=", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameLessThan(String value) {
            addCriterion("gfName <", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameLessThanOrEqualTo(String value) {
            addCriterion("gfName <=", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameLike(String value) {
            addCriterion("gfName like", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameNotLike(String value) {
            addCriterion("gfName not like", value, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameIn(List<String> values) {
            addCriterion("gfName in", values, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameNotIn(List<String> values) {
            addCriterion("gfName not in", values, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameBetween(String value1, String value2) {
            addCriterion("gfName between", value1, value2, "gfname");
            return (Criteria) this;
        }

        public Criteria andGfnameNotBetween(String value1, String value2) {
            addCriterion("gfName not between", value1, value2, "gfname");
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