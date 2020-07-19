package com.isoftstone.gdmt.service;

import com.isoftstone.gdmt.model.Node;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Resource;
import com.isoftstone.gdmt.util.PageResult;

import java.util.List;

public interface ResourceService {

    List<Resource> finAll();

    void remove(String id);

    PageResult findPage(int pageNum, int pageSize);

    void insert(Resource res);

    void update(Resource res);

    Resource findOne(String id);

    PageResult findPage(Resource organ, int page, int rows);

    Pagination<Resource> findPagination(int pageNumber, int pageSize);

    List<Node> getResourcesByParentId(String parentId);

}
