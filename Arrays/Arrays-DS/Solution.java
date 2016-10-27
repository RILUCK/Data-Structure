import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		sc.nextLine();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        for(int i = n-1 ; i>=0 ; i-- ){
            System.out.print(arr[i]+" ");
      
    }
 }
}
