package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WmDeliveryScopeAudit;

/**
 * 配送范围审核-人员预算Service接口
 * 
 * @author zxz
 * @date 2021-03-16
 */
public interface IWmDeliveryScopeAuditService 
{
    /**
     * 查询配送范围审核-人员预算
     * 
     * @param id 配送范围审核-人员预算ID
     * @return 配送范围审核-人员预算
     */
    public WmDeliveryScopeAudit selectWmDeliveryScopeAuditById(Long id);

    /**
     * 查询配送范围审核-人员预算列表
     * 
     * @param wmDeliveryScopeAudit 配送范围审核-人员预算
     * @return 配送范围审核-人员预算集合
     */
    public List<WmDeliveryScopeAudit> selectWmDeliveryScopeAuditList(WmDeliveryScopeAudit wmDeliveryScopeAudit);

    /**
     * 新增配送范围审核-人员预算
     * 
     * @param wmDeliveryScopeAudit 配送范围审核-人员预算
     * @return 结果
     */
    public int insertWmDeliveryScopeAudit(WmDeliveryScopeAudit wmDeliveryScopeAudit);

    /**
     * 修改配送范围审核-人员预算
     * 
     * @param wmDeliveryScopeAudit 配送范围审核-人员预算
     * @return 结果
     */
    public int updateWmDeliveryScopeAudit(WmDeliveryScopeAudit wmDeliveryScopeAudit);

    /**
     * 批量删除配送范围审核-人员预算
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmDeliveryScopeAuditByIds(String ids);

    /**
     * 删除配送范围审核-人员预算信息
     * 
     * @param id 配送范围审核-人员预算ID
     * @return 结果
     */
    public int deleteWmDeliveryScopeAuditById(Long id);
}
