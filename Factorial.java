import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        num = sc.nextInt();
        if(num<0){
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            if(num == 0 || num == 1) {
                fact = 1; // Factorial of 0 and 1 is 1
            } else {
                for(int i = 2; i <= num; i++) {
                    fact *= i; // Calculate factorial
                }
            }
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();
    }
}
