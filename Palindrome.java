// This program checks if a given number is a palindrome or not.
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rev = 0, rem;
        int actualNum;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        actualNum = num; // Store the original number for comparison later
        while(num>0){
            rem = num%10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if(actualNum == rev){
            System.out.println(actualNum + " is a palindrome.");
        } else {
            System.out.println(actualNum + " is not a palindrome.");
        }
        sc.close();
    }
}