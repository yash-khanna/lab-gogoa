package services;


import java.time.temporal.ChronoUnit;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking{

	public double book(Hotel hotel) {
		
		Double tariff;
		int noOfPersons=hotel.getNoOfPersons();
		int rates=hotel.getRates();
		long days=ChronoUnit.DAYS.between(hotel.getFromdate(), hotel.getTodate());
		double rate=super.booking(noOfPersons, rates);
		int month=hotel.getFromdate().getMonthValue();
		
		System.out.println(month);
		System.out.println(rate);
		System.out.println(days);
		if((month>=1 && month <4) || (month>6 && month<11))
		{
		System.out.println("Inside if loop");
			tariff=(rate-(rate*(25/100.0)))*days;
			System.out.println(tariff);
		}
		else
			{
			System.out.println("Entering else part");
			tariff=(rate+(rate*(50/100.0)))*days;
		System.out.println(tariff);
			}
		return tariff;
	}

	public double book(Bus bus) {
		
		double rate=super.booking(bus.getNoOfPersons(), bus.getRates());
		return rate;
	}

	public double book(Flight flight) {
		double rate=super.booking(flight.getNoOfPersons(), flight.getRates());
		return rate;
	}

	public double book(Train train) {
		double rate=super.booking(train.getNoOfPersons(), train.getRates());
		return rate;
	}

	
}
