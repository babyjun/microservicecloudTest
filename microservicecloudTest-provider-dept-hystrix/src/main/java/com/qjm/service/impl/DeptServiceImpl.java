package com.qjm.service.impl;

import com.qjm.dao.DeptDao;
import com.qjm.pojo.Dept;
import com.qjm.service.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qianjm
 * @date 2018/9/3
 */
@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  DeptDao deptDao;

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
    List<Dept> findAll = deptDao.findAll();
    if(findAll == null){
      return null;
    }
    return findAll;
  }
}
