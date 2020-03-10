package ie.cct.objectorientedconstructs.s2018368s2018334;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {
	
	private String Type;
	private double Rate;
	private int Id;
	private Map<String,boolean[]> availability;
	
	
	
	public Room(String type, double rate, int id) {
		super();
		this.Type = Type;
		this.Rate = Rate;
		this.Id = Id;
		this.availability= new HashMap<String, boolean[]>();
	    createAvailability();
		
		
	}

	public void createAvailability() {
		
		availability.put("January", new boolean[31]);
		Arrays.fill(availability.get("January"), true);
		
		availability.put("February", new boolean[28]);
		Arrays.fill(availability.get("February"), true);
		
		availability.put("March", new boolean[31]);
		Arrays.fill(availability.get("March"), true);
		
		availability.put("Abril", new boolean[30]);
		Arrays.fill(availability.get("Abril"), true);
		
		availability.put("May", new boolean[31]);
		Arrays.fill(availability.get("May"), true);
		
		availability.put("June", new boolean[30]);
		Arrays.fill(availability.get("June"), true);
		
		availability.put("July", new boolean[31]);
		Arrays.fill(availability.get("July"), true);
		
		availability.put("August", new boolean[30]);
		Arrays.fill(availability.get("August"), true);
		
		availability.put("Septempber", new boolean[31]);
		Arrays.fill(availability.get("September"), true);
		
		availability.put("October", new boolean[30]);
		Arrays.fill(availability.get("October"), true);
		
		availability.put("November", new boolean[31]);
		Arrays.fill(availability.get("November"), true);
		
		availability.put("December", new boolean[31]);
		Arrays.fill(availability.get("December"), true);
		
		
	}
	
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.Type;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
	
		this.Type = Type;
	}

	@Override
	public double getRate() {
	 
		
		return this.Rate;
	}

	@Override
	public void setRate(double rate) {
		
		this.Rate = Rate;
	}

	@Override
	public Map<String, boolean[]> getAvailability() {
		// TODO Auto-generated method stub
	
		
		
		return this.availability;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub
		
		
		this.availability = availability;
		
	}

	@Override
	public int getId() {
			
		
		return this.Id;
	}

	@Override
	public boolean isAvailable(String month, int day) {
		
        boolean[] monthAvailability = availability.get(month);
        boolean dayAvailability = monthAvailability[day-1];
		
        
        
        return !dayAvailability;
		
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		
		if (isAvailable(month, day)) {
			
			this.availability.get(month)[day-1] =false;
			return true;
		}
		
		
		return false;
	}

}
