package com.qjm.service.impl;

import com.qjm.dao.DeptDao;
import com.qjm.pojo.Dept;
import com.qjm.service.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qianjm
 * @date 2018/8/30
 */
@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  private DeptDao deptDao;

  @Override
  public boolean add(Dept dept) {
    return deptDao.addDept(dept);
  }

  @Override
  public Dept get(Long id) {
    return deptDao.findById(id);
  }

  @Override
  public List<Dept> list() {
    return deptDao.findAll();
  }
}
