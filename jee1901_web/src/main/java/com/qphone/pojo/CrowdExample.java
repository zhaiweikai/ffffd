package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CrowdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrowdExample() {
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

        public Criteria andCrowdIdIsNull() {
            addCriterion("CROWD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCrowdIdIsNotNull() {
            addCriterion("CROWD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdIdEqualTo(BigDecimal value) {
            addCriterion("CROWD_ID =", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdNotEqualTo(BigDecimal value) {
            addCriterion("CROWD_ID <>", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdGreaterThan(BigDecimal value) {
            addCriterion("CROWD_ID >", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CROWD_ID >=", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdLessThan(BigDecimal value) {
            addCriterion("CROWD_ID <", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CROWD_ID <=", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdIn(List<BigDecimal> values) {
            addCriterion("CROWD_ID in", values, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdNotIn(List<BigDecimal> values) {
            addCriterion("CROWD_ID not in", values, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CROWD_ID between", value1, value2, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CROWD_ID not between", value1, value2, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdNameIsNull() {
            addCriterion("CROWD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCrowdNameIsNotNull() {
            addCriterion("CROWD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdNameEqualTo(String value) {
            addCriterion("CROWD_NAME =", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotEqualTo(String value) {
            addCriterion("CROWD_NAME <>", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameGreaterThan(String value) {
            addCriterion("CROWD_NAME >", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_NAME >=", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameLessThan(String value) {
            addCriterion("CROWD_NAME <", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameLessThanOrEqualTo(String value) {
            addCriterion("CROWD_NAME <=", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameLike(String value) {
            addCriterion("CROWD_NAME like", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotLike(String value) {
            addCriterion("CROWD_NAME not like", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameIn(List<String> values) {
            addCriterion("CROWD_NAME in", values, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotIn(List<String> values) {
            addCriterion("CROWD_NAME not in", values, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameBetween(String value1, String value2) {
            addCriterion("CROWD_NAME between", value1, value2, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotBetween(String value1, String value2) {
            addCriterion("CROWD_NAME not between", value1, value2, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdZjIsNull() {
            addCriterion("CROWD_ZJ is null");
            return (Criteria) this;
        }

        public Criteria andCrowdZjIsNotNull() {
            addCriterion("CROWD_ZJ is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdZjEqualTo(String value) {
            addCriterion("CROWD_ZJ =", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjNotEqualTo(String value) {
            addCriterion("CROWD_ZJ <>", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjGreaterThan(String value) {
            addCriterion("CROWD_ZJ >", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_ZJ >=", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjLessThan(String value) {
            addCriterion("CROWD_ZJ <", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjLessThanOrEqualTo(String value) {
            addCriterion("CROWD_ZJ <=", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjLike(String value) {
            addCriterion("CROWD_ZJ like", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjNotLike(String value) {
            addCriterion("CROWD_ZJ not like", value, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjIn(List<String> values) {
            addCriterion("CROWD_ZJ in", values, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjNotIn(List<String> values) {
            addCriterion("CROWD_ZJ not in", values, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjBetween(String value1, String value2) {
            addCriterion("CROWD_ZJ between", value1, value2, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdZjNotBetween(String value1, String value2) {
            addCriterion("CROWD_ZJ not between", value1, value2, "crowdZj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjIsNull() {
            addCriterion("CROWD_CJ is null");
            return (Criteria) this;
        }

        public Criteria andCrowdCjIsNotNull() {
            addCriterion("CROWD_CJ is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdCjEqualTo(String value) {
            addCriterion("CROWD_CJ =", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjNotEqualTo(String value) {
            addCriterion("CROWD_CJ <>", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjGreaterThan(String value) {
            addCriterion("CROWD_CJ >", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_CJ >=", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjLessThan(String value) {
            addCriterion("CROWD_CJ <", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjLessThanOrEqualTo(String value) {
            addCriterion("CROWD_CJ <=", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjLike(String value) {
            addCriterion("CROWD_CJ like", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjNotLike(String value) {
            addCriterion("CROWD_CJ not like", value, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjIn(List<String> values) {
            addCriterion("CROWD_CJ in", values, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjNotIn(List<String> values) {
            addCriterion("CROWD_CJ not in", values, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjBetween(String value1, String value2) {
            addCriterion("CROWD_CJ between", value1, value2, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdCjNotBetween(String value1, String value2) {
            addCriterion("CROWD_CJ not between", value1, value2, "crowdCj");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeIsNull() {
            addCriterion("CROWD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeIsNotNull() {
            addCriterion("CROWD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CROWD_TIME =", value, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CROWD_TIME <>", value, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CROWD_TIME >", value, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CROWD_TIME >=", value, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeLessThan(Date value) {
            addCriterionForJDBCDate("CROWD_TIME <", value, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CROWD_TIME <=", value, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CROWD_TIME in", values, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CROWD_TIME not in", values, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CROWD_TIME between", value1, value2, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CROWD_TIME not between", value1, value2, "crowdTime");
            return (Criteria) this;
        }

        public Criteria andCrowdDcIsNull() {
            addCriterion("CROWD_DC is null");
            return (Criteria) this;
        }

        public Criteria andCrowdDcIsNotNull() {
            addCriterion("CROWD_DC is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdDcEqualTo(String value) {
            addCriterion("CROWD_DC =", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcNotEqualTo(String value) {
            addCriterion("CROWD_DC <>", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcGreaterThan(String value) {
            addCriterion("CROWD_DC >", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_DC >=", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcLessThan(String value) {
            addCriterion("CROWD_DC <", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcLessThanOrEqualTo(String value) {
            addCriterion("CROWD_DC <=", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcLike(String value) {
            addCriterion("CROWD_DC like", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcNotLike(String value) {
            addCriterion("CROWD_DC not like", value, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcIn(List<String> values) {
            addCriterion("CROWD_DC in", values, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcNotIn(List<String> values) {
            addCriterion("CROWD_DC not in", values, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcBetween(String value1, String value2) {
            addCriterion("CROWD_DC between", value1, value2, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdDcNotBetween(String value1, String value2) {
            addCriterion("CROWD_DC not between", value1, value2, "crowdDc");
            return (Criteria) this;
        }

        public Criteria andCrowdMsIsNull() {
            addCriterion("CROWD_MS is null");
            return (Criteria) this;
        }

        public Criteria andCrowdMsIsNotNull() {
            addCriterion("CROWD_MS is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdMsEqualTo(String value) {
            addCriterion("CROWD_MS =", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsNotEqualTo(String value) {
            addCriterion("CROWD_MS <>", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsGreaterThan(String value) {
            addCriterion("CROWD_MS >", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_MS >=", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsLessThan(String value) {
            addCriterion("CROWD_MS <", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsLessThanOrEqualTo(String value) {
            addCriterion("CROWD_MS <=", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsLike(String value) {
            addCriterion("CROWD_MS like", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsNotLike(String value) {
            addCriterion("CROWD_MS not like", value, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsIn(List<String> values) {
            addCriterion("CROWD_MS in", values, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsNotIn(List<String> values) {
            addCriterion("CROWD_MS not in", values, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsBetween(String value1, String value2) {
            addCriterion("CROWD_MS between", value1, value2, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdMsNotBetween(String value1, String value2) {
            addCriterion("CROWD_MS not between", value1, value2, "crowdMs");
            return (Criteria) this;
        }

        public Criteria andCrowdTtIsNull() {
            addCriterion("CROWD_TT is null");
            return (Criteria) this;
        }

        public Criteria andCrowdTtIsNotNull() {
            addCriterion("CROWD_TT is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdTtEqualTo(String value) {
            addCriterion("CROWD_TT =", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtNotEqualTo(String value) {
            addCriterion("CROWD_TT <>", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtGreaterThan(String value) {
            addCriterion("CROWD_TT >", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_TT >=", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtLessThan(String value) {
            addCriterion("CROWD_TT <", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtLessThanOrEqualTo(String value) {
            addCriterion("CROWD_TT <=", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtLike(String value) {
            addCriterion("CROWD_TT like", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtNotLike(String value) {
            addCriterion("CROWD_TT not like", value, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtIn(List<String> values) {
            addCriterion("CROWD_TT in", values, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtNotIn(List<String> values) {
            addCriterion("CROWD_TT not in", values, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtBetween(String value1, String value2) {
            addCriterion("CROWD_TT between", value1, value2, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdTtNotBetween(String value1, String value2) {
            addCriterion("CROWD_TT not between", value1, value2, "crowdTt");
            return (Criteria) this;
        }

        public Criteria andCrowdXxIsNull() {
            addCriterion("CROWD_XX is null");
            return (Criteria) this;
        }

        public Criteria andCrowdXxIsNotNull() {
            addCriterion("CROWD_XX is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdXxEqualTo(String value) {
            addCriterion("CROWD_XX =", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxNotEqualTo(String value) {
            addCriterion("CROWD_XX <>", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxGreaterThan(String value) {
            addCriterion("CROWD_XX >", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_XX >=", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxLessThan(String value) {
            addCriterion("CROWD_XX <", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxLessThanOrEqualTo(String value) {
            addCriterion("CROWD_XX <=", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxLike(String value) {
            addCriterion("CROWD_XX like", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxNotLike(String value) {
            addCriterion("CROWD_XX not like", value, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxIn(List<String> values) {
            addCriterion("CROWD_XX in", values, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxNotIn(List<String> values) {
            addCriterion("CROWD_XX not in", values, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxBetween(String value1, String value2) {
            addCriterion("CROWD_XX between", value1, value2, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdXxNotBetween(String value1, String value2) {
            addCriterion("CROWD_XX not between", value1, value2, "crowdXx");
            return (Criteria) this;
        }

        public Criteria andCrowdFqIsNull() {
            addCriterion("CROWD_FQ is null");
            return (Criteria) this;
        }

        public Criteria andCrowdFqIsNotNull() {
            addCriterion("CROWD_FQ is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdFqEqualTo(String value) {
            addCriterion("CROWD_FQ =", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqNotEqualTo(String value) {
            addCriterion("CROWD_FQ <>", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqGreaterThan(String value) {
            addCriterion("CROWD_FQ >", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_FQ >=", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqLessThan(String value) {
            addCriterion("CROWD_FQ <", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqLessThanOrEqualTo(String value) {
            addCriterion("CROWD_FQ <=", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqLike(String value) {
            addCriterion("CROWD_FQ like", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqNotLike(String value) {
            addCriterion("CROWD_FQ not like", value, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqIn(List<String> values) {
            addCriterion("CROWD_FQ in", values, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqNotIn(List<String> values) {
            addCriterion("CROWD_FQ not in", values, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqBetween(String value1, String value2) {
            addCriterion("CROWD_FQ between", value1, value2, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdFqNotBetween(String value1, String value2) {
            addCriterion("CROWD_FQ not between", value1, value2, "crowdFq");
            return (Criteria) this;
        }

        public Criteria andCrowdJsIsNull() {
            addCriterion("CROWD_JS is null");
            return (Criteria) this;
        }

        public Criteria andCrowdJsIsNotNull() {
            addCriterion("CROWD_JS is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdJsEqualTo(String value) {
            addCriterion("CROWD_JS =", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsNotEqualTo(String value) {
            addCriterion("CROWD_JS <>", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsGreaterThan(String value) {
            addCriterion("CROWD_JS >", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_JS >=", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsLessThan(String value) {
            addCriterion("CROWD_JS <", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsLessThanOrEqualTo(String value) {
            addCriterion("CROWD_JS <=", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsLike(String value) {
            addCriterion("CROWD_JS like", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsNotLike(String value) {
            addCriterion("CROWD_JS not like", value, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsIn(List<String> values) {
            addCriterion("CROWD_JS in", values, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsNotIn(List<String> values) {
            addCriterion("CROWD_JS not in", values, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsBetween(String value1, String value2) {
            addCriterion("CROWD_JS between", value1, value2, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdJsNotBetween(String value1, String value2) {
            addCriterion("CROWD_JS not between", value1, value2, "crowdJs");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoIsNull() {
            addCriterion("CROWD_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoIsNotNull() {
            addCriterion("CROWD_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoEqualTo(String value) {
            addCriterion("CROWD_PHOTO =", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoNotEqualTo(String value) {
            addCriterion("CROWD_PHOTO <>", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoGreaterThan(String value) {
            addCriterion("CROWD_PHOTO >", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_PHOTO >=", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoLessThan(String value) {
            addCriterion("CROWD_PHOTO <", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoLessThanOrEqualTo(String value) {
            addCriterion("CROWD_PHOTO <=", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoLike(String value) {
            addCriterion("CROWD_PHOTO like", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoNotLike(String value) {
            addCriterion("CROWD_PHOTO not like", value, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoIn(List<String> values) {
            addCriterion("CROWD_PHOTO in", values, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoNotIn(List<String> values) {
            addCriterion("CROWD_PHOTO not in", values, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoBetween(String value1, String value2) {
            addCriterion("CROWD_PHOTO between", value1, value2, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdPhotoNotBetween(String value1, String value2) {
            addCriterion("CROWD_PHOTO not between", value1, value2, "crowdPhoto");
            return (Criteria) this;
        }

        public Criteria andCrowdTelIsNull() {
            addCriterion("CROWD_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCrowdTelIsNotNull() {
            addCriterion("CROWD_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdTelEqualTo(String value) {
            addCriterion("CROWD_TEL =", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelNotEqualTo(String value) {
            addCriterion("CROWD_TEL <>", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelGreaterThan(String value) {
            addCriterion("CROWD_TEL >", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_TEL >=", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelLessThan(String value) {
            addCriterion("CROWD_TEL <", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelLessThanOrEqualTo(String value) {
            addCriterion("CROWD_TEL <=", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelLike(String value) {
            addCriterion("CROWD_TEL like", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelNotLike(String value) {
            addCriterion("CROWD_TEL not like", value, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelIn(List<String> values) {
            addCriterion("CROWD_TEL in", values, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelNotIn(List<String> values) {
            addCriterion("CROWD_TEL not in", values, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelBetween(String value1, String value2) {
            addCriterion("CROWD_TEL between", value1, value2, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdTelNotBetween(String value1, String value2) {
            addCriterion("CROWD_TEL not between", value1, value2, "crowdTel");
            return (Criteria) this;
        }

        public Criteria andCrowdZhIsNull() {
            addCriterion("CROWD_ZH is null");
            return (Criteria) this;
        }

        public Criteria andCrowdZhIsNotNull() {
            addCriterion("CROWD_ZH is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdZhEqualTo(String value) {
            addCriterion("CROWD_ZH =", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhNotEqualTo(String value) {
            addCriterion("CROWD_ZH <>", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhGreaterThan(String value) {
            addCriterion("CROWD_ZH >", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_ZH >=", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhLessThan(String value) {
            addCriterion("CROWD_ZH <", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhLessThanOrEqualTo(String value) {
            addCriterion("CROWD_ZH <=", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhLike(String value) {
            addCriterion("CROWD_ZH like", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhNotLike(String value) {
            addCriterion("CROWD_ZH not like", value, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhIn(List<String> values) {
            addCriterion("CROWD_ZH in", values, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhNotIn(List<String> values) {
            addCriterion("CROWD_ZH not in", values, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhBetween(String value1, String value2) {
            addCriterion("CROWD_ZH between", value1, value2, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdZhNotBetween(String value1, String value2) {
            addCriterion("CROWD_ZH not between", value1, value2, "crowdZh");
            return (Criteria) this;
        }

        public Criteria andCrowdSfIsNull() {
            addCriterion("CROWD_SF is null");
            return (Criteria) this;
        }

        public Criteria andCrowdSfIsNotNull() {
            addCriterion("CROWD_SF is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdSfEqualTo(String value) {
            addCriterion("CROWD_SF =", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfNotEqualTo(String value) {
            addCriterion("CROWD_SF <>", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfGreaterThan(String value) {
            addCriterion("CROWD_SF >", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfGreaterThanOrEqualTo(String value) {
            addCriterion("CROWD_SF >=", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfLessThan(String value) {
            addCriterion("CROWD_SF <", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfLessThanOrEqualTo(String value) {
            addCriterion("CROWD_SF <=", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfLike(String value) {
            addCriterion("CROWD_SF like", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfNotLike(String value) {
            addCriterion("CROWD_SF not like", value, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfIn(List<String> values) {
            addCriterion("CROWD_SF in", values, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfNotIn(List<String> values) {
            addCriterion("CROWD_SF not in", values, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfBetween(String value1, String value2) {
            addCriterion("CROWD_SF between", value1, value2, "crowdSf");
            return (Criteria) this;
        }

        public Criteria andCrowdSfNotBetween(String value1, String value2) {
            addCriterion("CROWD_SF not between", value1, value2, "crowdSf");
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