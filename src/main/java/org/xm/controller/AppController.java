package org.xm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping(path = "/hello")
	public String hello() {
		return "Welcome to nGAP";
	}
}
