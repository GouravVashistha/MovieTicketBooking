package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.entity.Shows;
import com.cinema.exception.ShowException;
import com.cinema.service.ShowService;
@RestController
public class ShowController {
	@Autowired
	ShowService showservice;
	@PostMapping(value = "/addshow", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_XML_VALUE })
	
	public Shows addMovie(@RequestBody Shows shows) {
		return showservice.addShow(shows);
	}
	
	@GetMapping("/showById/{showId}")
	public Shows getshowById(@PathVariable Integer showId) {
	Shows show = showservice.getShowId(showId);
		if (show != null) {
			return show;
		} else {
			throw new ShowException();
		}
	}
//	public List<Shows> getShow(){
//		List<Shows> show = showservice.getShowsId();
//		return show;
//	}
	
}
