import java.util.*;

public class Main {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {


        ArrayListMath.askUserForNum(numbers);
        System.out.println("Your largest number is: " + ArrayListMath.largest(numbers));
        System.out.println("Your smallest number is: " + ArrayListMath.smallest(numbers));
        System.out.println("The sum of your numbers is: " + ArrayListMath.sum(numbers));
        System.out.println("The product of your numbers is: " + ArrayListMath.product(numbers));

        VehicleInfo.createVehicleHashMap();
        VehicleInfo.askUserForCarType();

        System.out.println("The cars I have available are: " + VehicleInfo.checkForCarType("Honda"));


    }
}
