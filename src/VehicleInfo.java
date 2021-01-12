import java.util.*;

public class VehicleInfo {
    //HashMap created and used to add items when function is called
    private static HashMap<String, String> vehicleList = new HashMap<>();
    //scanner used to capture user input
    private static Scanner carInput = new Scanner(System.in);
    //captures type of Car that user inputs to check against HashMap with
    private static String carType;
    //boolean to track if item requested is in HashMap
    private static boolean containsKey;

    //creates Hashmap with info listed below inside
    public static void createVehicleHashMap() {
        vehicleList.put("Civic", "Honda");
        vehicleList.put("3", "Mazda");
        vehicleList.put("Forte", "Kia");
        vehicleList.put("F150", "Ford");
        vehicleList.put("Talon", "Eagle");
        vehicleList.put("Eclipse", "Mitsubishi");
        vehicleList.put("Tacoma", "Toyota");
        vehicleList.put("RAM", "Dodge");
    }

    //checks if what the user entered is a key in the HashMap
    //if model is in HashMap containsKey is set to true // if model is NOT in HashMap containsKey is set to false
    //if containsKey is true: print Car Make and Model available
    //if containsKey is false: print "not available" message
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

    //returns: String carType
    //asks user for car Model they are looking for
    //assigns input to carType, runs checkValidEntry() method
    public static String askUserForCarType() {
        System.out.println("Please enter the Model of the car you are looking for: ");
        carType = carInput.nextLine();
        checkForValidEntry(carType);
        return carType;
    }
}

