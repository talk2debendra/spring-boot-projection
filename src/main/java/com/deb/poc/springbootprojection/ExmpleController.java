package com.deb.poc.springbootprojection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExmpleController {

	@Autowired
	private ExampleClientService exmpleClientService;
	
	@GetMapping("/")
	public void test(){
		exmpleClientService.create();
	}
}
