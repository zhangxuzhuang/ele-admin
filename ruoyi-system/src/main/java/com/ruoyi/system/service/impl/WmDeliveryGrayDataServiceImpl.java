package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WmDeliveryGrayDataMapper;
import com.ruoyi.system.domain.WmDeliveryGrayData;
import com.ruoyi.system.service.IWmDeliveryGrayDataService;
import com.ruoyi.common.core.text.Convert;

/**
 * 配送平台灰测维度数据Service业务层处理
 * 
 * @author zxz
 * @date 2021-03-16
 */
@Service
public class WmDeliveryGrayDataServiceImpl implements IWmDeliveryGrayDataService 
{
    @Autowired
    private WmDeliveryGrayDataMapper wmDeliveryGrayDataMapper;

    /**
     * 查询配送平台灰测维度数据
     * 
     * @param canteenId 配送平台灰测维度数据ID
     * @return 配送平台灰测维度数据
     */
    @Override
    public WmDeliveryGrayData selectWmDeliveryGrayDataById(Long canteenId)
    {
        return wmDeliveryGrayDataMapper.selectWmDeliveryGrayDataById(canteenId);
    }

    /**
     * 查询配送平台灰测维度数据列表
     * 
     * @param wmDeliveryGrayData 配送平台灰测维度数据
     * @return 配送平台灰测维度数据
     */
    @Override
    public List<WmDeliveryGrayData> selectWmDeliveryGrayDataList(WmDeliveryGrayData wmDeliveryGrayData)
    {
        return wmDeliveryGrayDataMapper.selectWmDeliveryGrayDataList(wmDeliveryGrayData);
    }

    /**
     * 新增配送平台灰测维度数据
     * 
     * @param wmDeliveryGrayData 配送平台灰测维度数据
     * @return 结果
     */
    @Override
    public int insertWmDeliveryGrayData(WmDeliveryGrayData wmDeliveryGrayData)
    {
        return wmDeliveryGrayDataMapper.insertWmDeliveryGrayData(wmDeliveryGrayData);
    }

    /**
     * 修改配送平台灰测维度数据
     * 
     * @param wmDeliveryGrayData 配送平台灰测维度数据
     * @return 结果
     */
    @Override
    public int updateWmDeliveryGrayData(WmDeliveryGrayData wmDeliveryGrayData)
    {
        return wmDeliveryGrayDataMapper.updateWmDeliveryGrayData(wmDeliveryGrayData);
    }

    /**
     * 删除配送平台灰测维度数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWmDeliveryGrayDataByIds(String ids)
    {
        return wmDeliveryGrayDataMapper.deleteWmDeliveryGrayDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除配送平台灰测维度数据信息
     * 
     * @param canteenId 配送平台灰测维度数据ID
     * @return 结果
     */
    @Override
    public int deleteWmDeliveryGrayDataById(Long canteenId)
    {
        return wmDeliveryGrayDataMapper.deleteWmDeliveryGrayDataById(canteenId);
    }
}
