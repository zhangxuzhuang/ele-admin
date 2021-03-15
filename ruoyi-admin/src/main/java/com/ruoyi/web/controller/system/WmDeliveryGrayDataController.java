package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.WmDeliveryGrayData;
import com.ruoyi.system.service.IWmDeliveryGrayDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配送平台灰测维度数据Controller
 *
 * @author zxz
 * @date 2021-03-16
 */
@Controller
@RequestMapping("/system/deliveryGrayData")
public class WmDeliveryGrayDataController extends BaseController
{
    private String prefix = "system/deliveryGrayData";

    @Autowired
    private IWmDeliveryGrayDataService wmDeliveryGrayDataService;

    @RequiresPermissions("system:deliveryGrayData:view")
    @GetMapping()
    public String deliveryGrayData()
    {
        return prefix + "/deliveryGrayData";
    }

    /**
     * 查询配送平台灰测维度数据列表
     */
    @RequiresPermissions("system:deliveryGrayData:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WmDeliveryGrayData wmDeliveryGrayData)
    {
        startPage();
        List<WmDeliveryGrayData> list = wmDeliveryGrayDataService.selectWmDeliveryGrayDataList(wmDeliveryGrayData);
        return getDataTable(list);
    }

    /**
     * 导出配送平台灰测维度数据列表
     */
    @RequiresPermissions("system:deliveryGrayData:export")
    @Log(title = "配送平台灰测维度数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WmDeliveryGrayData wmDeliveryGrayData)
    {
        List<WmDeliveryGrayData> list = wmDeliveryGrayDataService.selectWmDeliveryGrayDataList(wmDeliveryGrayData);
        ExcelUtil<WmDeliveryGrayData> util = new ExcelUtil<WmDeliveryGrayData>(WmDeliveryGrayData.class);
        return util.exportExcel(list, "deliveryGrayData");
    }

    /**
     * 新增配送平台灰测维度数据
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存配送平台灰测维度数据
     */
    @RequiresPermissions("system:deliveryGrayData:add")
    @Log(title = "配送平台灰测维度数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WmDeliveryGrayData wmDeliveryGrayData)
    {
        return toAjax(wmDeliveryGrayDataService.insertWmDeliveryGrayData(wmDeliveryGrayData));
    }

    /**
     * 修改配送平台灰测维度数据
     */
    @GetMapping("/edit/{canteenId}")
    public String edit(@PathVariable("canteenId") Long canteenId, ModelMap mmap)
    {
        WmDeliveryGrayData wmDeliveryGrayData = wmDeliveryGrayDataService.selectWmDeliveryGrayDataById(canteenId);
        mmap.put("wmDeliveryGrayData", wmDeliveryGrayData);
        return prefix + "/edit";
    }

    /**
     * 修改保存配送平台灰测维度数据
     */
    @RequiresPermissions("system:deliveryGrayData:edit")
    @Log(title = "配送平台灰测维度数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WmDeliveryGrayData wmDeliveryGrayData)
    {
        return toAjax(wmDeliveryGrayDataService.updateWmDeliveryGrayData(wmDeliveryGrayData));
    }

    /**
     * 删除配送平台灰测维度数据
     */
    @RequiresPermissions("system:deliveryGrayData:remove")
    @Log(title = "配送平台灰测维度数据", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wmDeliveryGrayDataService.deleteWmDeliveryGrayDataByIds(ids));
    }
}
