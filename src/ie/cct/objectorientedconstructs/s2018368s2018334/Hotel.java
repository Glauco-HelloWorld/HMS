package ie.cct.objectorientedconstructs.s2018368s2018334;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Hotel implements HotelInterface {
	
	
	
	protected String Name = "Mespil";
	


	public Hotel ( String name) {
		
		this.Name = Name;
		//ArrayList<String> myRooms = new ArrayList<String>();
		
	
	}
	
	
	

	@Override
	public List<RoomInterface> getRooms() {
		// TODO Auto-generated method stub
		
	      Map<String, RoomInterface> myMap = new HashMap<String,RoomInterface>();
         
    
		
		
		return null;
	}

	@Override
	public void setRooms(List<RoomInterface> rooms) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
	 name = this.Name;
	}

	@Override
	public boolean checkAvailability(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		

		return false;
	}

	@Override
	public int getRoomAvailable(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	@Override
	public int getNumberOfRooms() {
		return 0;
		// TODO Auto-generated method stub\
	  
      
	}

	@Override
	public boolean bookRoom(String month, int day, String type, int lengthOfStay) {
		
		// TODO Auto-generated method stub
		
		checkAvailability (month, day, type, lengthOfStay);
		
		
	System.out.println("This Room " + type + " was booked for " + lengthOfStay + " days on " + day + " of " + month );
		
		return false;
	}

}
