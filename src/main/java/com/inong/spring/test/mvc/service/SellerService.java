package com.inong.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inong.spring.test.mvc.domain.Seller;
import com.inong.spring.test.mvc.repository.SellerRepository;

@Service
public class SellerService {
	@Autowired
	private SellerRepository sellerRepository;
	
	public int addSeller(
			String nickname
			,double temperature
			,String profileImage) {
		int count = sellerRepository.insertSeller(nickname, temperature,profileImage);
		return count;
	}
	
	public Seller getLastSeller() {
		Seller seller = sellerRepository.selectLastSeller();
		return seller;
	}
	
	public Seller getSeller(Integer id) {
		Seller seller = sellerRepository.selectSeller(id);
		
		return seller;
	}

}
