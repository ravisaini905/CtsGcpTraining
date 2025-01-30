package com.example.springCloudRunApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cloud")
public class CloudRunController {
	
	@GetMapping("/Hello")
	public String getMethodName() {
		return "Gts Training";
	}
	

}
