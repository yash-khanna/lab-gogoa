package services;

import java.time.LocalDate;

// Type your code
import model.*;

public class FareCalculator extends Booking{
	public double book(Hotel hotel) {
		double total=1d;
		int rate=hotel.getRates();
		int noOfPersons=hotel.getNoOfPersons();
		LocalDate l1=hotel.getFromdate();
		LocalDate l2=hotel.getTodate();
		String occupancy=hotel.getOccupancy();
		if(l1.isBefore(l2)==true) {
			System.out.println("hellp");
			if(noOfPersons==1) {
				System.out.println("help1");
				total=(double)noOfPersons*rate*1.5;
			}else if(noOfPersons==2) {
				System.out.println("hellp2");
				total=(double)rate*1.5;
				System.out.println(total+"hellpoo");
			}else if(noOfPersons==3) {
				System.out.println("help3");
				total=(double)noOfPersons*rate*2.5;
			}
			int a=l2.compareTo(l1);
			total=a*total;
		}
		System.out.println();
		return total;
	}
	public double book(Flight flight) {
		double total=0d;
		String type=flight.getTriptype();
		int rate=flight.getRates();
		int number=flight.getNoOfPersons();
		if(rate==0 || number==0) {return 0d;}
		if(type.equals("one-way")==true) {
			total=flight.getRates()*flight.getNoOfPersons();
		}else {
			LocalDate l1=flight.getFrom();
			LocalDate l2=flight.getTo();
			if(l1.isBefore(l2)==true) {
				total=2*flight.getRates()*flight.getNoOfPersons();
			}
		}
		return total;
	}
	
	public double book(Train train) {
		double total=1d;
		total*=train.getRates();
		total*=train.getNoOfPersons();
		return total;
	}
	
	public double book(Bus bus) {
		return bus.getNoOfPersons()*bus.getRates();
	}
}

