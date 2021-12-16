package com.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BookingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingDetailsId;
	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;
	@ManyToOne
	@JoinColumn(name = "seat_type_id")
	private SeatType seatTypeId;
	private Integer noOfSeats;

	public Integer getNoOfSeats() {
		return this.noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public SeatType getSeatTypeId() {
		return seatTypeId;
	}

	public void setSeatTypeId(SeatType seatTypeId) {
		this.seatTypeId = seatTypeId;
	}

	public Integer getBookingDetailsId() {
		return bookingDetailsId;
	}

	public void setBookingDetailsId(Integer bookingDetailsId) {
		this.bookingDetailsId = bookingDetailsId;
	}

}
