package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HellowController {

	@RestController
	public class HelloController {
		@RequestMapping("/")
		public String index() {
			return "Hello World! Spring boot.";
		}
	}
}
