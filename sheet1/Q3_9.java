/*
 (Business: check ISBN-10) An ISBN-10 (International Standard Book 
Number)consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, 
is a checksum, which is calculated from the other 9 digits using the following 
formula: 
(d1 ×1 + d2 × 2 + d3 × 3 + d4 ×4 + d5×5 +d6 × 6 + d7×7 + d8 × 8 + d9×9)%11 
If the checksum is 10, the last digit is denoted as X according to the ISBN-10 
convention. Write a program that prompts the user to enter the first 9 digits 
and displays the 10-digit ISBN (including leading zeros). Your program should 
read the input as an integer. Here are sample runs:
 */
package sheet1;

import java.util.Scanner;

public class Q3_9 {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        
        String isbn9String = s.nextLine();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char digitChar = isbn9String.charAt(i); 
            
            int d = Character.getNumericValue(digitChar); 
            
            sum += d * (i + 1);
        }

        int checksum = sum % 11;

        System.out.print("The ISBN-10 number is ");
        
        System.out.print(isbn9String); 

        if (checksum == 10) {
            System.out.println("X");
        } else {
            System.out.println(checksum);
        }
        
        s.close();
    }
}
