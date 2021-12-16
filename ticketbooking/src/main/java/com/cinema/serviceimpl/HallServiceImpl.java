package com.cinema.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.HallRepository;
import com.cinema.entity.Hall;
import com.cinema.service.HallService;
@Service
public class HallServiceImpl implements HallService {
@Autowired
HallRepository hallrepositary;
	@Override
	public Hall addHall(Hall hall) {
		// TODO Auto-generated method stub
		return hallrepositary.save(hall);
	}

}
