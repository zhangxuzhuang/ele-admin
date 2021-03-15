package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 网格餐厅明细对象 wm_grid_detail
 * 
 * @author zxz
 * @date 2021-03-16
 */
public class WmGriddetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 网格ID */
    @Excel(name = "网格ID")
    private Long gridId;

    /** 网格名称 */
    @Excel(name = "网格名称")
    private String gridName;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 餐厅ID */
    @Excel(name = "餐厅ID")
    private Long canteenId;

    /** 近7天平台单量 */
    @Excel(name = "近7天平台单量")
    private Long last7OrderNum;

    /** 近7天推单 */
    @Excel(name = "近7天推单")
    private Long last7PushOrderNum;

    /** 餐厅名 */
    @Excel(name = "餐厅名")
    private String canteenName;

    /** 餐厅地址（取餐地址） */
    @Excel(name = "餐厅地址", readConverterExp = "取=餐地址")
    private String canteenNameAddress;

    /** minos地址 */
    @Excel(name = "minos地址")
    private String minosAddress;

    /** 餐品种类 */
    @Excel(name = "餐品种类")
    private String foodType;

    /** 餐厅属性 */
    @Excel(name = "餐厅属性")
    private Long canteenType;

    /** 标属品性 */
    @Excel(name = "标属品性")
    private String productType;

    /** 推送类型 */
    @Excel(name = "推送类型")
    private Long pushType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setCanteenId(Long canteenId) 
    {
        this.canteenId = canteenId;
    }

    public Long getCanteenId() 
    {
        return canteenId;
    }
    public void setLast7OrderNum(Long last7OrderNum) 
    {
        this.last7OrderNum = last7OrderNum;
    }

    public Long getLast7OrderNum() 
    {
        return last7OrderNum;
    }
    public void setLast7PushOrderNum(Long last7PushOrderNum) 
    {
        this.last7PushOrderNum = last7PushOrderNum;
    }

    public Long getLast7PushOrderNum() 
    {
        return last7PushOrderNum;
    }
    public void setCanteenName(String canteenName) 
    {
        this.canteenName = canteenName;
    }

    public String getCanteenName() 
    {
        return canteenName;
    }
    public void setCanteenNameAddress(String canteenNameAddress) 
    {
        this.canteenNameAddress = canteenNameAddress;
    }

    public String getCanteenNameAddress() 
    {
        return canteenNameAddress;
    }
    public void setMinosAddress(String minosAddress) 
    {
        this.minosAddress = minosAddress;
    }

    public String getMinosAddress() 
    {
        return minosAddress;
    }
    public void setFoodType(String foodType) 
    {
        this.foodType = foodType;
    }

    public String getFoodType() 
    {
        return foodType;
    }
    public void setCanteenType(Long canteenType) 
    {
        this.canteenType = canteenType;
    }

    public Long getCanteenType() 
    {
        return canteenType;
    }
    public void setProductType(String productType) 
    {
        this.productType = productType;
    }

    public String getProductType() 
    {
        return productType;
    }
    public void setPushType(Long pushType) 
    {
        this.pushType = pushType;
    }

    public Long getPushType() 
    {
        return pushType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gridId", getGridId())
            .append("gridName", getGridName())
            .append("city", getCity())
            .append("canteenId", getCanteenId())
            .append("last7OrderNum", getLast7OrderNum())
            .append("last7PushOrderNum", getLast7PushOrderNum())
            .append("canteenName", getCanteenName())
            .append("canteenNameAddress", getCanteenNameAddress())
            .append("minosAddress", getMinosAddress())
            .append("foodType", getFoodType())
            .append("canteenType", getCanteenType())
            .append("productType", getProductType())
            .append("pushType", getPushType())
            .toString();
    }
}
