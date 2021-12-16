package com.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.cinema.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
