package com.inong.spring.test.mybatis.service;

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
	
	public RealEstate getConditionedRealEstate(int area, int price) {
		RealEstate realEstate = realEstateRepository.selectConditionedRealEstate(area,price);
	}
}
