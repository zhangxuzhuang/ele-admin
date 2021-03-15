package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WmPoi;

/**
 * poi数据Mapper接口
 * 
 * @author ruoyi
 * @date 2021-03-14
 */
public interface WmPoiMapper 
{
    /**
     * 查询poi数据
     * 
     * @param id poi数据ID
     * @return poi数据
     */
    public WmPoi selectWmPoiById(Long id);

    /**
     * 查询poi数据列表
     * 
     * @param wmPoi poi数据
     * @return poi数据集合
     */
    public List<WmPoi> selectWmPoiList(WmPoi wmPoi);

    /**
     * 新增poi数据
     * 
     * @param wmPoi poi数据
     * @return 结果
     */
    public int insertWmPoi(WmPoi wmPoi);

    /**
     * 修改poi数据
     * 
     * @param wmPoi poi数据
     * @return 结果
     */
    public int updateWmPoi(WmPoi wmPoi);

    /**
     * 删除poi数据
     * 
     * @param id poi数据ID
     * @return 结果
     */
    public int deleteWmPoiById(Long id);

    /**
     * 批量删除poi数据
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmPoiByIds(String[] ids);
}
