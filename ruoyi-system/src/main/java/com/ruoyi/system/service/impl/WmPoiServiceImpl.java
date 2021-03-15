package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WmPoiMapper;
import com.ruoyi.system.domain.WmPoi;
import com.ruoyi.system.service.IWmPoiService;
import com.ruoyi.common.core.text.Convert;

/**
 * poi数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-14
 */
@Service
public class WmPoiServiceImpl implements IWmPoiService 
{
    @Autowired
    private WmPoiMapper wmPoiMapper;

    /**
     * 查询poi数据
     * 
     * @param id poi数据ID
     * @return poi数据
     */
    @Override
    public WmPoi selectWmPoiById(Long id)
    {
        return wmPoiMapper.selectWmPoiById(id);
    }

    /**
     * 查询poi数据列表
     * 
     * @param wmPoi poi数据
     * @return poi数据
     */
    @Override
    public List<WmPoi> selectWmPoiList(WmPoi wmPoi)
    {
        return wmPoiMapper.selectWmPoiList(wmPoi);
    }

    /**
     * 新增poi数据
     * 
     * @param wmPoi poi数据
     * @return 结果
     */
    @Override
    public int insertWmPoi(WmPoi wmPoi)
    {
        return wmPoiMapper.insertWmPoi(wmPoi);
    }

    /**
     * 修改poi数据
     * 
     * @param wmPoi poi数据
     * @return 结果
     */
    @Override
    public int updateWmPoi(WmPoi wmPoi)
    {
        return wmPoiMapper.updateWmPoi(wmPoi);
    }

    /**
     * 删除poi数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWmPoiByIds(String ids)
    {
        return wmPoiMapper.deleteWmPoiByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除poi数据信息
     * 
     * @param id poi数据ID
     * @return 结果
     */
    @Override
    public int deleteWmPoiById(Long id)
    {
        return wmPoiMapper.deleteWmPoiById(id);
    }
}
