package com.klef;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController


public class ClientController {
	@GetMapping("/")
	public String home()
	{
		return "DEMO COMPLETED ";
	}
	@GetMapping("/deMo")
	public String demo()
	{
		return "Jenkins Demo0000";
	}
	@GetMapping("/test")
	public String test()
	{
		return "Deploy spring boot using jenkins(CI/CD)";
	}
	
}
