package com.ruoyi.web.controller.system;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.utils.AESUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.WmPoi;
import com.ruoyi.system.service.IWmPoiService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * poi数据Controller
 *
 * @author ruoyi
 * @date 2021-03-14
 */
@Controller
@RequestMapping("/system/poi")
public class WmPoiController extends BaseController {
    private String prefix = "system/poi";

    @Autowired
    private IWmPoiService wmPoiService;

    @RequiresPermissions("system:poi:view")
    @GetMapping()
    public String poi() {
        return prefix + "/poi";
    }

    /**
     * 查询poi数据列表
     */
    @RequiresPermissions("system:poi:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(@RequestBody WmPoi wmPoi) {
        //startPage();
//        Integer pageNum = wmPoi.getPageNum();
//        Integer pageSize = wmPoi.getPageSize();
        //PageHelper.startPage(pageNum, pageSize);
        List<WmPoi> list = wmPoiService.selectWmPoiList(wmPoi);
        TableDataInfo dataTable = getDataTable(list);
        long total = dataTable.getTotal();
        String t = AESUtil.encryptToBase64(String.valueOf(total), AESUtil.AES_KEY);
        dataTable.setT(t);
        dataTable.setTotal(0);
        return dataTable;
    }

    /**
     * 导出poi数据列表
     */
    @RequiresPermissions("system:poi:export")
    @Log(title = "poi数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WmPoi wmPoi) {
        List<WmPoi> list = wmPoiService.selectWmPoiList(wmPoi);
        ExcelUtil<WmPoi> util = new ExcelUtil<WmPoi>(WmPoi.class);
        return util.exportExcel(list, "poi");
    }

    /**
     * 新增poi数据
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存poi数据
     */
    @RequiresPermissions("system:poi:add")
    @Log(title = "poi数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WmPoi wmPoi) {
        return toAjax(wmPoiService.insertWmPoi(wmPoi));
    }

    /**
     * 修改poi数据
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        WmPoi wmPoi = wmPoiService.selectWmPoiById(id);
        mmap.put("wmPoi", wmPoi);
        return prefix + "/edit";
    }

    /**
     * 修改保存poi数据
     */
    @RequiresPermissions("system:poi:edit")
    @Log(title = "poi数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WmPoi wmPoi) {
        return toAjax(wmPoiService.updateWmPoi(wmPoi));
    }

    /**
     * 删除poi数据
     */
    @RequiresPermissions("system:poi:remove")
    @Log(title = "poi数据", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(wmPoiService.deleteWmPoiByIds(ids));
    }
}
