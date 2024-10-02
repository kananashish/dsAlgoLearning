package Contest_Problems;

import java.util.Scanner;

public class calorieLimit {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); 
        
        for(int i = 0; i < t; i++){
            int n = input.nextInt(); 
            int k = input.nextInt(); 
            int[] arr = new int[n]; 
            
            for(int j = 0; j < n; j++){
                arr[j] = input.nextInt(); 
            }
            
            int calorieCount = 0; 
            int sweetsEaten = 0;  
            
            
            for(int j = 0; j < n; j++){
                if(calorieCount + arr[j] > k) {
                    break; 
                }
                calorieCount += arr[j]; 
                sweetsEaten++; 
            }
            
            
            System.out.println(sweetsEaten);
        }
        
        input.close(); 
    }
}
