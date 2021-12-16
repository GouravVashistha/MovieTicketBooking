package com.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.cinema.entity.BookingDetails;

public interface BookingDetailsRepository extends CrudRepository<BookingDetails, Integer> {

}
