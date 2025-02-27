
public class Vehicle {
	private String serialNumber;
	private String name;
	private String model;
	private int year;
	private double price;
	
	public Vehicle(String serialNumber, String name, String model, int year, double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
 
    }
	
	public static Vehicle createNewVehicle(String serialNumber, String name, String model, int year, double price) {
		return new Vehicle(serialNumber, name, model, year, price);
	}
	
	public String getSerialNumber() { 
		return this.serialNumber; 
		
		}
	
    public String getName() { 
    	return this.name; 
    	
    	}
    
    public String getModel() { 
    	return this.model; 
    	
    	}
    
    public int getYear() { 
    	return this.year; 
    	
    	}
    
    public double getPrice() {
    	return this.price;
    }

}
