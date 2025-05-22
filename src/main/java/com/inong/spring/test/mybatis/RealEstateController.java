package com.inong.spring.test.mybatis;

import java.util.List;

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
	@ResponseBody
	public List<RealEstate> RealEstateByRentPrice(@RequestParam("rentPrice") int rentPrice) {
		
		List<RealEstate> realEstate = realEstateService.getRealEstateByRentPrice(rentPrice);
		
		return realEstate;
	}
	
	@RequestMapping("/mybatis/real-estate/select/3")
	@ResponseBody
	public List<RealEstate> RealEstateByAreaAndPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		
		List<RealEstate> realEstate = realEstateService.getRealEstateByAreaAndPrice(area,price);
		
		return realEstate;
	}
	
		

}
