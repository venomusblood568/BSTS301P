package com.coding;
import java.util.Scanner;
public class euler_phi {
   //return the value of eular's totient function phi(n)
    public static int phi(int n){
        int result = n; // initialize result as n 
        //check for all prime factor of n and subtract their multiples form result
        for (int p = 2; p*p <= n ; p++){
            //p is a prime factor of n 
            if(n % p == 0 ){ 
                //remove all multiples of p form n 
                while(n % p == 0){
                    n /= p;
                }
                result -= result / p;
            }
        }
        // if n has a prime factor greater than sqrt(n), then add its contribution.
        if (n > 1){
            result -= result / n;
        }
        return result;
    }
    //main method to test the program
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter theb value of n:  ");
        int n = sc.nextInt();
        int phi_n = phi(n);
        System.out.println("phi ( " + n + ") = "+ phi_n);
        sc.close();
    }
}
//close() method closes this scanner. If this scanner has not yet been closed then if its underlying readable also implements the Closeable interface then the readable's close method will be invoked. If this scanner is already closed then invoking this method will have no effect
