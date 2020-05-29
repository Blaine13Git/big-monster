package com.muyi.bigMonster.model.daily1;

import java.io.Serializable;
import java.util.Date;

public class DiffCoverageReport implements Serializable {
    private Integer id;

    private String projectname;

    private String repositoryurl;

    private String basebranch;

    private String diffbranch;

    private String basecommitid;

    private String diffcommitid;

    private String execfilepath;

    private String sessionid;

    private String reporturl;

    private Long classfilenumber;

    private Long methodfilenumber;

    private Long linefilenumber;

    private String diffclassfilenumber;

    private String addfilenumber;

    private String modifyfilenumber;

    private String deletefilenumber;

    private String diffmethodfilenumber;

    private String addmethodnumber;

    private String modifymethodnumber;

    private String deletemethodnumber;

    private String difflinefilenumber;

    private String addlinenumber;

    private String modifylinenumber;

    private String deletelinenumber;

    private Integer classcoveragepercent;

    private Integer methodcoveragepercent;

    private Long linecoveragepercent;

    private String tester;

    private Boolean isdelete;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public DiffCoverageReport withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public DiffCoverageReport withProjectname(String projectname) {
        this.setProjectname(projectname);
        return this;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getRepositoryurl() {
        return repositoryurl;
    }

    public DiffCoverageReport withRepositoryurl(String repositoryurl) {
        this.setRepositoryurl(repositoryurl);
        return this;
    }

    public void setRepositoryurl(String repositoryurl) {
        this.repositoryurl = repositoryurl == null ? null : repositoryurl.trim();
    }

    public String getBasebranch() {
        return basebranch;
    }

    public DiffCoverageReport withBasebranch(String basebranch) {
        this.setBasebranch(basebranch);
        return this;
    }

    public void setBasebranch(String basebranch) {
        this.basebranch = basebranch == null ? null : basebranch.trim();
    }

    public String getDiffbranch() {
        return diffbranch;
    }

    public DiffCoverageReport withDiffbranch(String diffbranch) {
        this.setDiffbranch(diffbranch);
        return this;
    }

    public void setDiffbranch(String diffbranch) {
        this.diffbranch = diffbranch == null ? null : diffbranch.trim();
    }

    public String getBasecommitid() {
        return basecommitid;
    }

    public DiffCoverageReport withBasecommitid(String basecommitid) {
        this.setBasecommitid(basecommitid);
        return this;
    }

    public void setBasecommitid(String basecommitid) {
        this.basecommitid = basecommitid == null ? null : basecommitid.trim();
    }

    public String getDiffcommitid() {
        return diffcommitid;
    }

    public DiffCoverageReport withDiffcommitid(String diffcommitid) {
        this.setDiffcommitid(diffcommitid);
        return this;
    }

    public void setDiffcommitid(String diffcommitid) {
        this.diffcommitid = diffcommitid == null ? null : diffcommitid.trim();
    }

    public String getExecfilepath() {
        return execfilepath;
    }

    public DiffCoverageReport withExecfilepath(String execfilepath) {
        this.setExecfilepath(execfilepath);
        return this;
    }

    public void setExecfilepath(String execfilepath) {
        this.execfilepath = execfilepath == null ? null : execfilepath.trim();
    }

    public String getSessionid() {
        return sessionid;
    }

    public DiffCoverageReport withSessionid(String sessionid) {
        this.setSessionid(sessionid);
        return this;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public String getReporturl() {
        return reporturl;
    }

    public DiffCoverageReport withReporturl(String reporturl) {
        this.setReporturl(reporturl);
        return this;
    }

    public void setReporturl(String reporturl) {
        this.reporturl = reporturl == null ? null : reporturl.trim();
    }

    public Long getClassfilenumber() {
        return classfilenumber;
    }

    public DiffCoverageReport withClassfilenumber(Long classfilenumber) {
        this.setClassfilenumber(classfilenumber);
        return this;
    }

    public void setClassfilenumber(Long classfilenumber) {
        this.classfilenumber = classfilenumber;
    }

    public Long getMethodfilenumber() {
        return methodfilenumber;
    }

    public DiffCoverageReport withMethodfilenumber(Long methodfilenumber) {
        this.setMethodfilenumber(methodfilenumber);
        return this;
    }

    public void setMethodfilenumber(Long methodfilenumber) {
        this.methodfilenumber = methodfilenumber;
    }

    public Long getLinefilenumber() {
        return linefilenumber;
    }

    public DiffCoverageReport withLinefilenumber(Long linefilenumber) {
        this.setLinefilenumber(linefilenumber);
        return this;
    }

    public void setLinefilenumber(Long linefilenumber) {
        this.linefilenumber = linefilenumber;
    }

    public String getDiffclassfilenumber() {
        return diffclassfilenumber;
    }

    public DiffCoverageReport withDiffclassfilenumber(String diffclassfilenumber) {
        this.setDiffclassfilenumber(diffclassfilenumber);
        return this;
    }

    public void setDiffclassfilenumber(String diffclassfilenumber) {
        this.diffclassfilenumber = diffclassfilenumber == null ? null : diffclassfilenumber.trim();
    }

    public String getAddfilenumber() {
        return addfilenumber;
    }

    public DiffCoverageReport withAddfilenumber(String addfilenumber) {
        this.setAddfilenumber(addfilenumber);
        return this;
    }

    public void setAddfilenumber(String addfilenumber) {
        this.addfilenumber = addfilenumber == null ? null : addfilenumber.trim();
    }

    public String getModifyfilenumber() {
        return modifyfilenumber;
    }

    public DiffCoverageReport withModifyfilenumber(String modifyfilenumber) {
        this.setModifyfilenumber(modifyfilenumber);
        return this;
    }

    public void setModifyfilenumber(String modifyfilenumber) {
        this.modifyfilenumber = modifyfilenumber == null ? null : modifyfilenumber.trim();
    }

    public String getDeletefilenumber() {
        return deletefilenumber;
    }

    public DiffCoverageReport withDeletefilenumber(String deletefilenumber) {
        this.setDeletefilenumber(deletefilenumber);
        return this;
    }

    public void setDeletefilenumber(String deletefilenumber) {
        this.deletefilenumber = deletefilenumber == null ? null : deletefilenumber.trim();
    }

    public String getDiffmethodfilenumber() {
        return diffmethodfilenumber;
    }

    public DiffCoverageReport withDiffmethodfilenumber(String diffmethodfilenumber) {
        this.setDiffmethodfilenumber(diffmethodfilenumber);
        return this;
    }

    public void setDiffmethodfilenumber(String diffmethodfilenumber) {
        this.diffmethodfilenumber = diffmethodfilenumber == null ? null : diffmethodfilenumber.trim();
    }

    public String getAddmethodnumber() {
        return addmethodnumber;
    }

    public DiffCoverageReport withAddmethodnumber(String addmethodnumber) {
        this.setAddmethodnumber(addmethodnumber);
        return this;
    }

    public void setAddmethodnumber(String addmethodnumber) {
        this.addmethodnumber = addmethodnumber == null ? null : addmethodnumber.trim();
    }

    public String getModifymethodnumber() {
        return modifymethodnumber;
    }

    public DiffCoverageReport withModifymethodnumber(String modifymethodnumber) {
        this.setModifymethodnumber(modifymethodnumber);
        return this;
    }

    public void setModifymethodnumber(String modifymethodnumber) {
        this.modifymethodnumber = modifymethodnumber == null ? null : modifymethodnumber.trim();
    }

    public String getDeletemethodnumber() {
        return deletemethodnumber;
    }

    public DiffCoverageReport withDeletemethodnumber(String deletemethodnumber) {
        this.setDeletemethodnumber(deletemethodnumber);
        return this;
    }

    public void setDeletemethodnumber(String deletemethodnumber) {
        this.deletemethodnumber = deletemethodnumber == null ? null : deletemethodnumber.trim();
    }

    public String getDifflinefilenumber() {
        return difflinefilenumber;
    }

    public DiffCoverageReport withDifflinefilenumber(String difflinefilenumber) {
        this.setDifflinefilenumber(difflinefilenumber);
        return this;
    }

    public void setDifflinefilenumber(String difflinefilenumber) {
        this.difflinefilenumber = difflinefilenumber == null ? null : difflinefilenumber.trim();
    }

    public String getAddlinenumber() {
        return addlinenumber;
    }

    public DiffCoverageReport withAddlinenumber(String addlinenumber) {
        this.setAddlinenumber(addlinenumber);
        return this;
    }

    public void setAddlinenumber(String addlinenumber) {
        this.addlinenumber = addlinenumber == null ? null : addlinenumber.trim();
    }

    public String getModifylinenumber() {
        return modifylinenumber;
    }

    public DiffCoverageReport withModifylinenumber(String modifylinenumber) {
        this.setModifylinenumber(modifylinenumber);
        return this;
    }

    public void setModifylinenumber(String modifylinenumber) {
        this.modifylinenumber = modifylinenumber == null ? null : modifylinenumber.trim();
    }

    public String getDeletelinenumber() {
        return deletelinenumber;
    }

    public DiffCoverageReport withDeletelinenumber(String deletelinenumber) {
        this.setDeletelinenumber(deletelinenumber);
        return this;
    }

    public void setDeletelinenumber(String deletelinenumber) {
        this.deletelinenumber = deletelinenumber == null ? null : deletelinenumber.trim();
    }

    public Integer getClasscoveragepercent() {
        return classcoveragepercent;
    }

    public DiffCoverageReport withClasscoveragepercent(Integer classcoveragepercent) {
        this.setClasscoveragepercent(classcoveragepercent);
        return this;
    }

    public void setClasscoveragepercent(Integer classcoveragepercent) {
        this.classcoveragepercent = classcoveragepercent;
    }

    public Integer getMethodcoveragepercent() {
        return methodcoveragepercent;
    }

    public DiffCoverageReport withMethodcoveragepercent(Integer methodcoveragepercent) {
        this.setMethodcoveragepercent(methodcoveragepercent);
        return this;
    }

    public void setMethodcoveragepercent(Integer methodcoveragepercent) {
        this.methodcoveragepercent = methodcoveragepercent;
    }

    public Long getLinecoveragepercent() {
        return linecoveragepercent;
    }

    public DiffCoverageReport withLinecoveragepercent(Long linecoveragepercent) {
        this.setLinecoveragepercent(linecoveragepercent);
        return this;
    }

    public void setLinecoveragepercent(Long linecoveragepercent) {
        this.linecoveragepercent = linecoveragepercent;
    }

    public String getTester() {
        return tester;
    }

    public DiffCoverageReport withTester(String tester) {
        this.setTester(tester);
        return this;
    }

    public void setTester(String tester) {
        this.tester = tester == null ? null : tester.trim();
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public DiffCoverageReport withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public DiffCoverageReport withCreatetime(Date createtime) {
        this.setCreatetime(createtime);
        return this;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public DiffCoverageReport withUpdatetime(Date updatetime) {
        this.setUpdatetime(updatetime);
        return this;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectname=").append(projectname);
        sb.append(", repositoryurl=").append(repositoryurl);
        sb.append(", basebranch=").append(basebranch);
        sb.append(", diffbranch=").append(diffbranch);
        sb.append(", basecommitid=").append(basecommitid);
        sb.append(", diffcommitid=").append(diffcommitid);
        sb.append(", execfilepath=").append(execfilepath);
        sb.append(", sessionid=").append(sessionid);
        sb.append(", reporturl=").append(reporturl);
        sb.append(", classfilenumber=").append(classfilenumber);
        sb.append(", methodfilenumber=").append(methodfilenumber);
        sb.append(", linefilenumber=").append(linefilenumber);
        sb.append(", diffclassfilenumber=").append(diffclassfilenumber);
        sb.append(", addfilenumber=").append(addfilenumber);
        sb.append(", modifyfilenumber=").append(modifyfilenumber);
        sb.append(", deletefilenumber=").append(deletefilenumber);
        sb.append(", diffmethodfilenumber=").append(diffmethodfilenumber);
        sb.append(", addmethodnumber=").append(addmethodnumber);
        sb.append(", modifymethodnumber=").append(modifymethodnumber);
        sb.append(", deletemethodnumber=").append(deletemethodnumber);
        sb.append(", difflinefilenumber=").append(difflinefilenumber);
        sb.append(", addlinenumber=").append(addlinenumber);
        sb.append(", modifylinenumber=").append(modifylinenumber);
        sb.append(", deletelinenumber=").append(deletelinenumber);
        sb.append(", classcoveragepercent=").append(classcoveragepercent);
        sb.append(", methodcoveragepercent=").append(methodcoveragepercent);
        sb.append(", linecoveragepercent=").append(linecoveragepercent);
        sb.append(", tester=").append(tester);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}