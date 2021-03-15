package com.ruoyi.framework.config;

import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRuleManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * @Author: zhangxuzhuang
 * @DateTime: 2021/3/15 下午9:19
 * @Description: TODO
 */
@Configuration
public class SentinelConfig {
    /**
     * @param
     * @description: 热点限流规则初始化
     * @return: void
     * @author: zxz
     * @date: 2021/3/15
     */
    @Bean
    public void initFlowQpsRule() {
        ParamFlowRule rule = new ParamFlowRule("request")
                .setParamIdx(0)
                .setCount(10);
        ParamFlowRuleManager.loadRules(Collections.singletonList(rule));
    }
}
