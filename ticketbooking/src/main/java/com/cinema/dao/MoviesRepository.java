package com.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.cinema.entity.Movies;

public interface MoviesRepository extends CrudRepository<Movies, Integer> {

}
