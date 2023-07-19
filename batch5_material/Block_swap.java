//block swap algorith for array rotation 
import java.util.*;
public class Main{
    public static void swap(int[] arr, int a , int b,int k){
            //basic logic of intput to convert the input in array list and also create a temp place as well so exchange of number can take palce 
            for (int i = 0; i<k;i++){
            int temp = arr[a + i];
            arr[a+i] = arr[b+i];
            arr[b+i] = temp;
            
        }
    }
  //now we want to see the arr and then sawp it with the condition like if when too input are equal
  // or any other condition... if anyone of the condition meet then code will be excuted accrodingly 
    public static void Blockswap(int[]arr,int i, int k,int n){
        if (k == 0|| k == n)
        return;
        if (k == n-k){
            swap(arr,i,n-k+i,k);
            return;
        }
        else if (k < n-k){
            swap(arr,i,n-k+i,k);
            Blockswap(arr,i,k,n-k);
        }
        else{
            swap(arr,i,k,n-k);
            Blockswap(arr,n-k+i,2*k-n,k);
        }
    }
  // int[]arr is the input we are giving and n = is the length and k is the indexing you want to start with 
     public static void main(String args[]){
        int[] arr = {1,2,3,5,2,12,3,4};
        int n = 8;
        int k =3;
        Blockswap(arr,0,k,n);
        System.out.println("After Rotating the array ");
        for(int i = 0; i <n; i++)
        System.out.print(arr[i]+ " ");
        }
}
