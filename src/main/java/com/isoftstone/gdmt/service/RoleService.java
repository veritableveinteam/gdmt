package com.isoftstone.gdmt.service;

import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Role;

import java.util.List;

public interface RoleService {

    Pagination<Role> getRoles(Pagination<Role> page);

    Role getRole(String uuid);

    List<String> getResources(String roleId);

    int linkResource(String roleId, String resources);

    int insertRole(Role role);

    int updateRole(Role role);

    int removeRole(String id);

    List<Role> findAll();

}
