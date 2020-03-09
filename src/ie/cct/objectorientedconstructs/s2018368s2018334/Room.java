package ie.cct.objectorientedconstructs.s2018368s2018334;

import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {
	
	protected String Type;
	protected double Rate;
	protected int Id;
	protected boolean avaiability;

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
		
//		if ( Type == month) {
//	     avaiability = true;
//		System.out.println("It's available");
//		
//		
//		}else {
//		avaiability = false;
//		System.out.println("It's not available");
//		
//		}
	
		return avaiability;
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

}
