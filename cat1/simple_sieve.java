package com.coding;

public class sievemain {
    public static void simple_sieve(int limit){
        boolean[] prime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++){
            prime [i] = true;
        }
        // mark all the multiple of the prime number
        for (int p = 2; p*p <= limit; p++){
            // if prime[p] is not changed, then it is prime
            if (prime[p] == true){
                //update all the mutiples of p
                for (int i = p*p; i <= limit; i+= p){
                    prime[i] = false;
                }
            }
        }
        //now for printing all prime number
        for(int p = 2; p <= limit; p++){
            if (prime[p] == true){
                System.out.println(p + " ");
            }
        }
    }

    public static void main(String args[]){
        simple_sieve(60);
    }

}
