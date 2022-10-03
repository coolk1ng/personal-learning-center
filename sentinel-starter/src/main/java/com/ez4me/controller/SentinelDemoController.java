package com.ez4me.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphO;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * sentinel-demo
 *
 * @author CodeSn1per
 * @since 2022/8/18 01:54
 */
@RestController
public class SentinelDemoController {

    @GetMapping("/sentinelByException")
    public String sentinelByException() {
        try(Entry entry = SphU.entry("Hello")) {
            return "sentinel!!!";
        } catch (BlockException e) {
            e.printStackTrace();
            return "系统繁忙";
        }
    }

    @GetMapping("/sentinelByBoolean")
    public Boolean sentinelByBoolean() {
        if (SphO.entry("Hello")) {
            try {
                System.out.println("访问成功!!!");
                return true;
            }finally {
                SphO.exit();
            }
        }else {
            System.out.println("系统繁忙!!");
        }
        return false;
    }

    /**
     * 定义限流规则
     *
     * @return void
     */
    @PostConstruct
    private void initFlowRules() {
        ArrayList<FlowRule> flowRules = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        flowRule.setResource("Hello");
        // 限流类型
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        flowRule.setCount(2);
        flowRules.add(flowRule);
        FlowRuleManager.loadRules(flowRules);
    }
}
