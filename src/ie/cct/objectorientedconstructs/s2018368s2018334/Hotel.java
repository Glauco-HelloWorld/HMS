package ie.cct.objectorientedconstructs.s2018368s2018334;

import java.util.List;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Hotel implements HotelInterface {
	
	
	protected String Single;
	protected String Double;
	protected String Penthouse;
	protected String Name = "Mespil";
	protected boolean checkAvailability;
	protected int RoomAvailable;
	protected boolean bookRoom;

	
	
	
	

	public String getSingle() {
		return Single;
	}

	public void setSingle(String single) {
		Single = single;
	}

	public String getDouble() {
		return Double;
	}

	public void setDouble(String d) {
		Double = d;
	}

	public String getPenthouse() {
		return Penthouse;
	}

	public void setPenthouse(String penthouse) {
		Penthouse = penthouse;
	}

	@Override
	public List<RoomInterface> getRooms() {
		// TODO Auto-generated method stub
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
		return checkAvailability;
	}

	@Override
	public int getRoomAvailable(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		
		
		return RoomAvailable;
	}

	@Override
	public int getNumberOfRooms() {
		// TODO Auto-generated method stub\
	  
        return RoomAvailable;
	}

	@Override
	public boolean bookRoom(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
	System.out.println("This Room " + type + " was booked for " + lengthOfStay + " days on " + day + " of " + month );
		
		return bookRoom;
	}

}
