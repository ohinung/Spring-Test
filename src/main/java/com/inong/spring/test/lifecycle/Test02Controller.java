package com.inong.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test02Controller {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> listMapResponse() {
		
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movieMap = new HashMap<>();
		
		movieMap.put("title", "기생충");
		movieMap.put("director", "봉준호");
		movieMap.put("time", 131);
		movieMap.put("rate", 15);
		
		
		movieList.add(movieMap);
		
		movieMap = new HashMap<>();
		
		movieMap.put("title", "인생은 아름다워");
		movieMap.put("director", "로베르토 베니니");
		movieMap.put("time", 116);
		movieMap.put("rate", 0);
		
		
		movieList.add(movieMap);
		
		
		movieMap = new HashMap<>();
		
		movieMap.put("title", "인셉션");
		movieMap.put("director", "크리스토퍼 놀란");
		movieMap.put("time", 147);
		movieMap.put("rate", 12);
		
		
		movieList.add(movieMap);
		
		movieMap = new HashMap<>();
		
		movieMap.put("title", "범죄와의 전쟁");
		movieMap.put("director", "윤종빈");
		movieMap.put("time", 133);
		movieMap.put("rate", 19);
		
		
		movieList.add(movieMap);	
		
		movieMap = new HashMap<>();
		
		movieMap.put("title", "헝거게임");
		movieMap.put("director", "프란시스 로렌스");
		movieMap.put("time", 137);
		movieMap.put("rate", 15);
		
		
		movieList.add(movieMap);
		
		
		return movieList;

		
	}
	
	
	
	// 멤버변수의 이름은 고정되어 있기 때문에 이것이 더 명확한 사용법이 되겠다.
	@RequestMapping("/2")
	public List<Post> listObjectResponse() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post = new Post("안녕하세요 가입인사 드립니다.", "hugulu","안녕하세요. 가입했어요 앞으로 잘부탁드립니다.");
		
		postList.add(post);
		
		postList.add(new Post("헐 대박", "bada","오늘 목요일이었어..................."));
		postList.add(new Post("오늘 데이트 한 이야기 들려드릴게요","dulumary", ".........."));
		
		return postList;
		
	}
	
	
	@RequestMapping("/3")
	public ResponseEntity<Post> entityResponse(){
		Post post = new Post("안녕하세요 가입인사 드립니다.", "hugulu","안녕하세요. 가입했어요 앞으로 잘부탁드립니다.");
		
		ResponseEntity entity = new ResponseEntity(post,HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
	}
	
	
	

}
