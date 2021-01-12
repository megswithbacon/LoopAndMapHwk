import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMath {
    private static Scanner numInput = new Scanner(System.in);

    public static void askUserForNum(ArrayList<Double> numbers) {
        for(double i = 0; i <=4; i++) {
            System.out.println("Please enter a number and press enter: ");
            String currentNumber = numInput.nextLine();
            numbers.add(Double.parseDouble(currentNumber));
        }
    }

    public static double sum(ArrayList<Double> numbers){
        double sumTotal = 0;
        for (double num : numbers){
            sumTotal += num;
        }
        return sumTotal;
    }

    public static double product(ArrayList<Double> numbers){
        double productTotal = 1;
        for (double num : numbers){
            productTotal *= num;
        }
        return productTotal;
    }

    public static double largest(ArrayList<Double> numbers){
        double largest = 0;
        for (double num : numbers) {
            if (largest < num) {
                largest = num;
            }
        }
        return largest;
    }

    public static double smallest(ArrayList<Double> numbers){
        double smallestNum = numbers.get(0);
        for (double num : numbers) {
            if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return smallestNum;
    }
}
