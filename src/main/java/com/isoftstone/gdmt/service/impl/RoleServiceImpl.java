package com.isoftstone.gdmt.service.impl;

import com.isoftstone.gdmt.dao.RoleDao;
import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> findAll() {
        return roleDao.selectByExample(null);
    }

    public Pagination<Role> getRoles(Pagination<Role> page) {
        return null;
    }

    public Role getRole(String uuid) {
        return roleDao.selectByPrimaryKey(uuid);
    }

    public List<String> getResources(String roleId) {
        return null;
    }

    public int linkResource(String roleId, String resources) {
        return 0;
    }

    public int insertRole(Role role) {
        return roleDao.insertSelective(role);
    }

    public void updateRole(Role role) {
        roleDao.updateByPrimaryKeySelective(role);
    }

    public void removeRole(String id) {
        roleDao.deleteByPrimaryKey(id);
    }

}
