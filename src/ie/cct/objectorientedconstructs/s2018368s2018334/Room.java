package ie.cct.objectorientedconstructs.s2018368s2018334;

import java.util.HashMap;
import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {
	
	protected String Type;
	protected double Rate;
	protected int Id;
	private Map<String, Boolean>[] availability;
	protected boolean isAvailable;
	
	
	public Room(String type, double rate, int id, Map<String, Boolean>[] availability, boolean isAvailable) {
		super();
		this.Type = Type;
		this.Rate = Rate;
		this.Id = Id;
		this.availability = availability;
		this.isAvailable = isAvailable;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return Type;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
	
		System.out.println(type);
	}

	@Override
	public double getRate() {
	 
		
		return Rate;
	}

	@Override
	public void setRate(double rate) {
		
		
	}

	@Override
	public Map<String, boolean[]> getAvailability() {
		// TODO Auto-generated method stub
	
		
		
		return null;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getId() {
			
		
		return Id;
	}

	@Override
	public boolean isAvailable(String month, int day) {
		

		return false;
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

}
