package com.coding;


public class Sieve_of_Eratosthenes {
    public static void main (String[] args){
        int n = 19 ;
        boolean [] sieeve = new boolean[n+1];

        for (int i = 0; i < sieeve.length; i++){
            sieeve[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n);i++){
            if (sieeve[i] == true){
               for (int j = (i*i); j<n;j=j+i){
                   sieeve[j] = false;
               }
            }
        }
        System.out.println("list of all the prime number: ");
        for(int i = 2; i< sieeve.length ; i++){
            if(sieeve[i]==true){
                System.out.println(i);
            }

        }
    }

}
