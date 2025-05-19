package com.inong.spring.test.lifecycle;

public class Post {
	
	//멤버변수를 정의한다.
	private String title;
	private String user;
	private String content;
	
	
	public Post(String title, String user, String content) {
		this.title = title;
		this.user = user;
		this.content = content;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "제목 : " + title + "작성자 : " + user + "내용" + content;
	}
	
	
	//getter의 규칙은 명확하다. 따라서 스프링이 자동으로 만들어준다. source 에서 gett멤버변수값을 리턴하는  기능이 필요하다. 제이슨으로 메시지 컨버터가 만들어줄때
	

	public String getTitle() {
		return title;
	}

	public String getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}
	
	

}
