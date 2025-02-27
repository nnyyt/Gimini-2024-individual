import java.util.List;

public class Invoice {
	private String invoiceID;
    private Customer customer;
    private Salesperson salesperson;
    private double taxes;
    private double licenseFees;
    private List<DealerIOption> options;
    private Vehicle purchasedVehicle;
    private TradInVehicle tradeInVehicle;
    private double finalPrice;
    
    public Invoice(String invoiceID, Customer customer, Salesperson salesperson, Vehicle purchasedVehicle, TradInVehicle tradeInVehicle,List<DealerIOption> options,double finalPrice, double taxes, double licenseFees) {
    	 this.invoiceID = invoiceID;
         this.customer = customer;
         this.salesperson = salesperson;
         this.purchasedVehicle = purchasedVehicle;
         this.tradeInVehicle = tradeInVehicle; 
         this.options = options;
         this.finalPrice = finalPrice;
         this.taxes = taxes;
         this.licenseFees = licenseFees;
	 
    }
    
    public String getInvoiceID() { 
    	return this.invoiceID; 
    }
    
    public Customer getCustomer() { 
    	return this.customer; 
    
    }
    
    public Salesperson getSalesperson() { 
    	return this.salesperson; 
    }
    
    public Vehicle getPurchasedVehicle() { 
    	return this.purchasedVehicle; 
    }
    
    public TradInVehicle getTradeInVehicle() { 
    	return this.tradeInVehicle; 
    }
    
    public List<DealerIOption> getOptions() { 
    	return this.options; 
    }
    
    public double getFinalPrice() { 
    	return this.finalPrice; 
    }
    
    public double getTaxes() { 
    	return this.taxes; 
    }
    public double getLicenseFees() { 
    	return this.licenseFees; 
    }
    
    public static Invoice createInvoice(String invoiceID, Customer customer, Salesperson salesperson, Vehicle purchasedVehicle,TradInVehicle tradeInVehicle, List<DealerIOption> options,double finalPrice, double taxes, double licenseFees) {
    	return new Invoice(invoiceID, customer, salesperson, purchasedVehicle, tradeInVehicle, options, finalPrice, taxes, licenseFees);
    }
    
   
    
}
