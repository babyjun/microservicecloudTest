package com.qjm.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qianjm
 * @date 2018/8/31
 */
@Configuration
public class MyselfRule {

  @Bean
  public IRule getIRule() {
    return new RandomRule_5();
  }
}
