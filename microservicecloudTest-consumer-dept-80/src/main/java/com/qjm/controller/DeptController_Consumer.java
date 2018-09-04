package com.qjm.controller;

import com.qjm.pojo.Dept;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qianjm
 * @date 2018/8/30
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

  private static final String REST_URL_PREFIX ="http://MICROSERVICECLOUDTEST-DEPT";
  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping(value="/add")
  public boolean add(Dept dept){
    return restTemplate.postForObject(REST_URL_PREFIX+"/add",dept,Boolean.class);
  }

  @RequestMapping("/get/{id}")
  public Dept get(@PathVariable("id") Long id){
    return restTemplate.getForObject(REST_URL_PREFIX+"get/"+id,Dept.class);
  }

  @RequestMapping(value="/list")
  public List<Dept> list(){
    return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
  }
}
