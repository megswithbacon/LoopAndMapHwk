import java.util.*;

public class VehicleInfo {
    private static HashMap<String, String> vehicleList = new HashMap<>();
    private static Scanner carInput = new Scanner(System.in);
    private static String carType;
    private static boolean containsKey;

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

    private static void checkForValidEntry(String car) {
        for (String c : vehicleList.keySet()) {
            if (vehicleList.containsKey(car)) {
                containsKey = true;
            } else {
                containsKey = false;
            }
        }
        if (containsKey) {
            System.out.println("The cars I have available are: " + car + " " + vehicleList.get(carType));
        } else {
            System.out.println("Sorry, We do not have the Model Car you are looking for!! :(");
        }
    }

    public static String askUserForCarType() {
        System.out.println("Please enter the Make of the car you are looking for: ");
        carType = carInput.nextLine();
        checkForValidEntry(carType);
        return carType;
    }
}

