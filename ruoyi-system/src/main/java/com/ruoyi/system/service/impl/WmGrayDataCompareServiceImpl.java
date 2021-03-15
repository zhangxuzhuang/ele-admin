package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WmGrayDataCompareMapper;
import com.ruoyi.system.domain.WmGrayDataCompare;
import com.ruoyi.system.service.IWmGrayDataCompareService;
import com.ruoyi.common.core.text.Convert;

/**
 * 灰度数据对比Service业务层处理
 * 
 * @author zxz
 * @date 2021-03-16
 */
@Service
public class WmGrayDataCompareServiceImpl implements IWmGrayDataCompareService 
{
    @Autowired
    private WmGrayDataCompareMapper wmGrayDataCompareMapper;

    /**
     * 查询灰度数据对比
     * 
     * @param gridId 灰度数据对比ID
     * @return 灰度数据对比
     */
    @Override
    public WmGrayDataCompare selectWmGrayDataCompareById(Long gridId)
    {
        return wmGrayDataCompareMapper.selectWmGrayDataCompareById(gridId);
    }

    /**
     * 查询灰度数据对比列表
     * 
     * @param wmGrayDataCompare 灰度数据对比
     * @return 灰度数据对比
     */
    @Override
    public List<WmGrayDataCompare> selectWmGrayDataCompareList(WmGrayDataCompare wmGrayDataCompare)
    {
        return wmGrayDataCompareMapper.selectWmGrayDataCompareList(wmGrayDataCompare);
    }

    /**
     * 新增灰度数据对比
     * 
     * @param wmGrayDataCompare 灰度数据对比
     * @return 结果
     */
    @Override
    public int insertWmGrayDataCompare(WmGrayDataCompare wmGrayDataCompare)
    {
        return wmGrayDataCompareMapper.insertWmGrayDataCompare(wmGrayDataCompare);
    }

    /**
     * 修改灰度数据对比
     * 
     * @param wmGrayDataCompare 灰度数据对比
     * @return 结果
     */
    @Override
    public int updateWmGrayDataCompare(WmGrayDataCompare wmGrayDataCompare)
    {
        return wmGrayDataCompareMapper.updateWmGrayDataCompare(wmGrayDataCompare);
    }

    /**
     * 删除灰度数据对比对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWmGrayDataCompareByIds(String ids)
    {
        return wmGrayDataCompareMapper.deleteWmGrayDataCompareByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除灰度数据对比信息
     * 
     * @param gridId 灰度数据对比ID
     * @return 结果
     */
    @Override
    public int deleteWmGrayDataCompareById(Long gridId)
    {
        return wmGrayDataCompareMapper.deleteWmGrayDataCompareById(gridId);
    }
}
