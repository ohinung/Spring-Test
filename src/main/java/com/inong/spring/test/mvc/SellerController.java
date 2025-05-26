package com.inong.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inong.spring.test.mvc.domain.Seller;
import com.inong.spring.test.mvc.service.SellerService;

@Controller

public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
//	@ResponseBody
//	@RequestMapping(path="/mvc/seller/create", method=RequestMethod.GET)
	
	@PostMapping("/mvc/seller/create")
	public String createSeller(
			@RequestParam("nickname") String nickname
			,@RequestParam("temperature") double temperature
			,@RequestParam("profileImage") String profileImage) {
		
		
		int count = sellerService.addSeller(nickname, temperature,profileImage);
		
		return "redirect:/mvc/seller/info";
	}
	
	@GetMapping("/mvc/seller/input")
	public String sellerInput() {
		return "mvc/seller/input";
	}
	
	
	// 프리미티브 타입의 경우 null이 될 수 없음, null은 객체의 빈 상태를 의미함.
	@GetMapping("/mvc/seller/info")
	public String sellerInfo(@RequestParam(value = "id", required = false) Integer id, Model model) {

		Seller seller = null;
		if(id == null) {
			seller = sellerService.getLastSeller();
			model.addAttribute("seller",seller);
		}else {
			seller = sellerService.getSeller(id);
			model.addAttribute("seller",seller);
		}
		
	
		
		
		return "mvc/seller/info";
	}
	

}
