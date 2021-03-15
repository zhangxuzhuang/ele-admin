package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WmCanteen;

/**
 * 商户数据Mapper接口
 * 
 * @author zxz
 * @date 2021-03-14
 */
public interface WmCanteenMapper 
{
    /**
     * 查询商户数据
     * 
     * @param id 商户数据ID
     * @return 商户数据
     */
    public WmCanteen selectWmCanteenById(Long id);

    /**
     * 查询商户数据列表
     * 
     * @param wmCanteen 商户数据
     * @return 商户数据集合
     */
    public List<WmCanteen> selectWmCanteenList(WmCanteen wmCanteen);

    /**
     * 新增商户数据
     * 
     * @param wmCanteen 商户数据
     * @return 结果
     */
    public int insertWmCanteen(WmCanteen wmCanteen);

    /**
     * 修改商户数据
     * 
     * @param wmCanteen 商户数据
     * @return 结果
     */
    public int updateWmCanteen(WmCanteen wmCanteen);

    /**
     * 删除商户数据
     * 
     * @param id 商户数据ID
     * @return 结果
     */
    public int deleteWmCanteenById(Long id);

    /**
     * 批量删除商户数据
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmCanteenByIds(String[] ids);
}
