package com.alicyu.springcloud.service.impl;

import com.alicyu.springcloud.dao.DeptDao;
import com.alicyu.springcloud.entities.Dept;
import com.alicyu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alicyu
 * @classname DeptServiceImpl
 * @description TODO
 * @date 2019/9/4 20:30
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
