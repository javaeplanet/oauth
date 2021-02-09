package com.javaeplanet.oauth.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {


	@RequestMapping("/admin/{name}")
	public String Hello(@PathVariable("name")String name) {
		return "Home Page"+name;
	}
}
