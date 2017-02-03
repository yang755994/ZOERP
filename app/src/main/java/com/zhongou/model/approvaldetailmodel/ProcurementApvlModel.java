package com.zhongou.model.approvaldetailmodel;

import java.io.Serializable;
import java.util.List;

/**采购申请
 * Created by sjy on 2016/12/26.
 */

public class ProcurementApvlModel implements Serializable {
    private static final long serialVersionUID = 1L;

    public String ItemType;
    public String Remark;
    public String Reason;
    public String CreateTime;
    public String ItemName;//
    public String EstimateFee;//
    public String Specification;//
    public String Versions;//
    public String Amount;//
    public String PlanTime;//
    public String Buyer;//

    public String ApprovalStatus;
    public String EmployeeName;
    public String StoreName;
    public String DepartmentName;
    public String ApplicationCreateTime;

    public List<ProcurementApvlModel.ApprovalInfoLists> ApprovalInfoLists ;

    public static class ApprovalInfoLists{
        public String Comment = "";
        public String ApprovalDate = "";
        public String YesOrNo= "";
        public String ApprovalEmployeeName= "";

        public String getComment() {
            return Comment;
        }

        public void setComment(String comment) {
            Comment = comment;
        }

        public String getApprovalDate() {
            return ApprovalDate;
        }

        public void setApprovalDate(String approvalDate) {
            ApprovalDate = approvalDate;
        }

        public String getYesOrNo() {
            return YesOrNo;
        }

        public void setYesOrNo(String yesOrNo) {
            YesOrNo = yesOrNo;
        }

        public String getApprovalEmployeeName() {
            return ApprovalEmployeeName;
        }

        public void setApprovalEmployeeName(String approvalEmployeeName) {
            ApprovalEmployeeName = approvalEmployeeName;
        }
    }

    public List<ProcurementApvlModel.ApprovalInfoLists> getApprovalInfoLists() {
        return ApprovalInfoLists;
    }

    public void setApprovalInfoLists(List<ProcurementApvlModel.ApprovalInfoLists> approvalInfoLists) {
        this.ApprovalInfoLists = approvalInfoLists;
    }



    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getApprovalStatus() {
        return ApprovalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        ApprovalStatus = approvalStatus;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getApplicationCreateTime() {
        return ApplicationCreateTime;
    }

    public void setApplicationCreateTime(String applicationCreateTime) {
        ApplicationCreateTime = applicationCreateTime;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getEstimateFee() {
        return EstimateFee;
    }

    public void setEstimateFee(String estimateFee) {
        EstimateFee = estimateFee;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public String getVersions() {
        return Versions;
    }

    public void setVersions(String versions) {
        Versions = versions;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getPlanTime() {
        return PlanTime;
    }

    public void setPlanTime(String planTime) {
        PlanTime = planTime;
    }

    public String getBuyer() {
        return Buyer;
    }

    public void setBuyer(String buyer) {
        Buyer = buyer;
    }
}
