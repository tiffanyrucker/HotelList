package com.hotellab.demo.HotelList.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotellab.demo.HotelList.entity.Hotel;

public interface HotelsRepository extends JpaRepository<Hotel, Long >{
	
	List<Hotel>findByCity(String city);

}
