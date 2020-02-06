package com.threebody.users.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsEvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsEvaluationExample() {
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

        public Criteria andGevaidIsNull() {
            addCriterion("gevaId is null");
            return (Criteria) this;
        }

        public Criteria andGevaidIsNotNull() {
            addCriterion("gevaId is not null");
            return (Criteria) this;
        }

        public Criteria andGevaidEqualTo(Integer value) {
            addCriterion("gevaId =", value, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidNotEqualTo(Integer value) {
            addCriterion("gevaId <>", value, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidGreaterThan(Integer value) {
            addCriterion("gevaId >", value, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gevaId >=", value, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidLessThan(Integer value) {
            addCriterion("gevaId <", value, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidLessThanOrEqualTo(Integer value) {
            addCriterion("gevaId <=", value, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidIn(List<Integer> values) {
            addCriterion("gevaId in", values, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidNotIn(List<Integer> values) {
            addCriterion("gevaId not in", values, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidBetween(Integer value1, Integer value2) {
            addCriterion("gevaId between", value1, value2, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGevaidNotBetween(Integer value1, Integer value2) {
            addCriterion("gevaId not between", value1, value2, "gevaid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGevatextIsNull() {
            addCriterion("gevaText is null");
            return (Criteria) this;
        }

        public Criteria andGevatextIsNotNull() {
            addCriterion("gevaText is not null");
            return (Criteria) this;
        }

        public Criteria andGevatextEqualTo(String value) {
            addCriterion("gevaText =", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextNotEqualTo(String value) {
            addCriterion("gevaText <>", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextGreaterThan(String value) {
            addCriterion("gevaText >", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextGreaterThanOrEqualTo(String value) {
            addCriterion("gevaText >=", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextLessThan(String value) {
            addCriterion("gevaText <", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextLessThanOrEqualTo(String value) {
            addCriterion("gevaText <=", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextLike(String value) {
            addCriterion("gevaText like", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextNotLike(String value) {
            addCriterion("gevaText not like", value, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextIn(List<String> values) {
            addCriterion("gevaText in", values, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextNotIn(List<String> values) {
            addCriterion("gevaText not in", values, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextBetween(String value1, String value2) {
            addCriterion("gevaText between", value1, value2, "gevatext");
            return (Criteria) this;
        }

        public Criteria andGevatextNotBetween(String value1, String value2) {
            addCriterion("gevaText not between", value1, value2, "gevatext");
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

        public Criteria andGevalevelIsNull() {
            addCriterion("gevaLevel is null");
            return (Criteria) this;
        }

        public Criteria andGevalevelIsNotNull() {
            addCriterion("gevaLevel is not null");
            return (Criteria) this;
        }

        public Criteria andGevalevelEqualTo(Integer value) {
            addCriterion("gevaLevel =", value, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelNotEqualTo(Integer value) {
            addCriterion("gevaLevel <>", value, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelGreaterThan(Integer value) {
            addCriterion("gevaLevel >", value, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("gevaLevel >=", value, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelLessThan(Integer value) {
            addCriterion("gevaLevel <", value, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelLessThanOrEqualTo(Integer value) {
            addCriterion("gevaLevel <=", value, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelIn(List<Integer> values) {
            addCriterion("gevaLevel in", values, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelNotIn(List<Integer> values) {
            addCriterion("gevaLevel not in", values, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelBetween(Integer value1, Integer value2) {
            addCriterion("gevaLevel between", value1, value2, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevalevelNotBetween(Integer value1, Integer value2) {
            addCriterion("gevaLevel not between", value1, value2, "gevalevel");
            return (Criteria) this;
        }

        public Criteria andGevadateIsNull() {
            addCriterion("gevaDate is null");
            return (Criteria) this;
        }

        public Criteria andGevadateIsNotNull() {
            addCriterion("gevaDate is not null");
            return (Criteria) this;
        }

        public Criteria andGevadateEqualTo(Date value) {
            addCriterion("gevaDate =", value, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateNotEqualTo(Date value) {
            addCriterion("gevaDate <>", value, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateGreaterThan(Date value) {
            addCriterion("gevaDate >", value, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateGreaterThanOrEqualTo(Date value) {
            addCriterion("gevaDate >=", value, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateLessThan(Date value) {
            addCriterion("gevaDate <", value, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateLessThanOrEqualTo(Date value) {
            addCriterion("gevaDate <=", value, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateIn(List<Date> values) {
            addCriterion("gevaDate in", values, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateNotIn(List<Date> values) {
            addCriterion("gevaDate not in", values, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateBetween(Date value1, Date value2) {
            addCriterion("gevaDate between", value1, value2, "gevadate");
            return (Criteria) this;
        }

        public Criteria andGevadateNotBetween(Date value1, Date value2) {
            addCriterion("gevaDate not between", value1, value2, "gevadate");
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