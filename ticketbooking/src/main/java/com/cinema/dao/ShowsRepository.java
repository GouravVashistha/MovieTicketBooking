package com.cinema.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cinema.entity.Shows;

public interface ShowsRepository extends CrudRepository<Shows, Integer> {

	//List<Shows> findAllById(Integer showId);

}
