package com.ez4me.controller;

import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;

/**
 * 流控规则
 *
 * @author coolk1ng
 * @since 2022/10/1 03:44
 */
public class FlowRuleInitFunc implements InitFunc {
    @Override
    public void init() throws Exception {
        ArrayList<FlowRule> flowRules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setCount(1);
        rule.setResource("hello");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        //rule.setLimitApp("default");
        flowRules.add(rule);
        FlowRuleManager.loadRules(flowRules);
    }
}
