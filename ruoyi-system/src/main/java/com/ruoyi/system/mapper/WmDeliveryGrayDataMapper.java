package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WmDeliveryGrayData;

/**
 * 配送平台灰测维度数据Mapper接口
 * 
 * @author zxz
 * @date 2021-03-16
 */
public interface WmDeliveryGrayDataMapper 
{
    /**
     * 查询配送平台灰测维度数据
     * 
     * @param canteenId 配送平台灰测维度数据ID
     * @return 配送平台灰测维度数据
     */
    public WmDeliveryGrayData selectWmDeliveryGrayDataById(Long canteenId);

    /**
     * 查询配送平台灰测维度数据列表
     * 
     * @param wmDeliveryGrayData 配送平台灰测维度数据
     * @return 配送平台灰测维度数据集合
     */
    public List<WmDeliveryGrayData> selectWmDeliveryGrayDataList(WmDeliveryGrayData wmDeliveryGrayData);

    /**
     * 新增配送平台灰测维度数据
     * 
     * @param wmDeliveryGrayData 配送平台灰测维度数据
     * @return 结果
     */
    public int insertWmDeliveryGrayData(WmDeliveryGrayData wmDeliveryGrayData);

    /**
     * 修改配送平台灰测维度数据
     * 
     * @param wmDeliveryGrayData 配送平台灰测维度数据
     * @return 结果
     */
    public int updateWmDeliveryGrayData(WmDeliveryGrayData wmDeliveryGrayData);

    /**
     * 删除配送平台灰测维度数据
     * 
     * @param canteenId 配送平台灰测维度数据ID
     * @return 结果
     */
    public int deleteWmDeliveryGrayDataById(Long canteenId);

    /**
     * 批量删除配送平台灰测维度数据
     * 
     * @param canteenIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWmDeliveryGrayDataByIds(String[] canteenIds);
}
