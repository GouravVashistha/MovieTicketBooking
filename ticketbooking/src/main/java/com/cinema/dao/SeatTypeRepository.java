package com.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.cinema.entity.SeatType;

public interface SeatTypeRepository extends CrudRepository<SeatType,Integer> {

}
