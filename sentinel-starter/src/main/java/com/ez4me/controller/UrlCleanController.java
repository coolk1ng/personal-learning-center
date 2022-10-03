package com.ez4me.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * url资源清洗
 *
 * @author coolk1ng
 * @since 2022/10/3 23:20
 */
@RestController
public class UrlCleanController {

    @GetMapping("/clean/{id}")
    public String clean(@PathVariable("id") String id) {
        return "clean!!";
    }
}
