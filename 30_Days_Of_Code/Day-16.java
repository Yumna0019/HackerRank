import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String S = scan.nextLine();

        try {
            int num = Integer.parseInt(S);
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        scan.close();
    }
}
