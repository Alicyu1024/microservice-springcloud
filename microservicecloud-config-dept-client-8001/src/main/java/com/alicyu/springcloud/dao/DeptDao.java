package com.alicyu.springcloud.dao;

import com.alicyu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Alicyu
 * @classname DeptDao
 * @description TODO
 * @date 2019/9/8 10:28
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
