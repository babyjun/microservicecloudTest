package com.qjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qianjm
 * @date 2018/8/30
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {
  public static void main(String[] args){
    SpringApplication.run(EurekaServer7002_App.class,args);
  }
}
