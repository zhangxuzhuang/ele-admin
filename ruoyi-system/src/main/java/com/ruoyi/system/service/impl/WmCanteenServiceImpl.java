package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WmCanteenMapper;
import com.ruoyi.system.domain.WmCanteen;
import com.ruoyi.system.service.IWmCanteenService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商户数据Service业务层处理
 * 
 * @author zxz
 * @date 2021-03-14
 */
@Service
public class WmCanteenServiceImpl implements IWmCanteenService 
{
    @Autowired
    private WmCanteenMapper wmCanteenMapper;

    /**
     * 查询商户数据
     * 
     * @param id 商户数据ID
     * @return 商户数据
     */
    @Override
    public WmCanteen selectWmCanteenById(Long id)
    {
        return wmCanteenMapper.selectWmCanteenById(id);
    }

    /**
     * 查询商户数据列表
     * 
     * @param wmCanteen 商户数据
     * @return 商户数据
     */
    @Override
    public List<WmCanteen> selectWmCanteenList(WmCanteen wmCanteen)
    {
        return wmCanteenMapper.selectWmCanteenList(wmCanteen);
    }

    /**
     * 新增商户数据
     * 
     * @param wmCanteen 商户数据
     * @return 结果
     */
    @Override
    public int insertWmCanteen(WmCanteen wmCanteen)
    {
        return wmCanteenMapper.insertWmCanteen(wmCanteen);
    }

    /**
     * 修改商户数据
     * 
     * @param wmCanteen 商户数据
     * @return 结果
     */
    @Override
    public int updateWmCanteen(WmCanteen wmCanteen)
    {
        return wmCanteenMapper.updateWmCanteen(wmCanteen);
    }

    /**
     * 删除商户数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWmCanteenByIds(String ids)
    {
        return wmCanteenMapper.deleteWmCanteenByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商户数据信息
     * 
     * @param id 商户数据ID
     * @return 结果
     */
    @Override
    public int deleteWmCanteenById(Long id)
    {
        return wmCanteenMapper.deleteWmCanteenById(id);
    }
}
