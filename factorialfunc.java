import java.util.Scanner;
public class factorialfunc{
    public static void factoriall(int n){
int factorial=1;
    for(int i =1; i>=1;i--){
        factorial= factorial*i;
    }
    System.out.println("Factorial of the number is: " + factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factoriall(n);
}
}
    
