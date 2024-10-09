import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();  

        String[] arrTemp = scan.nextLine().split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        scan.close();
        
        Collections.reverse(arr);
        
    
        for (int num : arr) {
            System.out.print(num + " ");  
        }
    }
}
