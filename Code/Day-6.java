import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); 
        scan.nextLine();
        
        
        for (int i = 0; i < T; i++)
        {
            String S = scan.nextLine();
            
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();
            
            for (int j = 0; j < S.length(); j++)
            {
                if(j%2 == 0)
                {
                    evenChars.append(S.charAt(j));
                }
                else
                {
                    oddChars.append(S.charAt(j));
                }
            } 
            System.out.println(evenChars.toString() + " " + oddChars.toString());
        }
        scan.close();
    }
}
