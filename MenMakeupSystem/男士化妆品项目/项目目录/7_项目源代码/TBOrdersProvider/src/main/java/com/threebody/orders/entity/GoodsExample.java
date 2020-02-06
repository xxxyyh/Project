package com.threebody.orders.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
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

        public Criteria andGoodsstateIsNull() {
            addCriterion("goodsState is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstateIsNotNull() {
            addCriterion("goodsState is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstateEqualTo(String value) {
            addCriterion("goodsState =", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateNotEqualTo(String value) {
            addCriterion("goodsState <>", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateGreaterThan(String value) {
            addCriterion("goodsState >", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateGreaterThanOrEqualTo(String value) {
            addCriterion("goodsState >=", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateLessThan(String value) {
            addCriterion("goodsState <", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateLessThanOrEqualTo(String value) {
            addCriterion("goodsState <=", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateLike(String value) {
            addCriterion("goodsState like", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateNotLike(String value) {
            addCriterion("goodsState not like", value, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateIn(List<String> values) {
            addCriterion("goodsState in", values, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateNotIn(List<String> values) {
            addCriterion("goodsState not in", values, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateBetween(String value1, String value2) {
            addCriterion("goodsState between", value1, value2, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodsstateNotBetween(String value1, String value2) {
            addCriterion("goodsState not between", value1, value2, "goodsstate");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Double value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Double value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Double value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Double value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Double value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Double> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Double> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Double value1, Double value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Double value1, Double value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandIsNull() {
            addCriterion("goodsBrand is null");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandIsNotNull() {
            addCriterion("goodsBrand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandEqualTo(String value) {
            addCriterion("goodsBrand =", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotEqualTo(String value) {
            addCriterion("goodsBrand <>", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandGreaterThan(String value) {
            addCriterion("goodsBrand >", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandGreaterThanOrEqualTo(String value) {
            addCriterion("goodsBrand >=", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandLessThan(String value) {
            addCriterion("goodsBrand <", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandLessThanOrEqualTo(String value) {
            addCriterion("goodsBrand <=", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandLike(String value) {
            addCriterion("goodsBrand like", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotLike(String value) {
            addCriterion("goodsBrand not like", value, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandIn(List<String> values) {
            addCriterion("goodsBrand in", values, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotIn(List<String> values) {
            addCriterion("goodsBrand not in", values, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandBetween(String value1, String value2) {
            addCriterion("goodsBrand between", value1, value2, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsbrandNotBetween(String value1, String value2) {
            addCriterion("goodsBrand not between", value1, value2, "goodsbrand");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIsNull() {
            addCriterion("goodsStock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIsNotNull() {
            addCriterion("goodsStock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstockEqualTo(Integer value) {
            addCriterion("goodsStock =", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotEqualTo(Integer value) {
            addCriterion("goodsStock <>", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockGreaterThan(Integer value) {
            addCriterion("goodsStock >", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsStock >=", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockLessThan(Integer value) {
            addCriterion("goodsStock <", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockLessThanOrEqualTo(Integer value) {
            addCriterion("goodsStock <=", value, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockIn(List<Integer> values) {
            addCriterion("goodsStock in", values, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotIn(List<Integer> values) {
            addCriterion("goodsStock not in", values, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockBetween(Integer value1, Integer value2) {
            addCriterion("goodsStock between", value1, value2, "goodsstock");
            return (Criteria) this;
        }

        public Criteria andGoodsstockNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsStock not between", value1, value2, "goodsstock");
            return (Criteria) this;
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

        public Criteria andGtypeidIsNull() {
            addCriterion("gtypeId is null");
            return (Criteria) this;
        }

        public Criteria andGtypeidIsNotNull() {
            addCriterion("gtypeId is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeidEqualTo(Integer value) {
            addCriterion("gtypeId =", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotEqualTo(Integer value) {
            addCriterion("gtypeId <>", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidGreaterThan(Integer value) {
            addCriterion("gtypeId >", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtypeId >=", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidLessThan(Integer value) {
            addCriterion("gtypeId <", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("gtypeId <=", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidIn(List<Integer> values) {
            addCriterion("gtypeId in", values, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotIn(List<Integer> values) {
            addCriterion("gtypeId not in", values, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidBetween(Integer value1, Integer value2) {
            addCriterion("gtypeId between", value1, value2, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gtypeId not between", value1, value2, "gtypeid");
            return (Criteria) this;
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

        public Criteria andGoodsinfoIsNull() {
            addCriterion("goodsInfo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoIsNotNull() {
            addCriterion("goodsInfo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoEqualTo(String value) {
            addCriterion("goodsInfo =", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoNotEqualTo(String value) {
            addCriterion("goodsInfo <>", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoGreaterThan(String value) {
            addCriterion("goodsInfo >", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoGreaterThanOrEqualTo(String value) {
            addCriterion("goodsInfo >=", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoLessThan(String value) {
            addCriterion("goodsInfo <", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoLessThanOrEqualTo(String value) {
            addCriterion("goodsInfo <=", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoLike(String value) {
            addCriterion("goodsInfo like", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoNotLike(String value) {
            addCriterion("goodsInfo not like", value, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoIn(List<String> values) {
            addCriterion("goodsInfo in", values, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoNotIn(List<String> values) {
            addCriterion("goodsInfo not in", values, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoBetween(String value1, String value2) {
            addCriterion("goodsInfo between", value1, value2, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoNotBetween(String value1, String value2) {
            addCriterion("goodsInfo not between", value1, value2, "goodsinfo");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeIsNull() {
            addCriterion("goodsRegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeIsNotNull() {
            addCriterion("goodsRegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeEqualTo(Date value) {
            addCriterion("goodsRegisterTime =", value, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeNotEqualTo(Date value) {
            addCriterion("goodsRegisterTime <>", value, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeGreaterThan(Date value) {
            addCriterion("goodsRegisterTime >", value, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goodsRegisterTime >=", value, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeLessThan(Date value) {
            addCriterion("goodsRegisterTime <", value, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeLessThanOrEqualTo(Date value) {
            addCriterion("goodsRegisterTime <=", value, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeIn(List<Date> values) {
            addCriterion("goodsRegisterTime in", values, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeNotIn(List<Date> values) {
            addCriterion("goodsRegisterTime not in", values, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeBetween(Date value1, Date value2) {
            addCriterion("goodsRegisterTime between", value1, value2, "goodsregistertime");
            return (Criteria) this;
        }

        public Criteria andGoodsregistertimeNotBetween(Date value1, Date value2) {
            addCriterion("goodsRegisterTime not between", value1, value2, "goodsregistertime");
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