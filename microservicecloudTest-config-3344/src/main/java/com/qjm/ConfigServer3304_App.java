package com.qjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author qianjm
 * @date 2018/9/3
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer3304_App {

  public static void main(String[] args){
    SpringApplication.run(ConfigServer3304_App.class,args);
  }
}
