import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int returnedDay = scn.nextInt();
        int returnedMonth = scn.nextInt();
        int returnedYear = scn.nextInt();
        int dueDay = scn.nextInt();
        int dueMonth = scn.nextInt();
        int dueYear = scn.nextInt();
                
        if(returnedYear < dueYear || (returnedYear == dueYear && returnedMonth < dueMonth) || 
            (returnedYear == dueYear && returnedMonth == dueMonth && returnedDay <= dueDay)){
            System.out.println(0);
        }else if(returnedDay != dueDay && returnedYear == dueYear && returnedMonth == dueMonth){
            System.out.println(15 * (returnedDay-dueDay));
        }else if(returnedDay != dueDay && returnedYear == dueYear && returnedMonth != dueMonth ){
            System.out.println(500*(returnedMonth-dueMonth));
        }else if(returnedDay != dueDay && returnedYear != dueYear && returnedMonth != dueMonth){
            System.out.println(10000);   
        }
        scn.close();
    }
}