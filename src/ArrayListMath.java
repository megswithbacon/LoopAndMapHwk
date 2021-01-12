import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMath {
    //scanner used to capture user input
    private static Scanner numInput = new Scanner(System.in);

    //asks user to enter a number 5 times and adds each entry to ArrayList of Numbers
    public static void askUserForNum(ArrayList<Double> numbers) {
        for(double i = 0; i <=4; i++) {
            System.out.println("Please enter a number and press enter: ");
            String currentNumber = numInput.nextLine();
            numbers.add(Double.parseDouble(currentNumber));
        }
    }

    // takes ArrayList of doubles and returns SUM of all numbers
    public static double sum(ArrayList<Double> numbers){
        double sumTotal = 0;
        for (double num : numbers){
            sumTotal += num;
        }
        return sumTotal;
    }

    // takes ArrayList of doubles and returns PRODUCT of all numbers
    public static double product(ArrayList<Double> numbers){
        double productTotal = 1;
        for (double num : numbers){
            productTotal *= num;
        }
        return productTotal;
    }

    // takes ArrayList of doubles and returns LARGEST of all numbers
    public static double largest(ArrayList<Double> numbers){
        double largest = 0;
        for (double num : numbers) {
            if (largest < num) {
                largest = num;
            }
        }
        return largest;
    }

    // takes ArrayList of doubles and returns SMALLEST of all numbers
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
