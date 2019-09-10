package com.alicyu.springcloud.service;

import com.alicyu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author Alicyu
 * @classname DeptService
 * @description TODO
 * @date 2019/9/4 20:30
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
