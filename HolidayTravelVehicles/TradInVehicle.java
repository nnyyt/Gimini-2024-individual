
public class TradInVehicle {
	private String serialNumber;
    private String name;
    private String model;
    private int year;
    private double tradeInValue;
 
    
    public TradInVehicle(String serialNumber, String name, String model, int year, double tradeInValue ) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.tradeInValue=tradeInValue;
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
    
    public double getTradeInValue() { 
    	return this.tradeInValue; 
    }

}
