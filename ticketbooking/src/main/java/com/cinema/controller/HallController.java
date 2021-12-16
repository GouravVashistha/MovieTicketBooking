package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.entity.Hall;
import com.cinema.service.HallService;
@RestController
public class HallController {
	@Autowired
	HallService hallservce;

	@PostMapping(value = "/addhall")

	public Hall addMovie(@RequestBody Hall hall) {
		return hallservce.addHall(hall);
	}
}
