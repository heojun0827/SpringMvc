package kr.co.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("주소표시줄에 http://localhost:8080/GetParameter/ 이 입력되었습니다.");
		return "index";
		
		/*
		/WEB-INF/views/index.jsp 에서
		/WEB-INF/views/ 이 부분을 prefix로 설정하고
		.jsp 이 부분을 suffix 로 설정해서
		return "index" 라고만 coding 해도 전체 경로를 인식하게 함
			ㄴ servlet=context.xml 파일에서 설정함
		 */
	}
	
	@RequestMapping(value="/tjoeun", method=RequestMethod.GET)
	public String tjoeun() {
		System.out.println("주소표시줄에 http://localhost:8080/GetParameter/tjoeun 이 입력되었습니다.");
		return null;
	}
	

	@RequestMapping(value="/spring", method=RequestMethod.GET)
	public String spring() {
		System.out.println("주소표시줄에 http://localhost:8080/GetParameter/spring 이 입력되었습니다.");
		return null;
	}
	
}





