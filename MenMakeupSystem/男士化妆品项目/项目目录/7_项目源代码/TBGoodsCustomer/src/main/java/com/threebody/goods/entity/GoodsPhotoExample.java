package com.threebody.goods.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsPhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsPhotoExample() {
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

        public Criteria andGpidIsNull() {
            addCriterion("gpId is null");
            return (Criteria) this;
        }

        public Criteria andGpidIsNotNull() {
            addCriterion("gpId is not null");
            return (Criteria) this;
        }

        public Criteria andGpidEqualTo(Integer value) {
            addCriterion("gpId =", value, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidNotEqualTo(Integer value) {
            addCriterion("gpId <>", value, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidGreaterThan(Integer value) {
            addCriterion("gpId >", value, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gpId >=", value, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidLessThan(Integer value) {
            addCriterion("gpId <", value, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidLessThanOrEqualTo(Integer value) {
            addCriterion("gpId <=", value, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidIn(List<Integer> values) {
            addCriterion("gpId in", values, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidNotIn(List<Integer> values) {
            addCriterion("gpId not in", values, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidBetween(Integer value1, Integer value2) {
            addCriterion("gpId between", value1, value2, "gpid");
            return (Criteria) this;
        }

        public Criteria andGpidNotBetween(Integer value1, Integer value2) {
            addCriterion("gpId not between", value1, value2, "gpid");
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

        public Criteria andGphotocodeIsNull() {
            addCriterion("gphotoCode is null");
            return (Criteria) this;
        }

        public Criteria andGphotocodeIsNotNull() {
            addCriterion("gphotoCode is not null");
            return (Criteria) this;
        }

        public Criteria andGphotocodeEqualTo(String value) {
            addCriterion("gphotoCode =", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeNotEqualTo(String value) {
            addCriterion("gphotoCode <>", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeGreaterThan(String value) {
            addCriterion("gphotoCode >", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeGreaterThanOrEqualTo(String value) {
            addCriterion("gphotoCode >=", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeLessThan(String value) {
            addCriterion("gphotoCode <", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeLessThanOrEqualTo(String value) {
            addCriterion("gphotoCode <=", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeLike(String value) {
            addCriterion("gphotoCode like", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeNotLike(String value) {
            addCriterion("gphotoCode not like", value, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeIn(List<String> values) {
            addCriterion("gphotoCode in", values, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeNotIn(List<String> values) {
            addCriterion("gphotoCode not in", values, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeBetween(String value1, String value2) {
            addCriterion("gphotoCode between", value1, value2, "gphotocode");
            return (Criteria) this;
        }

        public Criteria andGphotocodeNotBetween(String value1, String value2) {
            addCriterion("gphotoCode not between", value1, value2, "gphotocode");
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