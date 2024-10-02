package Contest_Problems;

import java.util.Scanner;

public class add1Or2Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = input.nextInt(); // Read the value of N for each test case
            
            // Determine the winner based on the value of N
            if (n != 1) {
                System.out.println("BOB");
            } else {
                System.out.println("ALICE");
            }
        }
        
        input.close(); // Close the scanner
    }
}
