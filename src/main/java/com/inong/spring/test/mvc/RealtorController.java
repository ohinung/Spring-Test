package com.inong.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inong.spring.test.mvc.domain.Realtor;
import com.inong.spring.test.mvc.service.RealtorService;

@Controller
public class RealtorController {
	@Autowired
	private RealtorService realtorService; 
	
	@PostMapping("/mvc/realtor/create")
	public String creatRealtor(
			@RequestParam("office") String office
			,@RequestParam("address") String address
			,@RequestParam("grade") String grade
			,@RequestParam("phoneNumber") String phoneNumber) {
		
		Realtor realtor= new Realtor();
		realtor.setOffice(office);
		realtor.setAddress(address);
		realtor.setGrade(grade);
		realtor.setPhoneNumber(phoneNumber);
		
		
		int count = realtorService.addRealtor(realtor);
		
		
		
		return "/mvc/realtor/info";
	}
	
	@GetMapping("/mvc/realtor/input")
	public String RealtorInput() {
		return "/mvc/realtor/input";
	}
	
	@GetMapping("/mvc/realtor/info")
	public String RealtorInfo() {
		
		
		return "/mvc/realtor/info";
	}
	
	

}
