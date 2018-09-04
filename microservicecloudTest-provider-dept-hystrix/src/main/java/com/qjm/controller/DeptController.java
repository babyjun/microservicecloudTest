package com.qjm.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
 * @date 2018/9/3
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


  @RequestMapping(value="/get/{id}",method = RequestMethod.GET)
  @HystrixCommand(fallbackMethod = "processHystrix_Get")
  public Dept get(@PathVariable("id") Long id){
    Dept dept =deptService.get(id);
    if(dept ==null){
      throw new RuntimeException("该ID: "+id+" 没有与之相对应的信息!!");
    }
    return dept;
  }

  public Dept processHystrix_Get(@PathVariable("id")Long id){
    return new Dept().setDeptno(id).setDname("该ID：\" + id + \"没有没有对应的信息,null--@HystrixCommand").setDb_source("no this database in MySQL");
  }

  @RequestMapping(value="/list",method=RequestMethod.GET)
  public List<Dept> list(){
    return deptService.list();
  }
}
