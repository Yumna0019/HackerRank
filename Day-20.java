import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine().trim());

        String[] aTemp = scan.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int numberOfSwaps = 0;  

        // Bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                   int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }
    
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
        
        scan.close();
    }
}
