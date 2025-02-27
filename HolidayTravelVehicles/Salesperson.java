
public class Salesperson extends Person{
	private String salespersonID;
    private String name;
    
    public Salesperson(String salespersonID, String name, String address, String phoneNumber) {
    	super(name, address, phoneNumber);
        this.salespersonID = salespersonID;
    }
    
    public String getSalespersonID() { 
    	return this.salespersonID; 
    }
}
