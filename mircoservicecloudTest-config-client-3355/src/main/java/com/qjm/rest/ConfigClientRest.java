package com.qjm.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianjm
 * @date 2018/9/3
 */
@RestController
public class ConfigClientRest {

  @Value("${spring.application.name}")
  private String applicationName;

  @Value("${eureka.client.service-url.defaultZone}")
  private String eurekaServers;

  @Value("${server.port}")
  private String port;

  @RequestMapping("/config")
  public String getConfig(){
    String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
    System.out.println("******str: " + str);
    return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
  }
}
