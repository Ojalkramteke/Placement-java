import java.util.Scanner;

public class factorialfunc {

    public static void factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of the number is: " + factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        factorial(n);

        sc.close();
    }
}