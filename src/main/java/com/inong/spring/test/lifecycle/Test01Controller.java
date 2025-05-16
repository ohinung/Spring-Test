package com.inong.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Test01Controller {
	
	@ResponseBody
	@RequestMapping("/lifecycle/test01/1")
	public String print() {
		
		return ""
				+"<html>\n"
				+"	<head><title> test1 </title></head>\n"
				+"	<body>\n"
				+"		<h2>테스츠 프로젝트 완성</h2><br>\n"
				+"		<h4>해당 프로젝트를 통해서 문제풀이를 진행합니다.</h4>\n"
				+"	</body>"
				+ "</html>";

		
	}
	
	@ResponseBody
	@RequestMapping("/lifecycle/test01/2")
	public Map<String, Integer> score() {
		Map<String, Integer> scores= new HashMap<>();
		
		scores.put("국어", 80);
		scores.put("수학", 90);
		scores.put("영어", 85);
		return scores;
	}

}
