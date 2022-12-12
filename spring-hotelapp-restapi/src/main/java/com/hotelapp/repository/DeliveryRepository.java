package com.hotelapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelapp.models.Delivery;


public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
	
	Delivery findByPartnerName(String partnerName);

}
