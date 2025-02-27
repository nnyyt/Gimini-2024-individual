public class Customer extends Person {
    private String customerID;


    public Customer(String customerID, String name, String address, String phoneNumber,boolean hasTradeInVehicle ,TradInVehicle tradeInVehicle) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return this.customerID;
    }


    public void updateCustomerInfo(String address, String phoneNumber) {
        super.setAddress(address); 
        super.setPhoneNo(phoneNumber);;
    }

}

