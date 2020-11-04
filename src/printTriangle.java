import java.util.Scanner;

public class printTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < count; k++) {
                System.out.print("*");
            }
            System.out.println();
            count += 2;
        }
    }
}
