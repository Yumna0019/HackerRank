import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
    
        List<String> gmailUsers = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");
            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];
            
            if(emailID.endsWith("@gmail.com")){
                gmailUsers.add(firstName);
            }
        }
        bufferedReader.close();
        Collections.sort(gmailUsers);
        for(String name: gmailUsers ){
            System.out.println(name);
        }
    }
}
