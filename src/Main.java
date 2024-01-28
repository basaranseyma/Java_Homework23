import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result = 0.0;

        System.out.print("Please enter the number n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            result += (1.0/i);
        }

        System.out.print(result);
    }
}