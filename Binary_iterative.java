import java.io.*;
import java.util.*;

class Binary_iterative {
    int bisearch(int arr[], int x)
    {
        int l=0, r= arr.length - 1;
        while(l<=r){
            
            int m = l + (r-l)/2;
            if (arr[m] == x)
                return m;

            if (arr[m]< x)
                l=  m+1;

            else
               r = m-1;
        }
        return -1;
    }
    
public static void main (String args[]){
    Binary_iterative ob = new Binary_iterative();
     int arr[]= {11,21,22,44};
    // Arrays.sort(arr);
     int x = 22;
     int result = ob.bisearch(arr, x);
     if (result == -1)
        System.out.println("Element is not present in the given array "); 
     else
        System.out.println("Element is present in the index "+ result);

}
}
