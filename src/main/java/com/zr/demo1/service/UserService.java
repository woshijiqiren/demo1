package com.zr.demo1.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Reference;
import com.zr.dubbo.DubboService;
import com.zr.model.User;

@Service
public class UserService {
		@Reference(version = "1.0.0",check = false)
	    public DubboService dubboService;	
		public List<User>  findAllUsers(){
			return dubboService.A();
		};
}
