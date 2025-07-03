import java.util.Scanner;
// This program reverses a given string and checks if it is a palindrome.
public class RiverseStr {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        // Reverse the string
        for(int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
        // if(str.equals(rev)) {
        //     System.out.println(str + " is a palindrome.");
        // } else {
        //     System.out.println(str + " is not a palindrome.");
        // }
        sc.close();
    }
}
