package com.example.demo.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Flight {
	
	@Id
	@GeneratedValue
	private long id;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	//@PrimaryKeyJoinColumn
	@JoinColumn(name = "flightdetailid")
	private FlightDetails fd;
	
	public FlightDetails getFd() {
		return fd;
	}
	public void setFd(FlightDetails fd) {
		this.fd = fd;
	}
	private String source;
	private String airlinesname;
	public String getAirlinesname() {
		return airlinesname;
	}
	public void setAirlinesname(String airlinesname) {
		this.airlinesname = airlinesname;
	}
	private String destination;
	
	private Date traveldate;	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date gettraveldate() {
		return traveldate;
	}
	public void settraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	
	
	
	@Override
	public String toString() {
		return "Flight [id=" + id + ", fd=" + fd + ", source=" + source + ", airlinesname=" + airlinesname
				+ ", destination=" + destination + ", traveldate=" + traveldate + "]";
	}
	public Flight(long id, String source, String airlinesname, String destination, Date traveldate, FlightDetails fd) {
		super();
		this.id = id;
		this.source = source;
		this.airlinesname = airlinesname;
		this.destination = destination;
		this.traveldate = traveldate;		
	}
	public Flight() {}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
