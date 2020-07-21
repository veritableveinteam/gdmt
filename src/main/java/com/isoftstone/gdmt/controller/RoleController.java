package com.isoftstone.gdmt.controller;

import java.util.List;
import java.util.UUID;

import com.isoftstone.gdmt.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoftstone.gdmt.model.Pagination;
import com.isoftstone.gdmt.model.Role;
import com.isoftstone.gdmt.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/getRoles")
	@ResponseBody
	public Pagination<Role> getRoles(@ModelAttribute Pagination<Role> page) {
		return this.roleService.getRoles(page);
	}

	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Role> findAll() {
		return this.roleService.findAll();
	}

	@RequestMapping(value = "/getRoles2")
	@ResponseBody
	public List<Role> getRoles() {
		return this.roleService.getRoles(new Pagination<Role>(1, 1000)).getRows();
	}

	@RequestMapping(value = "/getRole")
	@ResponseBody
	public Role getRole(@RequestParam String uuid) {
		return this.roleService.getRole(uuid);
	}

	@RequestMapping(value = "/getResources")
	@ResponseBody
	public List<String> getResources(String roleId) {
		return this.roleService.getResources(roleId);
	}

	/**
	 * 关联资源
	 *
	 */
	@RequestMapping(value = "/linkResource")
	@ResponseBody
	public int linkResource(@RequestParam String roleId, @RequestParam String resources) {
		return this.roleService.linkResource(roleId, resources);
	}


	/**
	 * 增加
	 * @param Role
	 * @return
	 */
	@RequestMapping(value = "/insert")
	@ResponseBody
	public int insertRole(@ModelAttribute Role Role) {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		Role.setRole_uuid(uuid);
		return this.roleService.insertRole(Role);
	}


	/**
	 * 修改
	 * @param Role
	 * @return
	 */
	@RequestMapping(value = "/update")
	@ResponseBody
	public Result updateRole(@ModelAttribute Role Role) {
		//return this.roleService.updateRole(Role);
		try {
			roleService.updateRole(Role);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}


	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/remove")
	@ResponseBody
	public Result removeRole(@RequestParam String id) {
		//return this.roleService.removeRole(id);
		try {
			roleService.removeRole(id);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
}