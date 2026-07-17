import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c =a+b;
        System.out.println("Hello World!");
        System.out.println("Sum: " + c);
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum: " + c);
                break;
            case '-':
                System.out.println("Difference: " + (a - b));
                break;
            case '*':
                System.out.println("Product: " + (a * b));
                break;
            case '/':   
                if (b != 0) {
                        System.out.println("Quotient: " + (a / b));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;  
            default:
                System.out.println("Invalid operation");
        }
    }
}