package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andFoodIdIsNull() {
            addCriterion("FOOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("FOOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(BigDecimal value) {
            addCriterion("FOOD_ID =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(BigDecimal value) {
            addCriterion("FOOD_ID <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(BigDecimal value) {
            addCriterion("FOOD_ID >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOOD_ID >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(BigDecimal value) {
            addCriterion("FOOD_ID <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOOD_ID <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<BigDecimal> values) {
            addCriterion("FOOD_ID in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<BigDecimal> values) {
            addCriterion("FOOD_ID not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOOD_ID between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOOD_ID not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("FOOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("FOOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("FOOD_NAME =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("FOOD_NAME <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("FOOD_NAME >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_NAME >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("FOOD_NAME <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("FOOD_NAME <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("FOOD_NAME like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("FOOD_NAME not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("FOOD_NAME in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("FOOD_NAME not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("FOOD_NAME between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("FOOD_NAME not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNull() {
            addCriterion("FOOD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("FOOD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(String value) {
            addCriterion("FOOD_PRICE =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(String value) {
            addCriterion("FOOD_PRICE <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(String value) {
            addCriterion("FOOD_PRICE >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_PRICE >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(String value) {
            addCriterion("FOOD_PRICE <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(String value) {
            addCriterion("FOOD_PRICE <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLike(String value) {
            addCriterion("FOOD_PRICE like", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotLike(String value) {
            addCriterion("FOOD_PRICE not like", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<String> values) {
            addCriterion("FOOD_PRICE in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<String> values) {
            addCriterion("FOOD_PRICE not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(String value1, String value2) {
            addCriterion("FOOD_PRICE between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(String value1, String value2) {
            addCriterion("FOOD_PRICE not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodDateIsNull() {
            addCriterion("FOOD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFoodDateIsNotNull() {
            addCriterion("FOOD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodDateEqualTo(Date value) {
            addCriterionForJDBCDate("FOOD_DATE =", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FOOD_DATE <>", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FOOD_DATE >", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FOOD_DATE >=", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateLessThan(Date value) {
            addCriterionForJDBCDate("FOOD_DATE <", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FOOD_DATE <=", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateIn(List<Date> values) {
            addCriterionForJDBCDate("FOOD_DATE in", values, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FOOD_DATE not in", values, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FOOD_DATE between", value1, value2, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FOOD_DATE not between", value1, value2, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceIsNull() {
            addCriterion("FOOD_ALLPRICE is null");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceIsNotNull() {
            addCriterion("FOOD_ALLPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceEqualTo(String value) {
            addCriterion("FOOD_ALLPRICE =", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceNotEqualTo(String value) {
            addCriterion("FOOD_ALLPRICE <>", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceGreaterThan(String value) {
            addCriterion("FOOD_ALLPRICE >", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_ALLPRICE >=", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceLessThan(String value) {
            addCriterion("FOOD_ALLPRICE <", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceLessThanOrEqualTo(String value) {
            addCriterion("FOOD_ALLPRICE <=", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceLike(String value) {
            addCriterion("FOOD_ALLPRICE like", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceNotLike(String value) {
            addCriterion("FOOD_ALLPRICE not like", value, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceIn(List<String> values) {
            addCriterion("FOOD_ALLPRICE in", values, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceNotIn(List<String> values) {
            addCriterion("FOOD_ALLPRICE not in", values, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceBetween(String value1, String value2) {
            addCriterion("FOOD_ALLPRICE between", value1, value2, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodAllpriceNotBetween(String value1, String value2) {
            addCriterion("FOOD_ALLPRICE not between", value1, value2, "foodAllprice");
            return (Criteria) this;
        }

        public Criteria andFoodNumIsNull() {
            addCriterion("FOOD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFoodNumIsNotNull() {
            addCriterion("FOOD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNumEqualTo(String value) {
            addCriterion("FOOD_NUM =", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumNotEqualTo(String value) {
            addCriterion("FOOD_NUM <>", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumGreaterThan(String value) {
            addCriterion("FOOD_NUM >", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_NUM >=", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumLessThan(String value) {
            addCriterion("FOOD_NUM <", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumLessThanOrEqualTo(String value) {
            addCriterion("FOOD_NUM <=", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumLike(String value) {
            addCriterion("FOOD_NUM like", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumNotLike(String value) {
            addCriterion("FOOD_NUM not like", value, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumIn(List<String> values) {
            addCriterion("FOOD_NUM in", values, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumNotIn(List<String> values) {
            addCriterion("FOOD_NUM not in", values, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumBetween(String value1, String value2) {
            addCriterion("FOOD_NUM between", value1, value2, "foodNum");
            return (Criteria) this;
        }

        public Criteria andFoodNumNotBetween(String value1, String value2) {
            addCriterion("FOOD_NUM not between", value1, value2, "foodNum");
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