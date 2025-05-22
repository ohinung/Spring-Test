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
	//realEstate 테이블에서 인서트를 하는 기능 -> 쿼리를 사용해야한다.
	public int addRealEstate(RealEstate realEstate) {
		
		int count = realEstateRepository.insertRealEstate(realEstate);
		return count;
	}
	
	public int addRealEstateByParameter( int realtorId,String address,int area,String type,int price,int rentPrice) {
		int count= realEstateRepository.insertRealEstateByParameter( realtorId , address, area, type, price, rentPrice);
		return count;
	}
}
