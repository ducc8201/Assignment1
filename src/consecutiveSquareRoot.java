//Bài 2

import java.util.Scanner;

public class consecutiveSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        double result = 0;

        for (int i = 0; i < n; i++) {
            result = Math.sqrt(m + result);
        }

        System.out.println(result);
    }
}
