import java.util.*;

public class VehicleInfo {
    public static HashMap<String, String> vehicleList = new HashMap<>();
    private static Scanner carInput = new Scanner(System.in);

    public static void createVehicleHashMap() {
        vehicleList.put("Honda", "Civic");
        vehicleList.put("Mazda", "3");
        vehicleList.put("Kia", "Forte");
        vehicleList.put("Ford", "F150");
        vehicleList.put("Eagle", "Talon");
        vehicleList.put("Mitsubishi", "Eclipse");
        vehicleList.put("Toyota", "Tacoma");
        vehicleList.put("Dodge", "RAM");
    }

    public static String askUserForCarType(){
        System.out.println("Please enter the Make of the car you are looking for: ");
        String carType = carInput.nextLine();
        return carType;
    }

    public static String checkForCarType(String carType) {
        String carChoice = vehicleList.get(carType);
        return carChoice;
    }
}
