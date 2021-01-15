package com.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerJenkin {
	
	
	@GetMapping("/jenkinsDemo")
	public String jenkinDemo()
	{
		try
		{
			return "test success";
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
