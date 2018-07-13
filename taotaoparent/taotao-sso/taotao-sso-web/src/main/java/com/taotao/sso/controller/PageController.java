package com.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 展示登录和注册页面的Controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class PageController {

	@RequestMapping("/user/showRegister")
	public String showRegister() {
		return "register";
	}
	@RequestMapping("/user/showLogin") 
	public String showLogin() {
		return "login";
	}
}
