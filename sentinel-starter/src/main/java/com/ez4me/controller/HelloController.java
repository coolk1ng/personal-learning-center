package com.ez4me.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coolk1ng
 * @since 2022/10/1 03:39
 */
@RestController
public class HelloController {

    @GetMapping(value = "/say")
    @SentinelResource(value = "hello", blockHandler = "blockHandlerHello")
    public String hello() {
        return "hello!!";
    }

    public String blockHandlerHello(BlockException e) {
        return "被限流了!!";
    }

}
