package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 灰度数据对比对象 wm_gray_data_compare
 * 
 * @author zxz
 * @date 2021-03-16
 */
public class WmGrayDataCompare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 网格ID */
    private Long gridId;

    /** 灰度餐厅数量 */
    @Excel(name = "灰度餐厅数量")
    private Long grayCanteenNum;

    /** 推单数-8日 */
    @Excel(name = "推单数-8日")
    private Long recommendOrderEight;

    /** 推单数-9日 */
    @Excel(name = "推单数-9日")
    private Long pushOrderNine;

    /** 有效完成率-8日 */
    @Excel(name = "有效完成率-8日")
    private String effectiveCompletionRateEight;

    /** 有效完成率-9日 */
    @Excel(name = "有效完成率-9日")
    private String effectiveCompletionRateNine;

    /** 超时率-8日 */
    @Excel(name = "超时率-8日")
    private String timeoutRateEight;

    /** 超时率-9日 */
    @Excel(name = "超时率-9日")
    private String timeoutRateNine;

    public void setGridId(Long gridId) 
    {
        this.gridId = gridId;
    }

    public Long getGridId() 
    {
        return gridId;
    }
    public void setGrayCanteenNum(Long grayCanteenNum) 
    {
        this.grayCanteenNum = grayCanteenNum;
    }

    public Long getGrayCanteenNum() 
    {
        return grayCanteenNum;
    }
    public void setRecommendOrderEight(Long recommendOrderEight) 
    {
        this.recommendOrderEight = recommendOrderEight;
    }

    public Long getRecommendOrderEight() 
    {
        return recommendOrderEight;
    }
    public void setPushOrderNine(Long pushOrderNine) 
    {
        this.pushOrderNine = pushOrderNine;
    }

    public Long getPushOrderNine() 
    {
        return pushOrderNine;
    }
    public void setEffectiveCompletionRateEight(String effectiveCompletionRateEight) 
    {
        this.effectiveCompletionRateEight = effectiveCompletionRateEight;
    }

    public String getEffectiveCompletionRateEight() 
    {
        return effectiveCompletionRateEight;
    }
    public void setEffectiveCompletionRateNine(String effectiveCompletionRateNine) 
    {
        this.effectiveCompletionRateNine = effectiveCompletionRateNine;
    }

    public String getEffectiveCompletionRateNine() 
    {
        return effectiveCompletionRateNine;
    }
    public void setTimeoutRateEight(String timeoutRateEight) 
    {
        this.timeoutRateEight = timeoutRateEight;
    }

    public String getTimeoutRateEight() 
    {
        return timeoutRateEight;
    }
    public void setTimeoutRateNine(String timeoutRateNine) 
    {
        this.timeoutRateNine = timeoutRateNine;
    }

    public String getTimeoutRateNine() 
    {
        return timeoutRateNine;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("gridId", getGridId())
            .append("grayCanteenNum", getGrayCanteenNum())
            .append("recommendOrderEight", getRecommendOrderEight())
            .append("pushOrderNine", getPushOrderNine())
            .append("effectiveCompletionRateEight", getEffectiveCompletionRateEight())
            .append("effectiveCompletionRateNine", getEffectiveCompletionRateNine())
            .append("timeoutRateEight", getTimeoutRateEight())
            .append("timeoutRateNine", getTimeoutRateNine())
            .toString();
    }
}
