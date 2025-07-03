import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long first =0 , second  = 1;
        long num, next;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        num = sc.nextInt();
        System.out.print("Fibonacci Series: "+first+", "+second);
        for(int i =2; i<=num; i++){
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        sc.close();
    }
}
