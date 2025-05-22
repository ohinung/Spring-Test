package com.inong.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inong.spring.test.mybatis.domain.RealEstate;
import com.inong.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	
	
	
	public RealEstate getRealEstate(int id) {
		RealEstate realEstate= realEstateRepository.selectRealEstate(id);
		return realEstate;
	}
	
	public List<RealEstate> getRealEstateByRentPrice(int rentPrice) {
		List<RealEstate> realEstate = realEstateRepository.selectRealEstateByRentPrice(rentPrice);
		return realEstate;
	}
	
	public List<RealEstate> getRealEstateByAreaAndPrice(int area, int price) {
		List<RealEstate> realEstate = realEstateRepository.selectRealEstateByAreaAndPrice(area,price);
		return realEstate;
	}
}
