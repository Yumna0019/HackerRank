import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        // Declare variables
        for (int j = 0; j < T; j++) {
            int n, i = 2;
            boolean isPrime = true;  // Assume the number is prime initially

            n = scanner.nextInt();

            // Check divisibility from 2 to n-1
            while (i <= n - 1) {
                if (n % i == 0) {
                    isPrime = false;  // If divisible, it's not a prime number
                    break;
                }
                i++;
            }

            // Print result based on isPrime flag
            if (isPrime && n > 1)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        scanner.close();
    }
}



