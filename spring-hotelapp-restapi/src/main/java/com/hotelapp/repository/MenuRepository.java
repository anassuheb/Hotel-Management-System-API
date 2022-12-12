package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelapp.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
	
	List<Menu> findByHotelHotelName(String hotelName);

}
