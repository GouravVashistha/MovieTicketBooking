package com.cinema.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Hall {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hallId;
	private String hallDesc;
	private Integer totalCapacity;

	public Integer getHallId() {
		return hallId;
	}

	public void setHallId(Integer hallId) {
		this.hallId = hallId;
	}

	public String getHallDesc() {
		return hallDesc;
	}

	public void setHallDesc(String hallDesc) {
		this.hallDesc = hallDesc;
	}

	public Integer getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(Integer totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	@OneToMany(mappedBy = "hall", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Shows> shows;

	@OneToMany(mappedBy = "halls", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<HallCapacity> hallCapacity;

//	public Hall(Integer hallId, String hallDesc, Integer totalCapacity) {
//		super();
//		HallId = hallId;
//		HallDesc = hallDesc;
//		TotalCapacity = totalCapacity;
//
//	}

}
