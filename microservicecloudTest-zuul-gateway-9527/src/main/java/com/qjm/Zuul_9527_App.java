package com.qjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author qianjm
 * @date 2018/9/4
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_App {

  public static void main(String[] args){
    SpringApplication.run(Zuul_9527_App.class,args);
  }
}
