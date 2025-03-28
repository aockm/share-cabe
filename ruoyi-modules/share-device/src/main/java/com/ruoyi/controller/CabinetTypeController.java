package com.ruoyi.controller;

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.page.TableDataInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cabinetType")
public class CabinetTypeController extends BaseController {
    @GetMapping("/list")
    public String list() {
        return "cabinetType/list";
    }
}
