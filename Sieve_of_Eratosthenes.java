package com.coding;


public class Sieve_of_Eratosthenes {
    public static void main (String[] args){
        int n = 19 ; //setting up the limit for n 
        boolean [] sieeve = new boolean[n+1]; // here i have question like should i take n or n+1 

        for (int i = 0; i < sieeve.length; i++){ // we are taking all all number in array like 0 to n and making i array
            sieeve[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n);i++){ //since 0 and 1 dont matter so we are starting to count from 2 rather than 0 or 1 and we are also using
                                               //math.sqrt mathod for reducing the time complexity of the code
            if (sieeve[i] == true){
               for (int j = (i*i); j<n;j=j+i){ //first we are taking each input as true then we are makarking as false 
                   sieeve[j] = false;
               }
            }
        }
        System.out.println("list of all the prime number: "); //here we are showing the list of all the number we got as output
        for(int i = 2; i< sieeve.length ; i++){ //and using as a loop to simply print the output
            if(sieeve[i]==true){
                System.out.println(i); 
            }

        }
    }

}
//you know we can use the i*i method as well but it will comsume more time and the aboe code is more optimiesd 
/*
The Sieve of Eratosthenes is an algorithm used for finding all the prime numbers up to a given limit. 
The algorithm works by iteratively marking as composite (i.e., not prime) the multiples of each prime, starting with the multiples of 2.

The time complexity of the Sieve of Eratosthenes algorithm is O(n log log n). This means that the time taken to execute the algorithm increases as the limit of the primes to be found increases, 
but not as fast as linearly. In other words, as the limit increases, the time taken to execute the algorithm grows more slowly than the limit itself.

The space complexity of the algorithm is O(n). This means that the amount of memory used by the algorithm grows linearly with the limit of the primes to be found. In practice, 
this means that the algorithm can use a significant amount of memory for large limits, but it is still relatively efficient in terms of space usage compared to other prime-finding algorithms.
*/
