package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * poi数据对象 wm_poi
 * 
 * @author ruoyi
 * @date 2021-03-14
 */
public class WmPoi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 商家id */
    @Excel(name = "商家id")
    private Long rstId;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String rstName;

    /** 商家所属平台 */
    @Excel(name = "商家所属平台")
    private String rstType;

    /** 城市 */
    @Excel(name = "城市")
    private String cityName;

    /** 纬度 */
    @Excel(name = "纬度")
    private String longitude;

    /** 经度 */
    @Excel(name = "经度")
    private String latitude;

    /** 地点 */
    @Excel(name = "地点")
    private String location;

    /** 30天销量 */
    @Excel(name = "30天销量")
    private Long day30Cnt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRstId(Long rstId) 
    {
        this.rstId = rstId;
    }

    public Long getRstId() 
    {
        return rstId;
    }
    public void setRstName(String rstName) 
    {
        this.rstName = rstName;
    }

    public String getRstName() 
    {
        return rstName;
    }
    public void setRstType(String rstType) 
    {
        this.rstType = rstType;
    }

    public String getRstType() 
    {
        return rstType;
    }
    public void setCityName(String cityName) 
    {
        this.cityName = cityName;
    }

    public String getCityName() 
    {
        return cityName;
    }
    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }
    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setDay30Cnt(Long day30Cnt) 
    {
        this.day30Cnt = day30Cnt;
    }

    public Long getDay30Cnt() 
    {
        return day30Cnt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rstId", getRstId())
            .append("rstName", getRstName())
            .append("rstType", getRstType())
            .append("cityName", getCityName())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("location", getLocation())
            .append("day30Cnt", getDay30Cnt())
            .toString();
    }
}
