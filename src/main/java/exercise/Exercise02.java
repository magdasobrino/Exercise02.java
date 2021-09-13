

import java.util.Scanner;

public class Exercise02 {
        public static void main(String[] args) {
            String str1;
            int rko = 0;
            Scanner keyboard = new Scanner(System.in);

            System.out.print("What is the input string? ");
            str1 = keyboard.nextLine();

            if(str1.isEmpty()) {
                System.out.print("Please enter a string: ");
                str1 = keyboard.nextLine();
            }
            rko = str1.length();
            System.out.print( str1 + " has " + rko + " characters. ");
            keyboard.close();
        }

}



