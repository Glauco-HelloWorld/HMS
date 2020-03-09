package ie.cct.objectorientedconstructs;

import java.io.IOException;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.HotelManagementSystemInterface;
import ie.cct.objectorientedconstructs.s2018368s2018334.HotelManagementSystem;



//change this to match your project package


public class SampleInteraction {
	
	public static void main(String[] args) throws IOException {
    
		// create a new hotel management system
		HotelManagementSystemInterface hm = new HotelManagementSystem();
        // build the hotel from the text file

		HotelInterface h = hm.setupHotel("mespil.txt");
        // try some bookings
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("February", 3, "Single", 10);
		h.bookRoom("February", 10, "Penthouse", 12);
		
        // see the calendar for January for single rooms
		System.out.println(hm.getCalendar("January", h));
		
		
		
		
	}
}
