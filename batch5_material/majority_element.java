//The code uses Boyer-Moore Voting Algorithm to find the majority element (appears more than n/2 times) in an array efficiently in O(n) time and constant space.
import java.util.*;

public class majority_element {
    public static void main(String[] args){
        int a[] = {3, 1, 3, 3, 2, 3, 4, 3, 5};
        int canditate = 0;
        int count = 0;

        for(int num:a){
            if(count==0){
                canditate = num;
            }
            if(num == canditate){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for(int num: a){
            if(num == canditate){
                count++;
            }
        }
        int n = a.length/2;
        if(count>n){
            System.out.println(canditate);
        }
        else{
            System.out.println("no majority element");
        }
    }
}
