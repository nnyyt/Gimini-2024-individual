import java.util.List;
import java.util.ArrayList;

public class DealerIOption {
	private String optionCode;
    private String description;
    private double price;
    public static List<DealerIOption> optionsList = new ArrayList<>();
    
    public DealerIOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
        
    public double getPrice() { 
    	return this.price; 
    }
    
    public static void addNewDealerOption(String optionCode, String description, double price) {
        optionsList.add(new DealerIOption(optionCode, description, price));
    }
    
    public static void displayAllDealerOptions() {
        for (DealerIOption option : optionsList) {
            System.out.println("Option Code: " + option.optionCode + ", Description: " + option.description + ", Price: " + option.price);
        }
    }
}
