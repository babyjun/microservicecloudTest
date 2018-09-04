package com.qjm.controller;

import com.qjm.pojo.Dept;
import com.qjm.service.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianjm
 * @date 2018/8/30
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

  @Autowired
  DeptService deptService;

  @RequestMapping(value="/add",method=RequestMethod.POST)
  public boolean add(Dept dept){
    return deptService.add(dept);
  }

  @RequestMapping(value="/get/{id}",method=RequestMethod.GET)
  public Dept get(@PathVariable("id")Long id){
    return deptService.get(id);
  }

  @RequestMapping(value="/list",method=RequestMethod.GET)
  public List<Dept> list(){
    return deptService.list();
  }
}
