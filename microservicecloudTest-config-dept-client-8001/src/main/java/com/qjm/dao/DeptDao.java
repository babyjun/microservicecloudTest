package com.qjm.dao;

import com.qjm.pojo.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qianjm
 * @date 2018/8/30
 */
@Mapper
public interface DeptDao {

  public boolean addDept(Dept dept);

  public Dept findById(Long id);

  public List<Dept> findAll();
}
