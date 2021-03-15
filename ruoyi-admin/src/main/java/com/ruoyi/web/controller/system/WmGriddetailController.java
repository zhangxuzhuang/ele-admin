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
import com.ruoyi.system.domain.WmGriddetail;
import com.ruoyi.system.service.IWmGriddetailService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网格餐厅明细Controller
 *
 * @author zxz
 * @date 2021-03-16
 */
@Controller
@RequestMapping("/system/gridDetail")
public class WmGriddetailController extends BaseController
{
    private String prefix = "system/gridDetail";

    @Autowired
    private IWmGriddetailService wmGriddetailService;

    @RequiresPermissions("system:gridDetail:view")
    @GetMapping()
    public String gridDetail()
    {
        return prefix + "/gridDetail";
    }

    /**
     * 查询网格餐厅明细列表
     */
    @RequiresPermissions("system:gridDetail:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WmGriddetail wmGriddetail)
    {
        startPage();
        List<WmGriddetail> list = wmGriddetailService.selectWmGriddetailList(wmGriddetail);
        return getDataTable(list);
    }

    /**
     * 导出网格餐厅明细列表
     */
    @RequiresPermissions("system:gridDetail:export")
    @Log(title = "网格餐厅明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WmGriddetail wmGriddetail)
    {
        List<WmGriddetail> list = wmGriddetailService.selectWmGriddetailList(wmGriddetail);
        ExcelUtil<WmGriddetail> util = new ExcelUtil<WmGriddetail>(WmGriddetail.class);
        return util.exportExcel(list, "gridDetail");
    }

    /**
     * 新增网格餐厅明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存网格餐厅明细
     */
    @RequiresPermissions("system:gridDetail:add")
    @Log(title = "网格餐厅明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WmGriddetail wmGriddetail)
    {
        return toAjax(wmGriddetailService.insertWmGriddetail(wmGriddetail));
    }

    /**
     * 修改网格餐厅明细
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        WmGriddetail wmGriddetail = wmGriddetailService.selectWmGriddetailById(id);
        mmap.put("wmGriddetail", wmGriddetail);
        return prefix + "/edit";
    }

    /**
     * 修改保存网格餐厅明细
     */
    @RequiresPermissions("system:gridDetail:edit")
    @Log(title = "网格餐厅明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WmGriddetail wmGriddetail)
    {
        return toAjax(wmGriddetailService.updateWmGriddetail(wmGriddetail));
    }

    /**
     * 删除网格餐厅明细
     */
    @RequiresPermissions("system:gridDetail:remove")
    @Log(title = "网格餐厅明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wmGriddetailService.deleteWmGriddetailByIds(ids));
    }
}
