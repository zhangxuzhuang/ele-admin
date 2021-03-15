package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WmDeliveryScopeAuditMapper;
import com.ruoyi.system.domain.WmDeliveryScopeAudit;
import com.ruoyi.system.service.IWmDeliveryScopeAuditService;
import com.ruoyi.common.core.text.Convert;

/**
 * 配送范围审核-人员预算Service业务层处理
 * 
 * @author zxz
 * @date 2021-03-16
 */
@Service
public class WmDeliveryScopeAuditServiceImpl implements IWmDeliveryScopeAuditService 
{
    @Autowired
    private WmDeliveryScopeAuditMapper wmDeliveryScopeAuditMapper;

    /**
     * 查询配送范围审核-人员预算
     * 
     * @param id 配送范围审核-人员预算ID
     * @return 配送范围审核-人员预算
     */
    @Override
    public WmDeliveryScopeAudit selectWmDeliveryScopeAuditById(Long id)
    {
        return wmDeliveryScopeAuditMapper.selectWmDeliveryScopeAuditById(id);
    }

    /**
     * 查询配送范围审核-人员预算列表
     * 
     * @param wmDeliveryScopeAudit 配送范围审核-人员预算
     * @return 配送范围审核-人员预算
     */
    @Override
    public List<WmDeliveryScopeAudit> selectWmDeliveryScopeAuditList(WmDeliveryScopeAudit wmDeliveryScopeAudit)
    {
        return wmDeliveryScopeAuditMapper.selectWmDeliveryScopeAuditList(wmDeliveryScopeAudit);
    }

    /**
     * 新增配送范围审核-人员预算
     * 
     * @param wmDeliveryScopeAudit 配送范围审核-人员预算
     * @return 结果
     */
    @Override
    public int insertWmDeliveryScopeAudit(WmDeliveryScopeAudit wmDeliveryScopeAudit)
    {
        wmDeliveryScopeAudit.setCreateTime(DateUtils.getNowDate());
        return wmDeliveryScopeAuditMapper.insertWmDeliveryScopeAudit(wmDeliveryScopeAudit);
    }

    /**
     * 修改配送范围审核-人员预算
     * 
     * @param wmDeliveryScopeAudit 配送范围审核-人员预算
     * @return 结果
     */
    @Override
    public int updateWmDeliveryScopeAudit(WmDeliveryScopeAudit wmDeliveryScopeAudit)
    {
        return wmDeliveryScopeAuditMapper.updateWmDeliveryScopeAudit(wmDeliveryScopeAudit);
    }

    /**
     * 删除配送范围审核-人员预算对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWmDeliveryScopeAuditByIds(String ids)
    {
        return wmDeliveryScopeAuditMapper.deleteWmDeliveryScopeAuditByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除配送范围审核-人员预算信息
     * 
     * @param id 配送范围审核-人员预算ID
     * @return 结果
     */
    @Override
    public int deleteWmDeliveryScopeAuditById(Long id)
    {
        return wmDeliveryScopeAuditMapper.deleteWmDeliveryScopeAuditById(id);
    }
}
