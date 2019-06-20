package com.zr.demo1.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zr.demo1.service.UserService;
import com.zr.dubbo.DubboService;
import com.zr.model.User;
@RestController
public class DubboTestController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/d")
	public List<User> d() {
		return userService.findAllUsers();
	}
}
