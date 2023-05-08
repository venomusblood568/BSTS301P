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
