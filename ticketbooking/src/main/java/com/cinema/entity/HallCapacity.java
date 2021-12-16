package com.cinema.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Hall_Capacity_Master")
public class HallCapacity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hallCapacityId;
	@ManyToOne
	@JoinColumn(name = "hall_id")
	private Hall halls;
	@ManyToOne
	@JoinColumn(name = "seat_type_id")
	private SeatType seatType;
	private Integer SeatCount;

	public Integer getSeatCount() {
		return SeatCount;
	}

	public void setSeatCount(Integer seatCount) {
		SeatCount = seatCount;
	}

}
