package com.coding;
    import java.util.Scanner;
    public class Eulers_Totient_Function {
       public static int gcd(int a , int b){
           int i , hcf = 0;
           for (i = 1; i<= a || i<= b; i++){
               if (a%i == 0 && b%i == 0)
                   hcf = i;

           }
           return hcf;

       }
       public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter th value :");
           int n = sc.nextInt();

           for(int i = 1; i<=n; i++){
               int x = 1;
               for (int j = 2; j<i ; j++){
                   if (gcd(j,n)==1){
                       x++;

                   }
               }
               System.out.println(x);
           }
       }

    }


