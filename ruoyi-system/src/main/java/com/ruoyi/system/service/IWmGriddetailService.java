package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WmGriddetail;

/**
 * 网格餐厅明细Service接口
 * 
 * @author zxz
 * @date 2021-03-16
 */
public interface IWmGriddetailService 
{
    /**
     * 查询网格餐厅明细
     * 
     * @param id 网格餐厅明细ID
     * @return 网格餐厅明细
     */
    public WmGriddetail selectWmGriddetailById(Long id);

    /**
     * 查询网格餐厅明细列表
     * 
     * @param wmGriddetail 网格餐厅明细
     * @return 网格餐厅明细集合
     */
    public List<WmGriddetail> selectWmGriddetailList(WmGriddetail wmGriddetail);

    /**
     * 新增网格餐厅明细
     * 
     * @param wmGriddetail 网格餐厅明细
     * @return 结果
     */
    public int insertWmGriddetail(WmGriddetail wmGriddetail);

    /**
     * 修改网格餐厅明细
     * 
     * @param wmGriddetail 网格餐厅明细
     * @return 结果
     */
    public int updateWmGriddetail(WmGriddetail wmGriddetail);

    /**
     * 批量删除网格餐厅明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmGriddetailByIds(String ids);

    /**
     * 删除网格餐厅明细信息
     * 
     * @param id 网格餐厅明细ID
     * @return 结果
     */
    public int deleteWmGriddetailById(Long id);
}
