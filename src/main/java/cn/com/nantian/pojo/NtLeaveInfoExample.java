package cn.com.nantian.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NtLeaveInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NtLeaveInfoExample() {
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

        public Criteria andCustTypeIsNull() {
            addCriterion("CUST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustTypeIsNotNull() {
            addCriterion("CUST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustTypeEqualTo(String value) {
            addCriterion("CUST_TYPE =", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotEqualTo(String value) {
            addCriterion("CUST_TYPE <>", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThan(String value) {
            addCriterion("CUST_TYPE >", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE >=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThan(String value) {
            addCriterion("CUST_TYPE <", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE <=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLike(String value) {
            addCriterion("CUST_TYPE like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotLike(String value) {
            addCriterion("CUST_TYPE not like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeIn(List<String> values) {
            addCriterion("CUST_TYPE in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotIn(List<String> values) {
            addCriterion("CUST_TYPE not in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeBetween(String value1, String value2) {
            addCriterion("CUST_TYPE between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotBetween(String value1, String value2) {
            addCriterion("CUST_TYPE not between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("WORK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("WORK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(String value) {
            addCriterion("WORK_TYPE =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(String value) {
            addCriterion("WORK_TYPE <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(String value) {
            addCriterion("WORK_TYPE >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TYPE >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(String value) {
            addCriterion("WORK_TYPE <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(String value) {
            addCriterion("WORK_TYPE <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLike(String value) {
            addCriterion("WORK_TYPE like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotLike(String value) {
            addCriterion("WORK_TYPE not like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<String> values) {
            addCriterion("WORK_TYPE in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<String> values) {
            addCriterion("WORK_TYPE not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(String value1, String value2) {
            addCriterion("WORK_TYPE between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(String value1, String value2) {
            addCriterion("WORK_TYPE not between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveIsNull() {
            addCriterion("WORK_LEAVE is null");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveIsNotNull() {
            addCriterion("WORK_LEAVE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveEqualTo(String value) {
            addCriterion("WORK_LEAVE =", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveNotEqualTo(String value) {
            addCriterion("WORK_LEAVE <>", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveGreaterThan(String value) {
            addCriterion("WORK_LEAVE >", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_LEAVE >=", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveLessThan(String value) {
            addCriterion("WORK_LEAVE <", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveLessThanOrEqualTo(String value) {
            addCriterion("WORK_LEAVE <=", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveLike(String value) {
            addCriterion("WORK_LEAVE like", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveNotLike(String value) {
            addCriterion("WORK_LEAVE not like", value, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveIn(List<String> values) {
            addCriterion("WORK_LEAVE in", values, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveNotIn(List<String> values) {
            addCriterion("WORK_LEAVE not in", values, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveBetween(String value1, String value2) {
            addCriterion("WORK_LEAVE between", value1, value2, "workLeave");
            return (Criteria) this;
        }

        public Criteria andWorkLeaveNotBetween(String value1, String value2) {
            addCriterion("WORK_LEAVE not between", value1, value2, "workLeave");
            return (Criteria) this;
        }

        public Criteria andLeavePriceIsNull() {
            addCriterion("LEAVE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andLeavePriceIsNotNull() {
            addCriterion("LEAVE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLeavePriceEqualTo(Double value) {
            addCriterion("LEAVE_PRICE =", value, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceNotEqualTo(Double value) {
            addCriterion("LEAVE_PRICE <>", value, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceGreaterThan(Double value) {
            addCriterion("LEAVE_PRICE >", value, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("LEAVE_PRICE >=", value, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceLessThan(Double value) {
            addCriterion("LEAVE_PRICE <", value, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceLessThanOrEqualTo(Double value) {
            addCriterion("LEAVE_PRICE <=", value, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceIn(List<Double> values) {
            addCriterion("LEAVE_PRICE in", values, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceNotIn(List<Double> values) {
            addCriterion("LEAVE_PRICE not in", values, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceBetween(Double value1, Double value2) {
            addCriterion("LEAVE_PRICE between", value1, value2, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andLeavePriceNotBetween(Double value1, Double value2) {
            addCriterion("LEAVE_PRICE not between", value1, value2, "leavePrice");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateIsNull() {
            addCriterion("PROJECT_BEGDATE is null");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateIsNotNull() {
            addCriterion("PROJECT_BEGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_BEGDATE =", value, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_BEGDATE <>", value, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateGreaterThan(Date value) {
            addCriterionForJDBCDate("PROJECT_BEGDATE >", value, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_BEGDATE >=", value, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateLessThan(Date value) {
            addCriterionForJDBCDate("PROJECT_BEGDATE <", value, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_BEGDATE <=", value, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateIn(List<Date> values) {
            addCriterionForJDBCDate("PROJECT_BEGDATE in", values, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PROJECT_BEGDATE not in", values, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROJECT_BEGDATE between", value1, value2, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectBegdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROJECT_BEGDATE not between", value1, value2, "projectBegdate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateIsNull() {
            addCriterion("PROJECT_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateIsNotNull() {
            addCriterion("PROJECT_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_ENDDATE =", value, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_ENDDATE <>", value, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("PROJECT_ENDDATE >", value, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_ENDDATE >=", value, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateLessThan(Date value) {
            addCriterionForJDBCDate("PROJECT_ENDDATE <", value, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROJECT_ENDDATE <=", value, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("PROJECT_ENDDATE in", values, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PROJECT_ENDDATE not in", values, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROJECT_ENDDATE between", value1, value2, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROJECT_ENDDATE not between", value1, value2, "projectEnddate");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIsNull() {
            addCriterion("PROJECT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIsNotNull() {
            addCriterion("PROJECT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberEqualTo(Integer value) {
            addCriterion("PROJECT_NUMBER =", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotEqualTo(Integer value) {
            addCriterion("PROJECT_NUMBER <>", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThan(Integer value) {
            addCriterion("PROJECT_NUMBER >", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_NUMBER >=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThan(Integer value) {
            addCriterion("PROJECT_NUMBER <", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_NUMBER <=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIn(List<Integer> values) {
            addCriterion("PROJECT_NUMBER in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotIn(List<Integer> values) {
            addCriterion("PROJECT_NUMBER not in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_NUMBER between", value1, value2, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_NUMBER not between", value1, value2, "projectNumber");
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