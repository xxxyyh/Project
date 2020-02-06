package com.threebody.shoppingcart.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsSerieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSerieExample() {
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

        public Criteria andGsidIsNull() {
            addCriterion("gsId is null");
            return (Criteria) this;
        }

        public Criteria andGsidIsNotNull() {
            addCriterion("gsId is not null");
            return (Criteria) this;
        }

        public Criteria andGsidEqualTo(Integer value) {
            addCriterion("gsId =", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotEqualTo(Integer value) {
            addCriterion("gsId <>", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThan(Integer value) {
            addCriterion("gsId >", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsId >=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThan(Integer value) {
            addCriterion("gsId <", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidLessThanOrEqualTo(Integer value) {
            addCriterion("gsId <=", value, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidIn(List<Integer> values) {
            addCriterion("gsId in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotIn(List<Integer> values) {
            addCriterion("gsId not in", values, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidBetween(Integer value1, Integer value2) {
            addCriterion("gsId between", value1, value2, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsidNotBetween(Integer value1, Integer value2) {
            addCriterion("gsId not between", value1, value2, "gsid");
            return (Criteria) this;
        }

        public Criteria andGsnameIsNull() {
            addCriterion("gsName is null");
            return (Criteria) this;
        }

        public Criteria andGsnameIsNotNull() {
            addCriterion("gsName is not null");
            return (Criteria) this;
        }

        public Criteria andGsnameEqualTo(String value) {
            addCriterion("gsName =", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameNotEqualTo(String value) {
            addCriterion("gsName <>", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameGreaterThan(String value) {
            addCriterion("gsName >", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameGreaterThanOrEqualTo(String value) {
            addCriterion("gsName >=", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameLessThan(String value) {
            addCriterion("gsName <", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameLessThanOrEqualTo(String value) {
            addCriterion("gsName <=", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameLike(String value) {
            addCriterion("gsName like", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameNotLike(String value) {
            addCriterion("gsName not like", value, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameIn(List<String> values) {
            addCriterion("gsName in", values, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameNotIn(List<String> values) {
            addCriterion("gsName not in", values, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameBetween(String value1, String value2) {
            addCriterion("gsName between", value1, value2, "gsname");
            return (Criteria) this;
        }

        public Criteria andGsnameNotBetween(String value1, String value2) {
            addCriterion("gsName not between", value1, value2, "gsname");
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