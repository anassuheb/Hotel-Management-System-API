package com.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelapp.models.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
