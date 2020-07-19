package com.isoftstone.gdmt.service;

import com.isoftstone.gdmt.model.url;
import com.isoftstone.gdmt.util.PageResult;

import java.util.List;

public interface urlService {

    List<url> finAll();

    void remove(String id);

    PageResult findPage(int pageNum, int pageSize);

    void insert(url res);

    void update(url res);

    url findOne(String id);

}
