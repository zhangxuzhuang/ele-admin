package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WmGriddetailMapper;
import com.ruoyi.system.domain.WmGriddetail;
import com.ruoyi.system.service.IWmGriddetailService;
import com.ruoyi.common.core.text.Convert;

/**
 * 网格餐厅明细Service业务层处理
 * 
 * @author zxz
 * @date 2021-03-16
 */
@Service
public class WmGriddetailServiceImpl implements IWmGriddetailService 
{
    @Autowired
    private WmGriddetailMapper wmGriddetailMapper;

    /**
     * 查询网格餐厅明细
     * 
     * @param id 网格餐厅明细ID
     * @return 网格餐厅明细
     */
    @Override
    public WmGriddetail selectWmGriddetailById(Long id)
    {
        return wmGriddetailMapper.selectWmGriddetailById(id);
    }

    /**
     * 查询网格餐厅明细列表
     * 
     * @param wmGriddetail 网格餐厅明细
     * @return 网格餐厅明细
     */
    @Override
    public List<WmGriddetail> selectWmGriddetailList(WmGriddetail wmGriddetail)
    {
        return wmGriddetailMapper.selectWmGriddetailList(wmGriddetail);
    }

    /**
     * 新增网格餐厅明细
     * 
     * @param wmGriddetail 网格餐厅明细
     * @return 结果
     */
    @Override
    public int insertWmGriddetail(WmGriddetail wmGriddetail)
    {
        return wmGriddetailMapper.insertWmGriddetail(wmGriddetail);
    }

    /**
     * 修改网格餐厅明细
     * 
     * @param wmGriddetail 网格餐厅明细
     * @return 结果
     */
    @Override
    public int updateWmGriddetail(WmGriddetail wmGriddetail)
    {
        return wmGriddetailMapper.updateWmGriddetail(wmGriddetail);
    }

    /**
     * 删除网格餐厅明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWmGriddetailByIds(String ids)
    {
        return wmGriddetailMapper.deleteWmGriddetailByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除网格餐厅明细信息
     * 
     * @param id 网格餐厅明细ID
     * @return 结果
     */
    @Override
    public int deleteWmGriddetailById(Long id)
    {
        return wmGriddetailMapper.deleteWmGriddetailById(id);
    }
}
