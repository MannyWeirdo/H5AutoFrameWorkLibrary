package dataBean.dubbo.projectSys;

import com.miaoqian.framework.domain.PageQuery;
import dataBean.IDataBean;

/**
 * Created by alex on 2017/5/19.
 */
public class RepayPlanQueryDto extends PageQuery implements IDataBean {

    private String id;

    private String borrowerId;

    private String projectCode;

    private String planId;

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}