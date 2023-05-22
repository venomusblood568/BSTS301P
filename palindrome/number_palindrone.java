package com.coding;

public class number_palindrone {
    public static void main(String[] args){
        int r , sum = 0 , temp ;
        int n = 453; // n is the input for the checking 
        temp = n;
        // we are using the divsion and remainder thing 
        while (n > 0 ){
            r = n%10; // we are getting the remainder 
            sum = (sum * 10) + r;
            n = n/10;
        }
        //output
        if(temp == sum){
            System.out.println(" true number is palindrone");
        }
        else{
            System.out.println(" false number is not palindrone");
        }
    }
}
