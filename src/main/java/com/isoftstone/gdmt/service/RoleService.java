package com.isoftstone.gdmt.service;

import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Role;

import java.util.List;

public interface RoleService {

    public Pagination<Role> getRoles(Pagination<Role> page);

    public Role getRole(String uuid);

    public List<String> getResources(String roleId);

    /**
     * 关联资源
     */
    public int linkResource(String roleId, String resources);

    /**
     * 增加
     */
    public int insertRole(Role role);

    /**
     * 修改
     */
    public void updateRole(Role role);

    /**
     * 删除
     */
    public void removeRole(String id);

    /**
     * 返回全部列表
     * @return
     */
    public List<Role> findAll();

}
