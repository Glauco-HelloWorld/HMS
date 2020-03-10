package ie.cct.objectorientedconstructs.s2018368s2018334;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Hotel implements HotelInterface {
	
	
	
	private String Name = "Mespil";
	private List<RoomInterface> rooms;
	


	public Hotel ( String name, List<RoomInterface> rooms) {
		
		this.Name = Name;
		this.rooms = rooms;
		
	
	}
	
	
	

	@Override
	public List<RoomInterface> getRooms() {
		// TODO Auto-generated method stub
    
		
		
		return rooms;
	}

	@Override
	public void setRooms(List<RoomInterface> rooms) {
		// TODO Auto-generated method stub

		
		this.rooms=rooms;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.Name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
	this.Name = name;
	}

	@Override
	public boolean checkAvailability(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
	
		for(RoomInterface room : rooms) {	
			
			if (room.getType().equals(type)) {
				int finalday = day + lengthOfStay;
				
				
				do {
					 if( !room.isAvailable(month, day)) {
					 
						  return false;
						  
						  
					  }
					day++;
					
				} while ( day <= finalday);
					return true;
			}			
		}

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
