package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配送范围审核-人员预算对象 wm_delivery_scope_audit
 * 
 * @author zxz
 * @date 2021-03-16
 */
public class WmDeliveryScopeAudit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标识ID */
    private Long id;

    /** 请求ID */
    @Excel(name = "请求ID")
    private String requestId;

    /** （平台）商铺id */
    @Excel(name = "", readConverterExp = "平=台")
    private Long walleId;

    /** （配送系统）商铺id */
    @Excel(name = "", readConverterExp = "配=送系统")
    private Long retailerId;

    /** 商铺名称 */
    @Excel(name = "商铺名称")
    private String retailerName;

    /** 商铺地址 */
    @Excel(name = "商铺地址")
    private String retailerAddress;

    /** 位置POI编码 */
    @Excel(name = "位置POI编码")
    private String retailerLocation;

    /** 城市ID */
    @Excel(name = "城市ID")
    private Long cityId;

    /** 城市名称 */
    @Excel(name = "城市名称")
    private String cityName;

    /** 网格ID */
    @Excel(name = "网格ID")
    private Long gridId;

    /** 渠道经理 */
    @Excel(name = "渠道经理")
    private Long carrierId;

    /** 渠道小组 */
    @Excel(name = "渠道小组")
    private Long teamId;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Long applicantId;

    /** 申请人 */
    @Excel(name = "申请人")
    private String applicantName;

    /** 一级审批角色 */
    @Excel(name = "一级审批角色")
    private Long firstAuditorRole;

    /** 候选审批人ID */
    @Excel(name = "候选审批人ID")
    private String firstAuditorCandidateIds;

    /** 审核人ID */
    @Excel(name = "审核人ID")
    private Long firstAuditorId;

    /** 审批人名 */
    @Excel(name = "审批人名")
    private String firstAuditorName;

    /** 二级审批角色 */
    @Excel(name = "二级审批角色")
    private Long secondAuditorRole;

    /** 审核小组成员 */
    @Excel(name = "审核小组成员")
    private String secondAuditorCandidateIds;

    /** 二级审核人id */
    @Excel(name = "二级审核人id")
    private Long secondAuditorId;

    /** 二级审核人名 */
    @Excel(name = "二级审核人名")
    private String secondAuditorName;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private Long status;

    /** 申请前最大配送距离 */
    @Excel(name = "申请前最大配送距离")
    private Long maxDistanceBeforeEdit;

    /** 申请前最小配送距离 */
    @Excel(name = "申请前最小配送距离")
    private Long minDistanceBeforeEdit;

    /** 申请后最大配送距离 */
    @Excel(name = "申请后最大配送距离")
    private Long maxDistanceAfterEdit;

    /** 申请后最小配送距离 */
    @Excel(name = "申请后最小配送距离")
    private Long minDistanceAfterEdit;

    /** 申请前配送面积 */
    @Excel(name = "申请前配送面积")
    private BigDecimal areaBeforeEdit;

    /** 申请前配送面积 */
    @Excel(name = "申请前配送面积")
    private BigDecimal areaAfterEdit;

    /** 申请递交时间 */
    @Excel(name = "申请递交时间")
    private String createdAt;

    /** 审核完成 */
    @Excel(name = "审核完成")
    private String updatedAt;

    /** 申请时间 */
    @Excel(name = "申请时间")
    private String applyTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRequestId(String requestId) 
    {
        this.requestId = requestId;
    }

    public String getRequestId() 
    {
        return requestId;
    }
    public void setWalleId(Long walleId) 
    {
        this.walleId = walleId;
    }

    public Long getWalleId() 
    {
        return walleId;
    }
    public void setRetailerId(Long retailerId) 
    {
        this.retailerId = retailerId;
    }

    public Long getRetailerId() 
    {
        return retailerId;
    }
    public void setRetailerName(String retailerName) 
    {
        this.retailerName = retailerName;
    }

    public String getRetailerName() 
    {
        return retailerName;
    }
    public void setRetailerAddress(String retailerAddress) 
    {
        this.retailerAddress = retailerAddress;
    }

    public String getRetailerAddress() 
    {
        return retailerAddress;
    }
    public void setRetailerLocation(String retailerLocation) 
    {
        this.retailerLocation = retailerLocation;
    }

    public String getRetailerLocation() 
    {
        return retailerLocation;
    }
    public void setCityId(Long cityId) 
    {
        this.cityId = cityId;
    }

    public Long getCityId() 
    {
        return cityId;
    }
    public void setCityName(String cityName) 
    {
        this.cityName = cityName;
    }

    public String getCityName() 
    {
        return cityName;
    }
    public void setGridId(Long gridId) 
    {
        this.gridId = gridId;
    }

    public Long getGridId() 
    {
        return gridId;
    }
    public void setCarrierId(Long carrierId) 
    {
        this.carrierId = carrierId;
    }

    public Long getCarrierId() 
    {
        return carrierId;
    }
    public void setTeamId(Long teamId) 
    {
        this.teamId = teamId;
    }

    public Long getTeamId() 
    {
        return teamId;
    }
    public void setApplicantId(Long applicantId) 
    {
        this.applicantId = applicantId;
    }

    public Long getApplicantId() 
    {
        return applicantId;
    }
    public void setApplicantName(String applicantName) 
    {
        this.applicantName = applicantName;
    }

    public String getApplicantName() 
    {
        return applicantName;
    }
    public void setFirstAuditorRole(Long firstAuditorRole) 
    {
        this.firstAuditorRole = firstAuditorRole;
    }

    public Long getFirstAuditorRole() 
    {
        return firstAuditorRole;
    }
    public void setFirstAuditorCandidateIds(String firstAuditorCandidateIds) 
    {
        this.firstAuditorCandidateIds = firstAuditorCandidateIds;
    }

    public String getFirstAuditorCandidateIds() 
    {
        return firstAuditorCandidateIds;
    }
    public void setFirstAuditorId(Long firstAuditorId) 
    {
        this.firstAuditorId = firstAuditorId;
    }

    public Long getFirstAuditorId() 
    {
        return firstAuditorId;
    }
    public void setFirstAuditorName(String firstAuditorName) 
    {
        this.firstAuditorName = firstAuditorName;
    }

    public String getFirstAuditorName() 
    {
        return firstAuditorName;
    }
    public void setSecondAuditorRole(Long secondAuditorRole) 
    {
        this.secondAuditorRole = secondAuditorRole;
    }

    public Long getSecondAuditorRole() 
    {
        return secondAuditorRole;
    }
    public void setSecondAuditorCandidateIds(String secondAuditorCandidateIds) 
    {
        this.secondAuditorCandidateIds = secondAuditorCandidateIds;
    }

    public String getSecondAuditorCandidateIds() 
    {
        return secondAuditorCandidateIds;
    }
    public void setSecondAuditorId(Long secondAuditorId) 
    {
        this.secondAuditorId = secondAuditorId;
    }

    public Long getSecondAuditorId() 
    {
        return secondAuditorId;
    }
    public void setSecondAuditorName(String secondAuditorName) 
    {
        this.secondAuditorName = secondAuditorName;
    }

    public String getSecondAuditorName() 
    {
        return secondAuditorName;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setMaxDistanceBeforeEdit(Long maxDistanceBeforeEdit) 
    {
        this.maxDistanceBeforeEdit = maxDistanceBeforeEdit;
    }

    public Long getMaxDistanceBeforeEdit() 
    {
        return maxDistanceBeforeEdit;
    }
    public void setMinDistanceBeforeEdit(Long minDistanceBeforeEdit) 
    {
        this.minDistanceBeforeEdit = minDistanceBeforeEdit;
    }

    public Long getMinDistanceBeforeEdit() 
    {
        return minDistanceBeforeEdit;
    }
    public void setMaxDistanceAfterEdit(Long maxDistanceAfterEdit) 
    {
        this.maxDistanceAfterEdit = maxDistanceAfterEdit;
    }

    public Long getMaxDistanceAfterEdit() 
    {
        return maxDistanceAfterEdit;
    }
    public void setMinDistanceAfterEdit(Long minDistanceAfterEdit) 
    {
        this.minDistanceAfterEdit = minDistanceAfterEdit;
    }

    public Long getMinDistanceAfterEdit() 
    {
        return minDistanceAfterEdit;
    }
    public void setAreaBeforeEdit(BigDecimal areaBeforeEdit) 
    {
        this.areaBeforeEdit = areaBeforeEdit;
    }

    public BigDecimal getAreaBeforeEdit() 
    {
        return areaBeforeEdit;
    }
    public void setAreaAfterEdit(BigDecimal areaAfterEdit) 
    {
        this.areaAfterEdit = areaAfterEdit;
    }

    public BigDecimal getAreaAfterEdit() 
    {
        return areaAfterEdit;
    }
    public void setCreatedAt(String createdAt) 
    {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() 
    {
        return createdAt;
    }
    public void setUpdatedAt(String updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() 
    {
        return updatedAt;
    }
    public void setApplyTime(String applyTime) 
    {
        this.applyTime = applyTime;
    }

    public String getApplyTime() 
    {
        return applyTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("requestId", getRequestId())
            .append("walleId", getWalleId())
            .append("retailerId", getRetailerId())
            .append("retailerName", getRetailerName())
            .append("retailerAddress", getRetailerAddress())
            .append("retailerLocation", getRetailerLocation())
            .append("cityId", getCityId())
            .append("cityName", getCityName())
            .append("gridId", getGridId())
            .append("carrierId", getCarrierId())
            .append("teamId", getTeamId())
            .append("applicantId", getApplicantId())
            .append("applicantName", getApplicantName())
            .append("firstAuditorRole", getFirstAuditorRole())
            .append("firstAuditorCandidateIds", getFirstAuditorCandidateIds())
            .append("firstAuditorId", getFirstAuditorId())
            .append("firstAuditorName", getFirstAuditorName())
            .append("secondAuditorRole", getSecondAuditorRole())
            .append("secondAuditorCandidateIds", getSecondAuditorCandidateIds())
            .append("secondAuditorId", getSecondAuditorId())
            .append("secondAuditorName", getSecondAuditorName())
            .append("status", getStatus())
            .append("maxDistanceBeforeEdit", getMaxDistanceBeforeEdit())
            .append("minDistanceBeforeEdit", getMinDistanceBeforeEdit())
            .append("maxDistanceAfterEdit", getMaxDistanceAfterEdit())
            .append("minDistanceAfterEdit", getMinDistanceAfterEdit())
            .append("areaBeforeEdit", getAreaBeforeEdit())
            .append("areaAfterEdit", getAreaAfterEdit())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("applyTime", getApplyTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
