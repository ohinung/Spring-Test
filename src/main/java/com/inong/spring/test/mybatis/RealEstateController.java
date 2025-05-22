package com.inong.spring.test.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inong.spring.test.mybatis.domain.RealEstate;
import com.inong.spring.test.mybatis.service.RealEstateService;

@Controller
@RequestMapping("/mybatis/real-estate")
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/select/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateService.getRealEstate(id);
		return realEstate;
		
		
	}
	
	
	@RequestMapping("/select/2")
	@ResponseBody
	public List<RealEstate> RealEstateByRentPrice(@RequestParam("rentPrice") int rentPrice) {
		
		List<RealEstate> realEstate = realEstateService.getRealEstateByRentPrice(rentPrice);
		
		return realEstate;
	}
	
	@RequestMapping("/select/3")
	@ResponseBody
	public List<RealEstate> RealEstateByAreaAndPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		
		List<RealEstate> realEstate = realEstateService.getRealEstateByAreaAndPrice(area,price);
		
		return realEstate;
	}
	
	@RequestMapping("/insert/1")
	@ResponseBody
	public String createRealEstate() {
		RealEstate realEstate = new RealEstate();
		
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateService.addRealEstate(realEstate);
		
		return "실행결과 : " + count;
		
	}
	@RequestMapping("/insert/2")
	@ResponseBody
	public String createRealEstateByParameter(@RequestParam("realtorId") int realtorId) {
		
		int count = realEstateService.addRealEstateByParameter(realtorId ,"썅떼빌리버 오피스텔 814호", 45, "월세",100000,120  );
		return "실행결과 : " + count;

	}
	
		

}
