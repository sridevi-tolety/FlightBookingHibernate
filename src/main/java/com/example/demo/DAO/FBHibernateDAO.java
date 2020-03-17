package com.example.demo.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Flight;
import com.example.demo.models.FlightDetails;

@Repository
public class FBHibernateDAO {
	
	@Autowired
	SessionFactory sf;
	
	public List<Flight> findAllFlights(){
		Session session;
		try {
			session = sf.getCurrentSession();
		}catch(HibernateException ex){}
		finally {
			session = sf.openSession();
		}				
		System.out.println("In repo :::"+session);		
		List<Flight> fls = session.createCriteria(Flight.class).list();
		return fls;
	}
	
	public Flight findFlightById(long id){
		Session session;
		try {
			session = sf.getCurrentSession();
		}catch(HibernateException ex){}
		finally {
			session = sf.openSession();
		}				
		System.out.println("In repo :::"+session);		
		Flight fls = session.get(Flight.class , id);
		return fls;
	}

	public long addFlight(Flight flight) {
		Session session;
		try {
			session = sf.getCurrentSession();
		}catch(HibernateException ex){}
		finally {
			session = sf.openSession();
		}				
		System.out.println("In repo :::"+session);		
		
		session.beginTransaction();
		long fls = (long) session.save(flight);
		session.getTransaction().commit();
		System.out.println("fls :::"+fls);
		return fls;
		
	}

	public long addFlightDetails() {
		// TODO Auto-generated method stub
		Session session;
		try {
			session = sf.getCurrentSession();
		}catch(HibernateException ex){}
		finally {
			session = sf.openSession();
		}	
		
		session.beginTransaction();
		FlightDetails fd = new FlightDetails();
		fd.setPilot("pil1");
		fd.setCapacity(100);
		Flight fl = new Flight();
		fl.setSource("src6");
		fl.setDestination("dest6");
		fl.setAirlinesname("airline6");
		fl.settraveldate(new Date());
		fl.setFd(fd);		
		long ret = (long)session.save(fl);
		session.getTransaction().commit();
		return ret;
	}

}
