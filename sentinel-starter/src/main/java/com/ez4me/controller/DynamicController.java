package com.ez4me.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 集成nacos数据源用于测试
 *
 * @author coolk1ng
 * @since 2022/10/3 23:29
 */
@RestController
public class DynamicController {

    @GetMapping("/dynamic")
    public String dynamic() {
        return "Dynamic Rule";
    }
}
