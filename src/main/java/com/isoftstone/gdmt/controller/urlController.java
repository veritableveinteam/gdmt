package com.isoftstone.gdmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoftstone.gdmt.model.url;
import com.isoftstone.gdmt.service.urlService;
import com.isoftstone.gdmt.util.PageResult;
import com.isoftstone.gdmt.util.Result;

@Controller
@RequestMapping("/url")
public class urlController {
		
		@Autowired
		private urlService resourceService;

		@RequestMapping("/findPage")
		public PageResult findPage(int page, int rows) {
			return resourceService.findPage(page, rows);
		}
		@RequestMapping("/getRes")
		@ResponseBody
		public List<url> getRes(){
			return resourceService.finAll();
		}
		
		@RequestMapping("/getOrg")
		@ResponseBody
		public url getOrg(String id) {
			return resourceService.findOne(id);
		}
		
		@RequestMapping("/insert")
		@ResponseBody
		public Result insert(url res) {
			try {
				resourceService.insert(res);
				return new Result(true, "添加成功!!");
			}catch (Exception e) {
				e.printStackTrace();
				return new Result(false, "增加失败!");
			}
		}
		@RequestMapping("/update")
		@ResponseBody
		public Result update(url res) {
			try {
				resourceService.update(res);
				return new Result(true, "修改成功!");
			} catch (Exception e) {
				e.printStackTrace();
				return new Result(false, "修改失败!");
			}
		}
		//update
		@RequestMapping("/remove")
		@ResponseBody
		public Result remove(String id) {
			try {
				resourceService.remove(id);
				return new Result(true, "删除成功!");
			}catch (Exception e) {
				e.printStackTrace();
				return new Result(false, "删除失败!");
			}
		}
		
}
