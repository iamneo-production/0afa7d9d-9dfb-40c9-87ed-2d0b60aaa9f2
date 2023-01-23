package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieBooking {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id",unique = true,nullable = false)
	private int bookingId;
	
	
	private String customerUsername;
	

	private String movieName;
	
	 
	private int noOfSeats;
	
	

	public int getBookingId() {
		return bookingId;
	}



	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}



	public String getCustomerUsername() {
		return customerUsername;
	}



	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}



	public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public int getNoOfSeats() {
		return noOfSeats;
	}



	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}



	@Override
	public String toString() {
		return "MovieBooking [bookingId=" + bookingId + ", customerUsername=" + customerUsername + ", movieName="
				+ movieName + ", noOfSeats=" + noOfSeats + "]";
	}
	
	
	
	
}
