package kr.co.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.tjoeun.beans.BeanData;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(BeanData bean) {
		bean.setData1("더조은학원");
		return "test1";
	}
		
}
