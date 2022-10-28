package com.ez4me.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sentinel-dashboard
 *
 * @author coolk1ng
 * @since 2022/10/1 05:29
 */
@RestController
public class DashboardController {

    @GetMapping("/dash")
    public String dash() {
        return "hello,dash!!";
    }
}
