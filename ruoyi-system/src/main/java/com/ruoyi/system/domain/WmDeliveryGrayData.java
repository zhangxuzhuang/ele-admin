package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配送平台灰测维度数据对象 wm_delivery_gray_data
 * 
 * @author zxz
 * @date 2021-03-16
 */
public class WmDeliveryGrayData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 餐厅ID */
    private Long canteenId;

    /** 餐厅名称 */
    @Excel(name = "餐厅名称")
    private String canteenName;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 营业时长 */
    @Excel(name = "营业时长")
    private Long businessHours;

    /** 餐厅状态 */
    @Excel(name = "餐厅状态")
    private String status;

    /** 是否托管 */
    @Excel(name = "是否托管")
    private String trusteeship;

    /** 总单量 */
    @Excel(name = "总单量")
    private Long orderQuantity;

    /** 总单量增长率 */
    @Excel(name = "总单量增长率")
    private BigDecimal orderQuantityGrowthRate;

    /** 有效订单量 */
    @Excel(name = "有效订单量")
    private Long effectiveOrderQuantity;

    /** 有效订单增长率 */
    @Excel(name = "有效订单增长率")
    private BigDecimal effectiveOrderGrowthRate;

    /** 订单配送成功率 */
    @Excel(name = "订单配送成功率")
    private BigDecimal orderDeliverySuccessRate;

    /** 超时订单率 */
    @Excel(name = "超时订单率")
    private BigDecimal overtimeOrderRate;

    /** 无效订单率 */
    @Excel(name = "无效订单率")
    private BigDecimal invalidOrderRate;

    /** 平均预计送达时长 */
    @Excel(name = "平均预计送达时长")
    private BigDecimal averageExpectedDeliveryTime;

    /** 平均实际配送时长 */
    @Excel(name = "平均实际配送时长")
    private BigDecimal averageActualDeliveryTime;

    /** 当前配送面积 */
    @Excel(name = "当前配送面积")
    private BigDecimal currentDistributionArea;

    /** 面积变更值 */
    @Excel(name = "面积变更值")
    private BigDecimal areaChangeValue;

    /** 网格ID */
    @Excel(name = "网格ID")
    private Long gridId;

    /** 网格名称 */
    @Excel(name = "网格名称")
    private String gridName;

    /** 战营 */
    @Excel(name = "战营")
    private String battleCamp;

    public void setCanteenId(Long canteenId) 
    {
        this.canteenId = canteenId;
    }

    public Long getCanteenId() 
    {
        return canteenId;
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
    public void setBusinessHours(Long businessHours) 
    {
        this.businessHours = businessHours;
    }

    public Long getBusinessHours() 
    {
        return businessHours;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setTrusteeship(String trusteeship) 
    {
        this.trusteeship = trusteeship;
    }

    public String getTrusteeship() 
    {
        return trusteeship;
    }
    public void setOrderQuantity(Long orderQuantity) 
    {
        this.orderQuantity = orderQuantity;
    }

    public Long getOrderQuantity() 
    {
        return orderQuantity;
    }
    public void setOrderQuantityGrowthRate(BigDecimal orderQuantityGrowthRate) 
    {
        this.orderQuantityGrowthRate = orderQuantityGrowthRate;
    }

    public BigDecimal getOrderQuantityGrowthRate() 
    {
        return orderQuantityGrowthRate;
    }
    public void setEffectiveOrderQuantity(Long effectiveOrderQuantity) 
    {
        this.effectiveOrderQuantity = effectiveOrderQuantity;
    }

    public Long getEffectiveOrderQuantity() 
    {
        return effectiveOrderQuantity;
    }
    public void setEffectiveOrderGrowthRate(BigDecimal effectiveOrderGrowthRate) 
    {
        this.effectiveOrderGrowthRate = effectiveOrderGrowthRate;
    }

    public BigDecimal getEffectiveOrderGrowthRate() 
    {
        return effectiveOrderGrowthRate;
    }
    public void setOrderDeliverySuccessRate(BigDecimal orderDeliverySuccessRate) 
    {
        this.orderDeliverySuccessRate = orderDeliverySuccessRate;
    }

    public BigDecimal getOrderDeliverySuccessRate() 
    {
        return orderDeliverySuccessRate;
    }
    public void setOvertimeOrderRate(BigDecimal overtimeOrderRate) 
    {
        this.overtimeOrderRate = overtimeOrderRate;
    }

    public BigDecimal getOvertimeOrderRate() 
    {
        return overtimeOrderRate;
    }
    public void setInvalidOrderRate(BigDecimal invalidOrderRate) 
    {
        this.invalidOrderRate = invalidOrderRate;
    }

    public BigDecimal getInvalidOrderRate() 
    {
        return invalidOrderRate;
    }
    public void setAverageExpectedDeliveryTime(BigDecimal averageExpectedDeliveryTime) 
    {
        this.averageExpectedDeliveryTime = averageExpectedDeliveryTime;
    }

    public BigDecimal getAverageExpectedDeliveryTime() 
    {
        return averageExpectedDeliveryTime;
    }
    public void setAverageActualDeliveryTime(BigDecimal averageActualDeliveryTime) 
    {
        this.averageActualDeliveryTime = averageActualDeliveryTime;
    }

    public BigDecimal getAverageActualDeliveryTime() 
    {
        return averageActualDeliveryTime;
    }
    public void setCurrentDistributionArea(BigDecimal currentDistributionArea) 
    {
        this.currentDistributionArea = currentDistributionArea;
    }

    public BigDecimal getCurrentDistributionArea() 
    {
        return currentDistributionArea;
    }
    public void setAreaChangeValue(BigDecimal areaChangeValue) 
    {
        this.areaChangeValue = areaChangeValue;
    }

    public BigDecimal getAreaChangeValue() 
    {
        return areaChangeValue;
    }
    public void setGridId(Long gridId) 
    {
        this.gridId = gridId;
    }

    public Long getGridId() 
    {
        return gridId;
    }
    public void setGridName(String gridName) 
    {
        this.gridName = gridName;
    }

    public String getGridName() 
    {
        return gridName;
    }
    public void setBattleCamp(String battleCamp) 
    {
        this.battleCamp = battleCamp;
    }

    public String getBattleCamp() 
    {
        return battleCamp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("canteenId", getCanteenId())
            .append("canteenName", getCanteenName())
            .append("city", getCity())
            .append("businessHours", getBusinessHours())
            .append("status", getStatus())
            .append("trusteeship", getTrusteeship())
            .append("orderQuantity", getOrderQuantity())
            .append("orderQuantityGrowthRate", getOrderQuantityGrowthRate())
            .append("effectiveOrderQuantity", getEffectiveOrderQuantity())
            .append("effectiveOrderGrowthRate", getEffectiveOrderGrowthRate())
            .append("orderDeliverySuccessRate", getOrderDeliverySuccessRate())
            .append("overtimeOrderRate", getOvertimeOrderRate())
            .append("invalidOrderRate", getInvalidOrderRate())
            .append("averageExpectedDeliveryTime", getAverageExpectedDeliveryTime())
            .append("averageActualDeliveryTime", getAverageActualDeliveryTime())
            .append("currentDistributionArea", getCurrentDistributionArea())
            .append("areaChangeValue", getAreaChangeValue())
            .append("gridId", getGridId())
            .append("gridName", getGridName())
            .append("battleCamp", getBattleCamp())
            .toString();
    }
}
