package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WmGrayDataCompare;

/**
 * 灰度数据对比Service接口
 * 
 * @author zxz
 * @date 2021-03-16
 */
public interface IWmGrayDataCompareService 
{
    /**
     * 查询灰度数据对比
     * 
     * @param gridId 灰度数据对比ID
     * @return 灰度数据对比
     */
    public WmGrayDataCompare selectWmGrayDataCompareById(Long gridId);

    /**
     * 查询灰度数据对比列表
     * 
     * @param wmGrayDataCompare 灰度数据对比
     * @return 灰度数据对比集合
     */
    public List<WmGrayDataCompare> selectWmGrayDataCompareList(WmGrayDataCompare wmGrayDataCompare);

    /**
     * 新增灰度数据对比
     * 
     * @param wmGrayDataCompare 灰度数据对比
     * @return 结果
     */
    public int insertWmGrayDataCompare(WmGrayDataCompare wmGrayDataCompare);

    /**
     * 修改灰度数据对比
     * 
     * @param wmGrayDataCompare 灰度数据对比
     * @return 结果
     */
    public int updateWmGrayDataCompare(WmGrayDataCompare wmGrayDataCompare);

    /**
     * 批量删除灰度数据对比
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmGrayDataCompareByIds(String ids);

    /**
     * 删除灰度数据对比信息
     * 
     * @param gridId 灰度数据对比ID
     * @return 结果
     */
    public int deleteWmGrayDataCompareById(Long gridId);
}
