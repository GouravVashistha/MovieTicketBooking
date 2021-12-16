package com.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.cinema.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
