import java.util.*;

class Result {

    public static int factorial(int n) {
        int fact = 1;
        
        for (int i = 1; i <=n; i++){
            fact = fact * i;
        }
        return fact;

    }

}

public class Solution {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int result = Result.factorial(n);
        
        System.out.println(result);
        
        scanner.close();

    }
}
