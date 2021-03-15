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
import com.ruoyi.system.domain.WmGrayDataCompare;
import com.ruoyi.system.service.IWmGrayDataCompareService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 灰度数据对比Controller
 *
 * @author zxz
 * @date 2021-03-16
 */
@Controller
@RequestMapping("/system/grayDataCompare")
public class WmGrayDataCompareController extends BaseController
{
    private String prefix = "system/grayDataCompare";

    @Autowired
    private IWmGrayDataCompareService wmGrayDataCompareService;

    @RequiresPermissions("system:grayDataCompare:view")
    @GetMapping()
    public String grayDataCompare()
    {
        return prefix + "/grayDataCompare";
    }

    /**
     * 查询灰度数据对比列表
     */
    @RequiresPermissions("system:grayDataCompare:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WmGrayDataCompare wmGrayDataCompare)
    {
        startPage();
        List<WmGrayDataCompare> list = wmGrayDataCompareService.selectWmGrayDataCompareList(wmGrayDataCompare);
        return getDataTable(list);
    }

    /**
     * 导出灰度数据对比列表
     */
    @RequiresPermissions("system:grayDataCompare:export")
    @Log(title = "灰度数据对比", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WmGrayDataCompare wmGrayDataCompare)
    {
        List<WmGrayDataCompare> list = wmGrayDataCompareService.selectWmGrayDataCompareList(wmGrayDataCompare);
        ExcelUtil<WmGrayDataCompare> util = new ExcelUtil<WmGrayDataCompare>(WmGrayDataCompare.class);
        return util.exportExcel(list, "grayDataCompare");
    }

    /**
     * 新增灰度数据对比
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存灰度数据对比
     */
    @RequiresPermissions("system:grayDataCompare:add")
    @Log(title = "灰度数据对比", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WmGrayDataCompare wmGrayDataCompare)
    {
        return toAjax(wmGrayDataCompareService.insertWmGrayDataCompare(wmGrayDataCompare));
    }

    /**
     * 修改灰度数据对比
     */
    @GetMapping("/edit/{gridId}")
    public String edit(@PathVariable("gridId") Long gridId, ModelMap mmap)
    {
        WmGrayDataCompare wmGrayDataCompare = wmGrayDataCompareService.selectWmGrayDataCompareById(gridId);
        mmap.put("wmGrayDataCompare", wmGrayDataCompare);
        return prefix + "/edit";
    }

    /**
     * 修改保存灰度数据对比
     */
    @RequiresPermissions("system:grayDataCompare:edit")
    @Log(title = "灰度数据对比", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WmGrayDataCompare wmGrayDataCompare)
    {
        return toAjax(wmGrayDataCompareService.updateWmGrayDataCompare(wmGrayDataCompare));
    }

    /**
     * 删除灰度数据对比
     */
    @RequiresPermissions("system:grayDataCompare:remove")
    @Log(title = "灰度数据对比", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wmGrayDataCompareService.deleteWmGrayDataCompareByIds(ids));
    }
}
