import java.io.*;
import java.util.Arrays;

class Binary_recursive{
    int bsearch(int x, int arr[],int l, int r)
    {
        if (r>=l)
        {
            int mid = l+(r-l)/2; //4

            if (arr[mid]==x)
             return mid;
                    //8>3 
            if (arr[mid]>x)
             return bsearch(x, arr, l ,mid - 1); //mid+1     //2,3,5,7,8,5,9    mid = 0+3

            
         return bsearch(x, arr, mid +1 , r);


        }
    return -1 ;    
    }
 

 public static void main (String args[]){
    int arr[]= {2,3,5,17,7,8,15};
    Arrays.sort(arr);
    int r =arr.length;
    int x= 8;
    Binary_recursive ob = new Binary_recursive();
    int result = ob.bsearch(x, arr , 0 , r-1);
    if (result == -1)
        System.err.println("Element is not present in the index ");
    else
        System.out.println("Element is present in the index  " + result);

 }
}



