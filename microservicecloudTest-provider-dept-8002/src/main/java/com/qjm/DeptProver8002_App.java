package com.qjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qianjm
 * @date 2018/8/30
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProver8002_App {

  public static void main(String[] args){
    SpringApplication.run(DeptProver8002_App.class,args);
  }
}
