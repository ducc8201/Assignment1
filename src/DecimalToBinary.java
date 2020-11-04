//Bài 1

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String arg[]) {
        int decimalNumber;
        String binaryNumber = "";
        int temp;

        Scanner sc = new Scanner(System.in); //Scanner object for input
        System.out.println("Please enter a decimal number:");

        decimalNumber = sc.nextInt(); // input decimalNumber

        do {
            temp = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            binaryNumber = Integer.toString(temp) + binaryNumber;

        } while (decimalNumber != 0);

        System.out.println(binaryNumber);
    }
}