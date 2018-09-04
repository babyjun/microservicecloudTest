package com.qjm.controller;

import com.qjm.pojo.Dept;
import com.qjm.service.DeptClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author qianjm
 * @date 2018/9/1
 */
@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {

  @Autowired
  DeptClientService service;

  @RequestMapping(value = "/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id) {
    return service.get(id);
  }

  @RequestMapping(value = "/dept/list")
  public List<Dept> list() {
    return service.list();
  }

  @RequestMapping(value = "/dept/add")
  public Object add(Dept dept) {
    return this.service.add(dept);
  }

}
