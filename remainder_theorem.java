package com.coding;

public class chinese_remiander_theroem {
   static int inv(int a ,int m){
       int m0 = m,t,q;
       int x0 = 0, x1 = 1;

       if (m==1)
           return 0;
       while (a>1){
           q = a/m; //q is quotient
           t = m;

           m = a % m;
           a = t;
           t = x0;
           x0 = x1  - q * x0;
           x1 = t;

       }
       if (x1 < 0 )
           x1 += m0;
       return x1;
   }
   static int findMinX(int num[],int rem[],int k){
       int product = 1;
       for (int i = 0; i < k ; i++)
           product *= num[i];

       int result = 0;

       for (int i = 0; i < k; i++){
           int pp = product/num[i];
           result += rem[i] * inv(pp,num[i])*pp;

       }
       return result % product;
   }
    public static void main(String args[]){
        int num[] = {3,4,5};
        int rem[] = {2,3,1};
        int k = num.length;
        System.out.println("X is " + findMinX(num,rem,k));
    }
}
