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
import com.ruoyi.system.domain.WmDeliveryScopeAudit;
import com.ruoyi.system.service.IWmDeliveryScopeAuditService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配送范围审核-人员预算Controller
 *
 * @author zxz
 * @date 2021-03-16
 */
@Controller
@RequestMapping("/system/deliveryScopeAudit")
public class WmDeliveryScopeAuditController extends BaseController
{
    private String prefix = "system/deliveryScopeAudit";

    @Autowired
    private IWmDeliveryScopeAuditService wmDeliveryScopeAuditService;

    @RequiresPermissions("system:deliveryScopeAudit:view")
    @GetMapping()
    public String deliveryScopeAudit()
    {
        return prefix + "/deliveryScopeAudit";
    }

    /**
     * 查询配送范围审核-人员预算列表
     */
    @RequiresPermissions("system:deliveryScopeAudit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WmDeliveryScopeAudit wmDeliveryScopeAudit)
    {
        startPage();
        List<WmDeliveryScopeAudit> list = wmDeliveryScopeAuditService.selectWmDeliveryScopeAuditList(wmDeliveryScopeAudit);
        return getDataTable(list);
    }

    /**
     * 导出配送范围审核-人员预算列表
     */
    @RequiresPermissions("system:deliveryScopeAudit:export")
    @Log(title = "配送范围审核-人员预算", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WmDeliveryScopeAudit wmDeliveryScopeAudit)
    {
        List<WmDeliveryScopeAudit> list = wmDeliveryScopeAuditService.selectWmDeliveryScopeAuditList(wmDeliveryScopeAudit);
        ExcelUtil<WmDeliveryScopeAudit> util = new ExcelUtil<WmDeliveryScopeAudit>(WmDeliveryScopeAudit.class);
        return util.exportExcel(list, "deliveryScopeAudit");
    }

    /**
     * 新增配送范围审核-人员预算
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存配送范围审核-人员预算
     */
    @RequiresPermissions("system:deliveryScopeAudit:add")
    @Log(title = "配送范围审核-人员预算", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WmDeliveryScopeAudit wmDeliveryScopeAudit)
    {
        return toAjax(wmDeliveryScopeAuditService.insertWmDeliveryScopeAudit(wmDeliveryScopeAudit));
    }

    /**
     * 修改配送范围审核-人员预算
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        WmDeliveryScopeAudit wmDeliveryScopeAudit = wmDeliveryScopeAuditService.selectWmDeliveryScopeAuditById(id);
        mmap.put("wmDeliveryScopeAudit", wmDeliveryScopeAudit);
        return prefix + "/edit";
    }

    /**
     * 修改保存配送范围审核-人员预算
     */
    @RequiresPermissions("system:deliveryScopeAudit:edit")
    @Log(title = "配送范围审核-人员预算", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WmDeliveryScopeAudit wmDeliveryScopeAudit)
    {
        return toAjax(wmDeliveryScopeAuditService.updateWmDeliveryScopeAudit(wmDeliveryScopeAudit));
    }

    /**
     * 删除配送范围审核-人员预算
     */
    @RequiresPermissions("system:deliveryScopeAudit:remove")
    @Log(title = "配送范围审核-人员预算", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wmDeliveryScopeAuditService.deleteWmDeliveryScopeAuditByIds(ids));
    }
}
