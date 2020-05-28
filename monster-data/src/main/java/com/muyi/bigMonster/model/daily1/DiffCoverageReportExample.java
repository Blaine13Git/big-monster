package com.muyi.bigMonster.model.daily1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiffCoverageReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiffCoverageReportExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlIsNull() {
            addCriterion("repositoryUrl is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlIsNotNull() {
            addCriterion("repositoryUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlEqualTo(String value) {
            addCriterion("repositoryUrl =", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlNotEqualTo(String value) {
            addCriterion("repositoryUrl <>", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlGreaterThan(String value) {
            addCriterion("repositoryUrl >", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlGreaterThanOrEqualTo(String value) {
            addCriterion("repositoryUrl >=", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlLessThan(String value) {
            addCriterion("repositoryUrl <", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlLessThanOrEqualTo(String value) {
            addCriterion("repositoryUrl <=", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlLike(String value) {
            addCriterion("repositoryUrl like", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlNotLike(String value) {
            addCriterion("repositoryUrl not like", value, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlIn(List<String> values) {
            addCriterion("repositoryUrl in", values, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlNotIn(List<String> values) {
            addCriterion("repositoryUrl not in", values, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlBetween(String value1, String value2) {
            addCriterion("repositoryUrl between", value1, value2, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andRepositoryurlNotBetween(String value1, String value2) {
            addCriterion("repositoryUrl not between", value1, value2, "repositoryurl");
            return (Criteria) this;
        }

        public Criteria andBasebranchIsNull() {
            addCriterion("baseBranch is null");
            return (Criteria) this;
        }

        public Criteria andBasebranchIsNotNull() {
            addCriterion("baseBranch is not null");
            return (Criteria) this;
        }

        public Criteria andBasebranchEqualTo(String value) {
            addCriterion("baseBranch =", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchNotEqualTo(String value) {
            addCriterion("baseBranch <>", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchGreaterThan(String value) {
            addCriterion("baseBranch >", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchGreaterThanOrEqualTo(String value) {
            addCriterion("baseBranch >=", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchLessThan(String value) {
            addCriterion("baseBranch <", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchLessThanOrEqualTo(String value) {
            addCriterion("baseBranch <=", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchLike(String value) {
            addCriterion("baseBranch like", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchNotLike(String value) {
            addCriterion("baseBranch not like", value, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchIn(List<String> values) {
            addCriterion("baseBranch in", values, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchNotIn(List<String> values) {
            addCriterion("baseBranch not in", values, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchBetween(String value1, String value2) {
            addCriterion("baseBranch between", value1, value2, "basebranch");
            return (Criteria) this;
        }

        public Criteria andBasebranchNotBetween(String value1, String value2) {
            addCriterion("baseBranch not between", value1, value2, "basebranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchIsNull() {
            addCriterion("diffBranch is null");
            return (Criteria) this;
        }

        public Criteria andDiffbranchIsNotNull() {
            addCriterion("diffBranch is not null");
            return (Criteria) this;
        }

        public Criteria andDiffbranchEqualTo(String value) {
            addCriterion("diffBranch =", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchNotEqualTo(String value) {
            addCriterion("diffBranch <>", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchGreaterThan(String value) {
            addCriterion("diffBranch >", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchGreaterThanOrEqualTo(String value) {
            addCriterion("diffBranch >=", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchLessThan(String value) {
            addCriterion("diffBranch <", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchLessThanOrEqualTo(String value) {
            addCriterion("diffBranch <=", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchLike(String value) {
            addCriterion("diffBranch like", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchNotLike(String value) {
            addCriterion("diffBranch not like", value, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchIn(List<String> values) {
            addCriterion("diffBranch in", values, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchNotIn(List<String> values) {
            addCriterion("diffBranch not in", values, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchBetween(String value1, String value2) {
            addCriterion("diffBranch between", value1, value2, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andDiffbranchNotBetween(String value1, String value2) {
            addCriterion("diffBranch not between", value1, value2, "diffbranch");
            return (Criteria) this;
        }

        public Criteria andBasecommitidIsNull() {
            addCriterion("baseCommitId is null");
            return (Criteria) this;
        }

        public Criteria andBasecommitidIsNotNull() {
            addCriterion("baseCommitId is not null");
            return (Criteria) this;
        }

        public Criteria andBasecommitidEqualTo(String value) {
            addCriterion("baseCommitId =", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidNotEqualTo(String value) {
            addCriterion("baseCommitId <>", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidGreaterThan(String value) {
            addCriterion("baseCommitId >", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidGreaterThanOrEqualTo(String value) {
            addCriterion("baseCommitId >=", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidLessThan(String value) {
            addCriterion("baseCommitId <", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidLessThanOrEqualTo(String value) {
            addCriterion("baseCommitId <=", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidLike(String value) {
            addCriterion("baseCommitId like", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidNotLike(String value) {
            addCriterion("baseCommitId not like", value, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidIn(List<String> values) {
            addCriterion("baseCommitId in", values, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidNotIn(List<String> values) {
            addCriterion("baseCommitId not in", values, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidBetween(String value1, String value2) {
            addCriterion("baseCommitId between", value1, value2, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andBasecommitidNotBetween(String value1, String value2) {
            addCriterion("baseCommitId not between", value1, value2, "basecommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidIsNull() {
            addCriterion("diffCommitId is null");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidIsNotNull() {
            addCriterion("diffCommitId is not null");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidEqualTo(String value) {
            addCriterion("diffCommitId =", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidNotEqualTo(String value) {
            addCriterion("diffCommitId <>", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidGreaterThan(String value) {
            addCriterion("diffCommitId >", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidGreaterThanOrEqualTo(String value) {
            addCriterion("diffCommitId >=", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidLessThan(String value) {
            addCriterion("diffCommitId <", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidLessThanOrEqualTo(String value) {
            addCriterion("diffCommitId <=", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidLike(String value) {
            addCriterion("diffCommitId like", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidNotLike(String value) {
            addCriterion("diffCommitId not like", value, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidIn(List<String> values) {
            addCriterion("diffCommitId in", values, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidNotIn(List<String> values) {
            addCriterion("diffCommitId not in", values, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidBetween(String value1, String value2) {
            addCriterion("diffCommitId between", value1, value2, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andDiffcommitidNotBetween(String value1, String value2) {
            addCriterion("diffCommitId not between", value1, value2, "diffcommitid");
            return (Criteria) this;
        }

        public Criteria andExecfilepathIsNull() {
            addCriterion("execFilePath is null");
            return (Criteria) this;
        }

        public Criteria andExecfilepathIsNotNull() {
            addCriterion("execFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andExecfilepathEqualTo(String value) {
            addCriterion("execFilePath =", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathNotEqualTo(String value) {
            addCriterion("execFilePath <>", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathGreaterThan(String value) {
            addCriterion("execFilePath >", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("execFilePath >=", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathLessThan(String value) {
            addCriterion("execFilePath <", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathLessThanOrEqualTo(String value) {
            addCriterion("execFilePath <=", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathLike(String value) {
            addCriterion("execFilePath like", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathNotLike(String value) {
            addCriterion("execFilePath not like", value, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathIn(List<String> values) {
            addCriterion("execFilePath in", values, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathNotIn(List<String> values) {
            addCriterion("execFilePath not in", values, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathBetween(String value1, String value2) {
            addCriterion("execFilePath between", value1, value2, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andExecfilepathNotBetween(String value1, String value2) {
            addCriterion("execFilePath not between", value1, value2, "execfilepath");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNull() {
            addCriterion("sessionId is null");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNotNull() {
            addCriterion("sessionId is not null");
            return (Criteria) this;
        }

        public Criteria andSessionidEqualTo(String value) {
            addCriterion("sessionId =", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotEqualTo(String value) {
            addCriterion("sessionId <>", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThan(String value) {
            addCriterion("sessionId >", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThanOrEqualTo(String value) {
            addCriterion("sessionId >=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThan(String value) {
            addCriterion("sessionId <", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThanOrEqualTo(String value) {
            addCriterion("sessionId <=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLike(String value) {
            addCriterion("sessionId like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotLike(String value) {
            addCriterion("sessionId not like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidIn(List<String> values) {
            addCriterion("sessionId in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotIn(List<String> values) {
            addCriterion("sessionId not in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidBetween(String value1, String value2) {
            addCriterion("sessionId between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotBetween(String value1, String value2) {
            addCriterion("sessionId not between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andReporturlIsNull() {
            addCriterion("reportUrl is null");
            return (Criteria) this;
        }

        public Criteria andReporturlIsNotNull() {
            addCriterion("reportUrl is not null");
            return (Criteria) this;
        }

        public Criteria andReporturlEqualTo(String value) {
            addCriterion("reportUrl =", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlNotEqualTo(String value) {
            addCriterion("reportUrl <>", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlGreaterThan(String value) {
            addCriterion("reportUrl >", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlGreaterThanOrEqualTo(String value) {
            addCriterion("reportUrl >=", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlLessThan(String value) {
            addCriterion("reportUrl <", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlLessThanOrEqualTo(String value) {
            addCriterion("reportUrl <=", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlLike(String value) {
            addCriterion("reportUrl like", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlNotLike(String value) {
            addCriterion("reportUrl not like", value, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlIn(List<String> values) {
            addCriterion("reportUrl in", values, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlNotIn(List<String> values) {
            addCriterion("reportUrl not in", values, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlBetween(String value1, String value2) {
            addCriterion("reportUrl between", value1, value2, "reporturl");
            return (Criteria) this;
        }

        public Criteria andReporturlNotBetween(String value1, String value2) {
            addCriterion("reportUrl not between", value1, value2, "reporturl");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberIsNull() {
            addCriterion("classFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberIsNotNull() {
            addCriterion("classFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberEqualTo(Long value) {
            addCriterion("classFileNumber =", value, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberNotEqualTo(Long value) {
            addCriterion("classFileNumber <>", value, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberGreaterThan(Long value) {
            addCriterion("classFileNumber >", value, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberGreaterThanOrEqualTo(Long value) {
            addCriterion("classFileNumber >=", value, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberLessThan(Long value) {
            addCriterion("classFileNumber <", value, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberLessThanOrEqualTo(Long value) {
            addCriterion("classFileNumber <=", value, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberIn(List<Long> values) {
            addCriterion("classFileNumber in", values, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberNotIn(List<Long> values) {
            addCriterion("classFileNumber not in", values, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberBetween(Long value1, Long value2) {
            addCriterion("classFileNumber between", value1, value2, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andClassfilenumberNotBetween(Long value1, Long value2) {
            addCriterion("classFileNumber not between", value1, value2, "classfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberIsNull() {
            addCriterion("methodFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberIsNotNull() {
            addCriterion("methodFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberEqualTo(Long value) {
            addCriterion("methodFileNumber =", value, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberNotEqualTo(Long value) {
            addCriterion("methodFileNumber <>", value, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberGreaterThan(Long value) {
            addCriterion("methodFileNumber >", value, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberGreaterThanOrEqualTo(Long value) {
            addCriterion("methodFileNumber >=", value, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberLessThan(Long value) {
            addCriterion("methodFileNumber <", value, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberLessThanOrEqualTo(Long value) {
            addCriterion("methodFileNumber <=", value, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberIn(List<Long> values) {
            addCriterion("methodFileNumber in", values, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberNotIn(List<Long> values) {
            addCriterion("methodFileNumber not in", values, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberBetween(Long value1, Long value2) {
            addCriterion("methodFileNumber between", value1, value2, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andMethodfilenumberNotBetween(Long value1, Long value2) {
            addCriterion("methodFileNumber not between", value1, value2, "methodfilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberIsNull() {
            addCriterion("lineFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberIsNotNull() {
            addCriterion("lineFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberEqualTo(Long value) {
            addCriterion("lineFileNumber =", value, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberNotEqualTo(Long value) {
            addCriterion("lineFileNumber <>", value, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberGreaterThan(Long value) {
            addCriterion("lineFileNumber >", value, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberGreaterThanOrEqualTo(Long value) {
            addCriterion("lineFileNumber >=", value, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberLessThan(Long value) {
            addCriterion("lineFileNumber <", value, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberLessThanOrEqualTo(Long value) {
            addCriterion("lineFileNumber <=", value, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberIn(List<Long> values) {
            addCriterion("lineFileNumber in", values, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberNotIn(List<Long> values) {
            addCriterion("lineFileNumber not in", values, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberBetween(Long value1, Long value2) {
            addCriterion("lineFileNumber between", value1, value2, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andLinefilenumberNotBetween(Long value1, Long value2) {
            addCriterion("lineFileNumber not between", value1, value2, "linefilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberIsNull() {
            addCriterion("diffClassFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberIsNotNull() {
            addCriterion("diffClassFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberEqualTo(String value) {
            addCriterion("diffClassFileNumber =", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberNotEqualTo(String value) {
            addCriterion("diffClassFileNumber <>", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberGreaterThan(String value) {
            addCriterion("diffClassFileNumber >", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("diffClassFileNumber >=", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberLessThan(String value) {
            addCriterion("diffClassFileNumber <", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberLessThanOrEqualTo(String value) {
            addCriterion("diffClassFileNumber <=", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberLike(String value) {
            addCriterion("diffClassFileNumber like", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberNotLike(String value) {
            addCriterion("diffClassFileNumber not like", value, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberIn(List<String> values) {
            addCriterion("diffClassFileNumber in", values, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberNotIn(List<String> values) {
            addCriterion("diffClassFileNumber not in", values, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberBetween(String value1, String value2) {
            addCriterion("diffClassFileNumber between", value1, value2, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffclassfilenumberNotBetween(String value1, String value2) {
            addCriterion("diffClassFileNumber not between", value1, value2, "diffclassfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberIsNull() {
            addCriterion("addFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberIsNotNull() {
            addCriterion("addFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberEqualTo(String value) {
            addCriterion("addFileNumber =", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberNotEqualTo(String value) {
            addCriterion("addFileNumber <>", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberGreaterThan(String value) {
            addCriterion("addFileNumber >", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("addFileNumber >=", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberLessThan(String value) {
            addCriterion("addFileNumber <", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberLessThanOrEqualTo(String value) {
            addCriterion("addFileNumber <=", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberLike(String value) {
            addCriterion("addFileNumber like", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberNotLike(String value) {
            addCriterion("addFileNumber not like", value, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberIn(List<String> values) {
            addCriterion("addFileNumber in", values, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberNotIn(List<String> values) {
            addCriterion("addFileNumber not in", values, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberBetween(String value1, String value2) {
            addCriterion("addFileNumber between", value1, value2, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddfilenumberNotBetween(String value1, String value2) {
            addCriterion("addFileNumber not between", value1, value2, "addfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberIsNull() {
            addCriterion("modifyFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberIsNotNull() {
            addCriterion("modifyFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberEqualTo(String value) {
            addCriterion("modifyFileNumber =", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberNotEqualTo(String value) {
            addCriterion("modifyFileNumber <>", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberGreaterThan(String value) {
            addCriterion("modifyFileNumber >", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("modifyFileNumber >=", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberLessThan(String value) {
            addCriterion("modifyFileNumber <", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberLessThanOrEqualTo(String value) {
            addCriterion("modifyFileNumber <=", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberLike(String value) {
            addCriterion("modifyFileNumber like", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberNotLike(String value) {
            addCriterion("modifyFileNumber not like", value, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberIn(List<String> values) {
            addCriterion("modifyFileNumber in", values, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberNotIn(List<String> values) {
            addCriterion("modifyFileNumber not in", values, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberBetween(String value1, String value2) {
            addCriterion("modifyFileNumber between", value1, value2, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andModifyfilenumberNotBetween(String value1, String value2) {
            addCriterion("modifyFileNumber not between", value1, value2, "modifyfilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberIsNull() {
            addCriterion("deleteFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberIsNotNull() {
            addCriterion("deleteFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberEqualTo(String value) {
            addCriterion("deleteFileNumber =", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberNotEqualTo(String value) {
            addCriterion("deleteFileNumber <>", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberGreaterThan(String value) {
            addCriterion("deleteFileNumber >", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("deleteFileNumber >=", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberLessThan(String value) {
            addCriterion("deleteFileNumber <", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberLessThanOrEqualTo(String value) {
            addCriterion("deleteFileNumber <=", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberLike(String value) {
            addCriterion("deleteFileNumber like", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberNotLike(String value) {
            addCriterion("deleteFileNumber not like", value, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberIn(List<String> values) {
            addCriterion("deleteFileNumber in", values, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberNotIn(List<String> values) {
            addCriterion("deleteFileNumber not in", values, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberBetween(String value1, String value2) {
            addCriterion("deleteFileNumber between", value1, value2, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDeletefilenumberNotBetween(String value1, String value2) {
            addCriterion("deleteFileNumber not between", value1, value2, "deletefilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberIsNull() {
            addCriterion("diffMethodFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberIsNotNull() {
            addCriterion("diffMethodFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberEqualTo(String value) {
            addCriterion("diffMethodFileNumber =", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberNotEqualTo(String value) {
            addCriterion("diffMethodFileNumber <>", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberGreaterThan(String value) {
            addCriterion("diffMethodFileNumber >", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("diffMethodFileNumber >=", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberLessThan(String value) {
            addCriterion("diffMethodFileNumber <", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberLessThanOrEqualTo(String value) {
            addCriterion("diffMethodFileNumber <=", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberLike(String value) {
            addCriterion("diffMethodFileNumber like", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberNotLike(String value) {
            addCriterion("diffMethodFileNumber not like", value, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberIn(List<String> values) {
            addCriterion("diffMethodFileNumber in", values, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberNotIn(List<String> values) {
            addCriterion("diffMethodFileNumber not in", values, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberBetween(String value1, String value2) {
            addCriterion("diffMethodFileNumber between", value1, value2, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andDiffmethodfilenumberNotBetween(String value1, String value2) {
            addCriterion("diffMethodFileNumber not between", value1, value2, "diffmethodfilenumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberIsNull() {
            addCriterion("addMethodNumber is null");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberIsNotNull() {
            addCriterion("addMethodNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberEqualTo(String value) {
            addCriterion("addMethodNumber =", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberNotEqualTo(String value) {
            addCriterion("addMethodNumber <>", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberGreaterThan(String value) {
            addCriterion("addMethodNumber >", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberGreaterThanOrEqualTo(String value) {
            addCriterion("addMethodNumber >=", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberLessThan(String value) {
            addCriterion("addMethodNumber <", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberLessThanOrEqualTo(String value) {
            addCriterion("addMethodNumber <=", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberLike(String value) {
            addCriterion("addMethodNumber like", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberNotLike(String value) {
            addCriterion("addMethodNumber not like", value, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberIn(List<String> values) {
            addCriterion("addMethodNumber in", values, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberNotIn(List<String> values) {
            addCriterion("addMethodNumber not in", values, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberBetween(String value1, String value2) {
            addCriterion("addMethodNumber between", value1, value2, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andAddmethodnumberNotBetween(String value1, String value2) {
            addCriterion("addMethodNumber not between", value1, value2, "addmethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberIsNull() {
            addCriterion("modifyMethodNumber is null");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberIsNotNull() {
            addCriterion("modifyMethodNumber is not null");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberEqualTo(String value) {
            addCriterion("modifyMethodNumber =", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberNotEqualTo(String value) {
            addCriterion("modifyMethodNumber <>", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberGreaterThan(String value) {
            addCriterion("modifyMethodNumber >", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberGreaterThanOrEqualTo(String value) {
            addCriterion("modifyMethodNumber >=", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberLessThan(String value) {
            addCriterion("modifyMethodNumber <", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberLessThanOrEqualTo(String value) {
            addCriterion("modifyMethodNumber <=", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberLike(String value) {
            addCriterion("modifyMethodNumber like", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberNotLike(String value) {
            addCriterion("modifyMethodNumber not like", value, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberIn(List<String> values) {
            addCriterion("modifyMethodNumber in", values, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberNotIn(List<String> values) {
            addCriterion("modifyMethodNumber not in", values, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberBetween(String value1, String value2) {
            addCriterion("modifyMethodNumber between", value1, value2, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andModifymethodnumberNotBetween(String value1, String value2) {
            addCriterion("modifyMethodNumber not between", value1, value2, "modifymethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberIsNull() {
            addCriterion("deleteMethodNumber is null");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberIsNotNull() {
            addCriterion("deleteMethodNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberEqualTo(String value) {
            addCriterion("deleteMethodNumber =", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberNotEqualTo(String value) {
            addCriterion("deleteMethodNumber <>", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberGreaterThan(String value) {
            addCriterion("deleteMethodNumber >", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberGreaterThanOrEqualTo(String value) {
            addCriterion("deleteMethodNumber >=", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberLessThan(String value) {
            addCriterion("deleteMethodNumber <", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberLessThanOrEqualTo(String value) {
            addCriterion("deleteMethodNumber <=", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberLike(String value) {
            addCriterion("deleteMethodNumber like", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberNotLike(String value) {
            addCriterion("deleteMethodNumber not like", value, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberIn(List<String> values) {
            addCriterion("deleteMethodNumber in", values, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberNotIn(List<String> values) {
            addCriterion("deleteMethodNumber not in", values, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberBetween(String value1, String value2) {
            addCriterion("deleteMethodNumber between", value1, value2, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDeletemethodnumberNotBetween(String value1, String value2) {
            addCriterion("deleteMethodNumber not between", value1, value2, "deletemethodnumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberIsNull() {
            addCriterion("diffLineFileNumber is null");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberIsNotNull() {
            addCriterion("diffLineFileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberEqualTo(String value) {
            addCriterion("diffLineFileNumber =", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberNotEqualTo(String value) {
            addCriterion("diffLineFileNumber <>", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberGreaterThan(String value) {
            addCriterion("diffLineFileNumber >", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("diffLineFileNumber >=", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberLessThan(String value) {
            addCriterion("diffLineFileNumber <", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberLessThanOrEqualTo(String value) {
            addCriterion("diffLineFileNumber <=", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberLike(String value) {
            addCriterion("diffLineFileNumber like", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberNotLike(String value) {
            addCriterion("diffLineFileNumber not like", value, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberIn(List<String> values) {
            addCriterion("diffLineFileNumber in", values, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberNotIn(List<String> values) {
            addCriterion("diffLineFileNumber not in", values, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberBetween(String value1, String value2) {
            addCriterion("diffLineFileNumber between", value1, value2, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andDifflinefilenumberNotBetween(String value1, String value2) {
            addCriterion("diffLineFileNumber not between", value1, value2, "difflinefilenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberIsNull() {
            addCriterion("addLineNumber is null");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberIsNotNull() {
            addCriterion("addLineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberEqualTo(String value) {
            addCriterion("addLineNumber =", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberNotEqualTo(String value) {
            addCriterion("addLineNumber <>", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberGreaterThan(String value) {
            addCriterion("addLineNumber >", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberGreaterThanOrEqualTo(String value) {
            addCriterion("addLineNumber >=", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberLessThan(String value) {
            addCriterion("addLineNumber <", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberLessThanOrEqualTo(String value) {
            addCriterion("addLineNumber <=", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberLike(String value) {
            addCriterion("addLineNumber like", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberNotLike(String value) {
            addCriterion("addLineNumber not like", value, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberIn(List<String> values) {
            addCriterion("addLineNumber in", values, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberNotIn(List<String> values) {
            addCriterion("addLineNumber not in", values, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberBetween(String value1, String value2) {
            addCriterion("addLineNumber between", value1, value2, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andAddlinenumberNotBetween(String value1, String value2) {
            addCriterion("addLineNumber not between", value1, value2, "addlinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberIsNull() {
            addCriterion("modifyLineNumber is null");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberIsNotNull() {
            addCriterion("modifyLineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberEqualTo(String value) {
            addCriterion("modifyLineNumber =", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberNotEqualTo(String value) {
            addCriterion("modifyLineNumber <>", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberGreaterThan(String value) {
            addCriterion("modifyLineNumber >", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberGreaterThanOrEqualTo(String value) {
            addCriterion("modifyLineNumber >=", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberLessThan(String value) {
            addCriterion("modifyLineNumber <", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberLessThanOrEqualTo(String value) {
            addCriterion("modifyLineNumber <=", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberLike(String value) {
            addCriterion("modifyLineNumber like", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberNotLike(String value) {
            addCriterion("modifyLineNumber not like", value, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberIn(List<String> values) {
            addCriterion("modifyLineNumber in", values, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberNotIn(List<String> values) {
            addCriterion("modifyLineNumber not in", values, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberBetween(String value1, String value2) {
            addCriterion("modifyLineNumber between", value1, value2, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andModifylinenumberNotBetween(String value1, String value2) {
            addCriterion("modifyLineNumber not between", value1, value2, "modifylinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberIsNull() {
            addCriterion("deleteLineNumber is null");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberIsNotNull() {
            addCriterion("deleteLineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberEqualTo(String value) {
            addCriterion("deleteLineNumber =", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberNotEqualTo(String value) {
            addCriterion("deleteLineNumber <>", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberGreaterThan(String value) {
            addCriterion("deleteLineNumber >", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberGreaterThanOrEqualTo(String value) {
            addCriterion("deleteLineNumber >=", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberLessThan(String value) {
            addCriterion("deleteLineNumber <", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberLessThanOrEqualTo(String value) {
            addCriterion("deleteLineNumber <=", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberLike(String value) {
            addCriterion("deleteLineNumber like", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberNotLike(String value) {
            addCriterion("deleteLineNumber not like", value, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberIn(List<String> values) {
            addCriterion("deleteLineNumber in", values, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberNotIn(List<String> values) {
            addCriterion("deleteLineNumber not in", values, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberBetween(String value1, String value2) {
            addCriterion("deleteLineNumber between", value1, value2, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andDeletelinenumberNotBetween(String value1, String value2) {
            addCriterion("deleteLineNumber not between", value1, value2, "deletelinenumber");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentIsNull() {
            addCriterion("classCoveragePercent is null");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentIsNotNull() {
            addCriterion("classCoveragePercent is not null");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentEqualTo(Integer value) {
            addCriterion("classCoveragePercent =", value, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentNotEqualTo(Integer value) {
            addCriterion("classCoveragePercent <>", value, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentGreaterThan(Integer value) {
            addCriterion("classCoveragePercent >", value, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("classCoveragePercent >=", value, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentLessThan(Integer value) {
            addCriterion("classCoveragePercent <", value, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentLessThanOrEqualTo(Integer value) {
            addCriterion("classCoveragePercent <=", value, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentIn(List<Integer> values) {
            addCriterion("classCoveragePercent in", values, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentNotIn(List<Integer> values) {
            addCriterion("classCoveragePercent not in", values, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentBetween(Integer value1, Integer value2) {
            addCriterion("classCoveragePercent between", value1, value2, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andClasscoveragepercentNotBetween(Integer value1, Integer value2) {
            addCriterion("classCoveragePercent not between", value1, value2, "classcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentIsNull() {
            addCriterion("methodCoveragePercent is null");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentIsNotNull() {
            addCriterion("methodCoveragePercent is not null");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentEqualTo(Integer value) {
            addCriterion("methodCoveragePercent =", value, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentNotEqualTo(Integer value) {
            addCriterion("methodCoveragePercent <>", value, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentGreaterThan(Integer value) {
            addCriterion("methodCoveragePercent >", value, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("methodCoveragePercent >=", value, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentLessThan(Integer value) {
            addCriterion("methodCoveragePercent <", value, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentLessThanOrEqualTo(Integer value) {
            addCriterion("methodCoveragePercent <=", value, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentIn(List<Integer> values) {
            addCriterion("methodCoveragePercent in", values, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentNotIn(List<Integer> values) {
            addCriterion("methodCoveragePercent not in", values, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentBetween(Integer value1, Integer value2) {
            addCriterion("methodCoveragePercent between", value1, value2, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andMethodcoveragepercentNotBetween(Integer value1, Integer value2) {
            addCriterion("methodCoveragePercent not between", value1, value2, "methodcoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentIsNull() {
            addCriterion("lineCoveragePercent is null");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentIsNotNull() {
            addCriterion("lineCoveragePercent is not null");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentEqualTo(Long value) {
            addCriterion("lineCoveragePercent =", value, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentNotEqualTo(Long value) {
            addCriterion("lineCoveragePercent <>", value, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentGreaterThan(Long value) {
            addCriterion("lineCoveragePercent >", value, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentGreaterThanOrEqualTo(Long value) {
            addCriterion("lineCoveragePercent >=", value, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentLessThan(Long value) {
            addCriterion("lineCoveragePercent <", value, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentLessThanOrEqualTo(Long value) {
            addCriterion("lineCoveragePercent <=", value, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentIn(List<Long> values) {
            addCriterion("lineCoveragePercent in", values, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentNotIn(List<Long> values) {
            addCriterion("lineCoveragePercent not in", values, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentBetween(Long value1, Long value2) {
            addCriterion("lineCoveragePercent between", value1, value2, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andLinecoveragepercentNotBetween(Long value1, Long value2) {
            addCriterion("lineCoveragePercent not between", value1, value2, "linecoveragepercent");
            return (Criteria) this;
        }

        public Criteria andTesterIsNull() {
            addCriterion("tester is null");
            return (Criteria) this;
        }

        public Criteria andTesterIsNotNull() {
            addCriterion("tester is not null");
            return (Criteria) this;
        }

        public Criteria andTesterEqualTo(String value) {
            addCriterion("tester =", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotEqualTo(String value) {
            addCriterion("tester <>", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThan(String value) {
            addCriterion("tester >", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThanOrEqualTo(String value) {
            addCriterion("tester >=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThan(String value) {
            addCriterion("tester <", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThanOrEqualTo(String value) {
            addCriterion("tester <=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLike(String value) {
            addCriterion("tester like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotLike(String value) {
            addCriterion("tester not like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterIn(List<String> values) {
            addCriterion("tester in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotIn(List<String> values) {
            addCriterion("tester not in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterBetween(String value1, String value2) {
            addCriterion("tester between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotBetween(String value1, String value2) {
            addCriterion("tester not between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Boolean value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Boolean value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Boolean value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Boolean value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Boolean> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Boolean> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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