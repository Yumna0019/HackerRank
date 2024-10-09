import java.io.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }
    
    public void computeDifference() {
        int max_element = elements[0];
        int min_element = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max_element){
                max_element = elements[i];
            }
            if (elements[i] < min_element){
                min_element = elements[i];
            }
        }
        maximumDifference = max_element - min_element;
    }
} 

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}