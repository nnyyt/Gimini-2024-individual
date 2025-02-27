
public class Main {
	public static void main(String[] args) {
        Vehicle vehicle = Vehicle.createNewVehicle("123ABC", "Civic", "Hybrid", 2024, 35000.00);
        System.out.println("Vehicle Created: " + vehicle.getName() + " - " + vehicle.getModel() + " (" + vehicle.getYear() + ")");
    }
}
