package com.qjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qianjm
 * @date 2018/9/4
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServiceApplication {

  public static void main(String[] args){
    SpringApplication.run(Config_Git_EurekaServiceApplication.class,args);
  }
}
