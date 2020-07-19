package com.isoftstone.gdmt.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.isoftstone.gdmt.dao.urlMapper;
import com.isoftstone.gdmt.model.url;
import com.isoftstone.gdmt.service.urlService;
import com.isoftstone.gdmt.util.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class urlServiceImpl implements urlService {

    @Autowired
    private urlMapper resMapper;

    @Override
    public List<url> finAll() {

        return resMapper.selectByExample(null);
    }

    @Override
    public void remove(String id) {
        resMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void insert(url res) {
        resMapper.insert(res);

    }

    @Override
    public void update(url res) {
        resMapper.updateByPrimaryKey(res);

    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<url> page = (Page<url>) resMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public url findOne(String id) {
        System.out.println("Service uuid:" + id);
        url resource = resMapper.selectByPrimaryKey(id);
        System.out.println("Service Resource:" + resource);
        return resource;
    }

}
