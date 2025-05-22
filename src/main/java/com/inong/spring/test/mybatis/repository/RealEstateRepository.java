package com.inong.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.inong.spring.test.mybatis.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
	
	public RealEstate selectRealEstate(@Param("id") int id);
	
	
	public List<RealEstate> selectRealEstateByRentPrice(@Param("rentPrice") int rentPrice);
	//리턴 타입의 중요성!!!!!!!!!!!!!!!!!
	public List<RealEstate> selectRealEstateByAreaAndPrice(@Param("area") int area, @Param("price") int price);
	
	public int insertRealEstate(RealEstate realEstate);
	
	public int insertRealEstateByParameter(@Param("realtorId") int realtorId
												,@Param("address")String address
												,@Param("area")int area
												,@Param("type")String type
												,@Param("price")int price
												,@Param("rentPrice")int rentPrice);
	
	
}

