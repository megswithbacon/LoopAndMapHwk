import java.util.*;

public class Main{
    public static ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {
        //ask user for numbers and assign to local ArrayList
        ArrayListMath.askUserForNum(numbers);
        //print answers to internal calculation methods in ArrayListMath class
        System.out.println("Your largest number is: " + ArrayListMath.largest(numbers));
        System.out.println("Your smallest number is: " + ArrayListMath.smallest(numbers));
        System.out.println("The sum of your numbers is: " + ArrayListMath.sum(numbers));
        System.out.println("The product of your numbers is: " + ArrayListMath.product(numbers));

        //create HashMap and askUser for carType -> will check in Hashmap for car and respond to user
        VehicleInfo.createVehicleHashMap();
        VehicleInfo.askUserForCarType();

    }
}
