package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商户数据对象 wm_canteen
 * 
 * @author zxz
 * @date 2021-03-14
 */
public class WmCanteen extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 平台餐厅ID */
    @Excel(name = "平台餐厅ID")
    private Long canteenId;

    /** (配送系统)餐厅ID */
    @Excel(name = "(配送系统)餐厅ID")
    private Long retailerId;

    /** 餐厅名称 */
    @Excel(name = "餐厅名称")
    private String canteenName;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 商户业务 */
    @Excel(name = "商户业务")
    private String canteenBusType;

    /** 配送范围 */
    @Excel(name = "配送范围")
    private BigDecimal deliveryArea;

    /** 客单价 */
    @Excel(name = "客单价")
    private BigDecimal arpa;

    /** 平台推单数 */
    @Excel(name = "平台推单数")
    private Long pushOrderNum;

    /** 商家接单数 */
    @Excel(name = "商家接单数")
    private Long receiveOrderNum;

    /** 有效完成单数 */
    @Excel(name = "有效完成单数")
    private Long validOrderNum;

    /** 有效完成率 */
    @Excel(name = "有效完成率")
    private BigDecimal validOrderRate;

    /** 投诉率 */
    @Excel(name = "投诉率")
    private BigDecimal complaintRate;

    /** 异常率 */
    @Excel(name = "异常率")
    private BigDecimal exceptionRate;

    /** 欺诈单数 */
    @Excel(name = "欺诈单数")
    private Long shamOrderNum;

    /** 拒单数 */
    @Excel(name = "拒单数")
    private Long rejectOrderNum;

    /** 商户取消数 */
    @Excel(name = "商户取消数")
    private Long canteenCancelNum;

    /** 客户取消数 */
    @Excel(name = "客户取消数")
    private Long userCancelNum;

    /** 系统取消数 */
    @Excel(name = "系统取消数")
    private Long systemCancelNum;

    /** 配送异常数 */
    @Excel(name = "配送异常数")
    private Long deliveryCancelExceptionNum;

    /** 整体时长 */
    @Excel(name = "整体时长")
    private BigDecimal entiretyTime;

    /** 接单时长 */
    @Excel(name = "接单时长")
    private BigDecimal takeOrderTime;

    /** 到店时长 */
    @Excel(name = "到店时长")
    private BigDecimal toShopTime;

    /** 取餐时长 */
    @Excel(name = "取餐时长")
    private BigDecimal getMealTime;

    /** 送达时长 */
    @Excel(name = "送达时长")
    private BigDecimal deliveryTime;

    /** 商户投诉数 */
    @Excel(name = "商户投诉数")
    private Long canteenComplaintNum;

    /** 用户投诉数 */
    @Excel(name = "用户投诉数")
    private Long userComplaintNum;

    /** 差评数 */
    @Excel(name = "差评数")
    private Long lowCommentNum;

    /** 好评数 */
    @Excel(name = "好评数")
    private Long highCommentNum;

    /** 评价数 */
    @Excel(name = "评价数")
    private Long commentNum;

    /** 最远订单距离 */
    @Excel(name = "最远订单距离")
    private BigDecimal furthestOrderDistance;

    /** 该订单整体时效 */
    @Excel(name = "该订单整体时效")
    private BigDecimal furthestOrderAging;

    /** 该订单接单时效 */
    @Excel(name = "该订单接单时效")
    private BigDecimal furthestOrderTakeOrderAging;

    /** 该订单到店时效 */
    @Excel(name = "该订单到店时效")
    private BigDecimal furthestOrderToShopAging;

    /** 该订单取餐时效 */
    @Excel(name = "该订单取餐时效")
    private BigDecimal furthestOrderGetMealAging;

    /** 该订单送达时效 */
    @Excel(name = "该订单送达时效")
    private BigDecimal furthestOrderDeliveryAging;

    /** 评价星级 */
    @Excel(name = "评价星级")
    private Long furthestOrderCommentStar;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCanteenId(Long canteenId) 
    {
        this.canteenId = canteenId;
    }

    public Long getCanteenId() 
    {
        return canteenId;
    }
    public void setRetailerId(Long retailerId) 
    {
        this.retailerId = retailerId;
    }

    public Long getRetailerId() 
    {
        return retailerId;
    }
    public void setCanteenName(String canteenName) 
    {
        this.canteenName = canteenName;
    }

    public String getCanteenName() 
    {
        return canteenName;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setCanteenBusType(String canteenBusType) 
    {
        this.canteenBusType = canteenBusType;
    }

    public String getCanteenBusType() 
    {
        return canteenBusType;
    }
    public void setDeliveryArea(BigDecimal deliveryArea) 
    {
        this.deliveryArea = deliveryArea;
    }

    public BigDecimal getDeliveryArea() 
    {
        return deliveryArea;
    }
    public void setArpa(BigDecimal arpa) 
    {
        this.arpa = arpa;
    }

    public BigDecimal getArpa() 
    {
        return arpa;
    }
    public void setPushOrderNum(Long pushOrderNum) 
    {
        this.pushOrderNum = pushOrderNum;
    }

    public Long getPushOrderNum() 
    {
        return pushOrderNum;
    }
    public void setReceiveOrderNum(Long receiveOrderNum) 
    {
        this.receiveOrderNum = receiveOrderNum;
    }

    public Long getReceiveOrderNum() 
    {
        return receiveOrderNum;
    }
    public void setValidOrderNum(Long validOrderNum) 
    {
        this.validOrderNum = validOrderNum;
    }

    public Long getValidOrderNum() 
    {
        return validOrderNum;
    }
    public void setValidOrderRate(BigDecimal validOrderRate) 
    {
        this.validOrderRate = validOrderRate;
    }

    public BigDecimal getValidOrderRate() 
    {
        return validOrderRate;
    }
    public void setComplaintRate(BigDecimal complaintRate) 
    {
        this.complaintRate = complaintRate;
    }

    public BigDecimal getComplaintRate() 
    {
        return complaintRate;
    }
    public void setExceptionRate(BigDecimal exceptionRate) 
    {
        this.exceptionRate = exceptionRate;
    }

    public BigDecimal getExceptionRate() 
    {
        return exceptionRate;
    }
    public void setShamOrderNum(Long shamOrderNum) 
    {
        this.shamOrderNum = shamOrderNum;
    }

    public Long getShamOrderNum() 
    {
        return shamOrderNum;
    }
    public void setRejectOrderNum(Long rejectOrderNum) 
    {
        this.rejectOrderNum = rejectOrderNum;
    }

    public Long getRejectOrderNum() 
    {
        return rejectOrderNum;
    }
    public void setCanteenCancelNum(Long canteenCancelNum) 
    {
        this.canteenCancelNum = canteenCancelNum;
    }

    public Long getCanteenCancelNum() 
    {
        return canteenCancelNum;
    }
    public void setUserCancelNum(Long userCancelNum) 
    {
        this.userCancelNum = userCancelNum;
    }

    public Long getUserCancelNum() 
    {
        return userCancelNum;
    }
    public void setSystemCancelNum(Long systemCancelNum) 
    {
        this.systemCancelNum = systemCancelNum;
    }

    public Long getSystemCancelNum() 
    {
        return systemCancelNum;
    }
    public void setDeliveryCancelExceptionNum(Long deliveryCancelExceptionNum) 
    {
        this.deliveryCancelExceptionNum = deliveryCancelExceptionNum;
    }

    public Long getDeliveryCancelExceptionNum() 
    {
        return deliveryCancelExceptionNum;
    }
    public void setEntiretyTime(BigDecimal entiretyTime) 
    {
        this.entiretyTime = entiretyTime;
    }

    public BigDecimal getEntiretyTime() 
    {
        return entiretyTime;
    }
    public void setTakeOrderTime(BigDecimal takeOrderTime) 
    {
        this.takeOrderTime = takeOrderTime;
    }

    public BigDecimal getTakeOrderTime() 
    {
        return takeOrderTime;
    }
    public void setToShopTime(BigDecimal toShopTime) 
    {
        this.toShopTime = toShopTime;
    }

    public BigDecimal getToShopTime() 
    {
        return toShopTime;
    }
    public void setGetMealTime(BigDecimal getMealTime) 
    {
        this.getMealTime = getMealTime;
    }

    public BigDecimal getGetMealTime() 
    {
        return getMealTime;
    }
    public void setDeliveryTime(BigDecimal deliveryTime) 
    {
        this.deliveryTime = deliveryTime;
    }

    public BigDecimal getDeliveryTime() 
    {
        return deliveryTime;
    }
    public void setCanteenComplaintNum(Long canteenComplaintNum) 
    {
        this.canteenComplaintNum = canteenComplaintNum;
    }

    public Long getCanteenComplaintNum() 
    {
        return canteenComplaintNum;
    }
    public void setUserComplaintNum(Long userComplaintNum) 
    {
        this.userComplaintNum = userComplaintNum;
    }

    public Long getUserComplaintNum() 
    {
        return userComplaintNum;
    }
    public void setLowCommentNum(Long lowCommentNum) 
    {
        this.lowCommentNum = lowCommentNum;
    }

    public Long getLowCommentNum() 
    {
        return lowCommentNum;
    }
    public void setHighCommentNum(Long highCommentNum) 
    {
        this.highCommentNum = highCommentNum;
    }

    public Long getHighCommentNum() 
    {
        return highCommentNum;
    }
    public void setCommentNum(Long commentNum) 
    {
        this.commentNum = commentNum;
    }

    public Long getCommentNum() 
    {
        return commentNum;
    }
    public void setFurthestOrderDistance(BigDecimal furthestOrderDistance) 
    {
        this.furthestOrderDistance = furthestOrderDistance;
    }

    public BigDecimal getFurthestOrderDistance() 
    {
        return furthestOrderDistance;
    }
    public void setFurthestOrderAging(BigDecimal furthestOrderAging) 
    {
        this.furthestOrderAging = furthestOrderAging;
    }

    public BigDecimal getFurthestOrderAging() 
    {
        return furthestOrderAging;
    }
    public void setFurthestOrderTakeOrderAging(BigDecimal furthestOrderTakeOrderAging) 
    {
        this.furthestOrderTakeOrderAging = furthestOrderTakeOrderAging;
    }

    public BigDecimal getFurthestOrderTakeOrderAging() 
    {
        return furthestOrderTakeOrderAging;
    }
    public void setFurthestOrderToShopAging(BigDecimal furthestOrderToShopAging) 
    {
        this.furthestOrderToShopAging = furthestOrderToShopAging;
    }

    public BigDecimal getFurthestOrderToShopAging() 
    {
        return furthestOrderToShopAging;
    }
    public void setFurthestOrderGetMealAging(BigDecimal furthestOrderGetMealAging) 
    {
        this.furthestOrderGetMealAging = furthestOrderGetMealAging;
    }

    public BigDecimal getFurthestOrderGetMealAging() 
    {
        return furthestOrderGetMealAging;
    }
    public void setFurthestOrderDeliveryAging(BigDecimal furthestOrderDeliveryAging) 
    {
        this.furthestOrderDeliveryAging = furthestOrderDeliveryAging;
    }

    public BigDecimal getFurthestOrderDeliveryAging() 
    {
        return furthestOrderDeliveryAging;
    }
    public void setFurthestOrderCommentStar(Long furthestOrderCommentStar) 
    {
        this.furthestOrderCommentStar = furthestOrderCommentStar;
    }

    public Long getFurthestOrderCommentStar() 
    {
        return furthestOrderCommentStar;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("canteenId", getCanteenId())
            .append("retailerId", getRetailerId())
            .append("canteenName", getCanteenName())
            .append("city", getCity())
            .append("canteenBusType", getCanteenBusType())
            .append("deliveryArea", getDeliveryArea())
            .append("arpa", getArpa())
            .append("pushOrderNum", getPushOrderNum())
            .append("receiveOrderNum", getReceiveOrderNum())
            .append("validOrderNum", getValidOrderNum())
            .append("validOrderRate", getValidOrderRate())
            .append("complaintRate", getComplaintRate())
            .append("exceptionRate", getExceptionRate())
            .append("shamOrderNum", getShamOrderNum())
            .append("rejectOrderNum", getRejectOrderNum())
            .append("canteenCancelNum", getCanteenCancelNum())
            .append("userCancelNum", getUserCancelNum())
            .append("systemCancelNum", getSystemCancelNum())
            .append("deliveryCancelExceptionNum", getDeliveryCancelExceptionNum())
            .append("entiretyTime", getEntiretyTime())
            .append("takeOrderTime", getTakeOrderTime())
            .append("toShopTime", getToShopTime())
            .append("getMealTime", getGetMealTime())
            .append("deliveryTime", getDeliveryTime())
            .append("canteenComplaintNum", getCanteenComplaintNum())
            .append("userComplaintNum", getUserComplaintNum())
            .append("lowCommentNum", getLowCommentNum())
            .append("highCommentNum", getHighCommentNum())
            .append("commentNum", getCommentNum())
            .append("furthestOrderDistance", getFurthestOrderDistance())
            .append("furthestOrderAging", getFurthestOrderAging())
            .append("furthestOrderTakeOrderAging", getFurthestOrderTakeOrderAging())
            .append("furthestOrderToShopAging", getFurthestOrderToShopAging())
            .append("furthestOrderGetMealAging", getFurthestOrderGetMealAging())
            .append("furthestOrderDeliveryAging", getFurthestOrderDeliveryAging())
            .append("furthestOrderCommentStar", getFurthestOrderCommentStar())
            .toString();
    }
}
