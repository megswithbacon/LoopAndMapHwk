import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMath {
    private static Scanner input2 = new Scanner(System.in);

    public static void askUserForNum(ArrayList<Integer> numbers) {

        for(int i = 0; i <=4; i++) {
            System.out.println("Please enter a number and press enter: ");
            String currentNumber = input2.nextLine();
            numbers.add(Integer.parseInt(currentNumber));
        }
        input2.close();
    }

    public static int sum(ArrayList<Integer> numbers){
        int sumTotal = 0;
        for (int num : numbers){
            sumTotal += num;
        }
        return sumTotal;
    }

    public static int product(ArrayList<Integer> numbers){
        int productTotal =1;
        for (int num : numbers){
            productTotal *= num;
        }
        return productTotal;
    }

    public static int largest(ArrayList<Integer> numbers){
        int largest = 0;
        for (int num : numbers) {
            if (largest < num) {
                largest = num;
            }
        }
        return largest;
    }

    public static int smallest(ArrayList<Integer> numbers){
        int smallestNum = numbers.get(0);
        for (int num : numbers) {
            if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return smallestNum;
    }

}
