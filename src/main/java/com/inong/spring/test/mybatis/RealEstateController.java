package com.inong.spring.test.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inong.spring.test.mybatis.domain.RealEstate;
import com.inong.spring.test.mybatis.service.RealEstateService;

@Controller
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/mybatis/real-estate/select/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateService.getRealEstate(id);
		return realEstate;
		
		
	}
	
	@RequestMapping("/mybatis/real-estate/select/2")
	public RealEstate conditionedRealEstate(@RequestParam("area") int area, @RequestParam("price") int price) {
		
		RealEstate realEstate = realEstateService.getConditionedRealEstate(area,price);
	}
	
		

}
