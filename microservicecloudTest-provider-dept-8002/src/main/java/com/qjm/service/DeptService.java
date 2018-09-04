package com.qjm.service;

import com.qjm.pojo.Dept;
import java.util.List;

/**
 * @author qianjm
 * @date 2018/8/30
 */
public interface DeptService {

  public boolean add(Dept dept);

  public Dept get(Long id);

  public List<Dept> list();
}
