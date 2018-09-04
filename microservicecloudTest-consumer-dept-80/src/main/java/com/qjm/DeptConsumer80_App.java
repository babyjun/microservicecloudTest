package com.qjm;

import com.qjm.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author qianjm
 * @date 2018/8/30
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class DeptConsumer80_App {
  public static void main(String[] args){
    SpringApplication.run(DeptConsumer80_App.class,args);
  }
}
