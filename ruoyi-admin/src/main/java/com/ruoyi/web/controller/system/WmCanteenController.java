package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.common.utils.AESUtil;
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
import com.ruoyi.system.domain.WmCanteen;
import com.ruoyi.system.service.IWmCanteenService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商户数据Controller
 *
 * @author zxz
 * @date 2021-03-14
 */
@Controller
@RequestMapping("/system/canteen")
public class WmCanteenController extends BaseController {
    private String prefix = "system/canteen";

    @Autowired
    private IWmCanteenService wmCanteenService;

    @RequiresPermissions("system:canteen:view")
    @GetMapping()
    public String canteen() {
        return prefix + "/canteen";
    }

    /**
     * 查询商户数据列表
     */
    @RequiresPermissions("system:canteen:list")
    @GetMapping("/list")
    @ResponseBody
    public TableDataInfo list(WmCanteen wmCanteen) {
        startPage();
        List<WmCanteen> list = wmCanteenService.selectWmCanteenList(wmCanteen);
        TableDataInfo dataTable = getDataTable(list);
        long total = dataTable.getTotal();
        String t = AESUtil.encryptToBase64(String.valueOf(total), AESUtil.AES_KEY);
        dataTable.setT(t);
        dataTable.setTotal(0);
        return dataTable;
    }

    /**
     * 导出商户数据列表
     */
    @RequiresPermissions("system:canteen:export")
    @Log(title = "商户数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WmCanteen wmCanteen) {
        List<WmCanteen> list = wmCanteenService.selectWmCanteenList(wmCanteen);
        ExcelUtil<WmCanteen> util = new ExcelUtil<WmCanteen>(WmCanteen.class);
        return util.exportExcel(list, "canteen");
    }

    /**
     * 新增商户数据
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存商户数据
     */
    @RequiresPermissions("system:canteen:add")
    @Log(title = "商户数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WmCanteen wmCanteen) {
        return toAjax(wmCanteenService.insertWmCanteen(wmCanteen));
    }

    /**
     * 修改商户数据
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        WmCanteen wmCanteen = wmCanteenService.selectWmCanteenById(id);
        mmap.put("wmCanteen", wmCanteen);
        return prefix + "/edit";
    }

    /**
     * 修改保存商户数据
     */
    @RequiresPermissions("system:canteen:edit")
    @Log(title = "商户数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WmCanteen wmCanteen) {
        return toAjax(wmCanteenService.updateWmCanteen(wmCanteen));
    }

    /**
     * 删除商户数据
     */
    @RequiresPermissions("system:canteen:remove")
    @Log(title = "商户数据", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(wmCanteenService.deleteWmCanteenByIds(ids));
    }
}
