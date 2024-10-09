public import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        String binaryString = Integer.toBinaryString(n);
        
        String[] onesGroups = binaryString.split("0");
        
        int maxCons1 = 0;
        for (String group : onesGroups) {
            maxCons1 = Math.max(maxCons1, group.length());
        }
        
        System.out.println(maxCons1);
    }
}
 
