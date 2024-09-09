import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int n = number.nextInt();

        number.close();
        
        for (int i = 1; i <= 10; i++  )
        {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
