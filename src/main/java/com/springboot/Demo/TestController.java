package com.springboot.Demo;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TestController {
	@RequestMapping("test")
	public String test(){
		return "hello!";
	}
	
	@RequestMapping("hi")
	public String test1(){
		return "helloSpringboot!";
	}
}
