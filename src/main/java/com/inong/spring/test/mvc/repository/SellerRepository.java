package com.inong.spring.test.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.inong.spring.test.mvc.domain.Seller;

@Mapper
public interface SellerRepository {
	
	public int insertSeller(
			@Param("nickName") String nickName
			,@Param("temperature") double temperature
			,@Param("profileImage") String profileImage
			);
	
	public Seller selectLastSeller();
	public Seller selectSeller(@Param("id") Integer id);

}
