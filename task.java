import java.util.Scanner;
public class task {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 0 or 1:");
        int n = sc.nextInt();
        while (n!=0){
            System.out.println("Enter your marks:");
            int marks = sc.nextInt();

            if(marks >=90){
                System.out.println("This is good");
            } 
            else if(marks >=60){
            System.out.println("This is also Good");
            }
            else if(marks >=0){
            System.out.println("This is Good as well");
            }
            else {
                System.out.println("Invalid marks entered");
            }
            System.out.println("Either press 1 to continue and 0 to discontinue"); 
            n = sc.nextInt(); 
        }
            System.out.println("You have entered 0 hence exiting the program");
        }
     
        }
    
    
