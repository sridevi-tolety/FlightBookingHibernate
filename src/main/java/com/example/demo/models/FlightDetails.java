package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FlightDetails {
	
	@Id
	@GeneratedValue
	private long flightdetailid;	
	
	
	public long getFlightdetailid() {
		return flightdetailid;
	}
	public void setFlightdetail_id(long flightdetailid) {
		this.flightdetailid = flightdetailid;
	}
	
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	private String pilot;
	private int capacity;		
	
	@Override
	public String toString() {
		return "FlightDetails [id=" + flightdetailid + ", pilot=" + pilot + ", capacity=" + capacity
				+ "]";
	}
	public FlightDetails(long id, long flightdetailid, String pilot, int capacity, Flight flight) {
		super();
		//this.id = id;
		this.flightdetailid = flightdetailid;
		this.pilot = pilot;
		this.capacity = capacity;
		//this.flight = flight;
	}
	public FlightDetails() {
		// TODO Auto-generated constructor stub
	}
	/*public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}*/
	}
