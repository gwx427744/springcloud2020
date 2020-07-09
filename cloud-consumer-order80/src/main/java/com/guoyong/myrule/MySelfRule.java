package com.guoyong.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guoyong
 * @date 2020/6/17 - 23:50
 * 该类不能放在@ComponentScan所扫描的当前包下以及子包下
 */
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
        return new RandomRule();
    }
}
