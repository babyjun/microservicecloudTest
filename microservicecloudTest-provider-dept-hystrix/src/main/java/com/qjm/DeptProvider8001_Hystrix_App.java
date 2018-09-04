package com.qjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qianjm
 * @date 2018/9/3
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DeptProvider8001_Hystrix_App {
  public static void main(String[] args){
    SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
  }
}
