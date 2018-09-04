package com.qjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qianjm
 * @date 2018/9/1
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.qjm"})
@ComponentScan("com.qjm")
public class DeptConsumerFeign_App {

  public static void main(String[] args) {
    SpringApplication.run(DeptConsumerFeign_App.class, args);
  }
}
