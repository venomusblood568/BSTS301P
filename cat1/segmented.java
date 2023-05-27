package com.coding;

public class segmented {
    static void segsieve(int l, int h){
       //step 1
        boolean prime[] = new boolean[h + l];
        //step 2
        for (int p = 2; p*p <= h; p++){
            int sum = (l/p)*p;
            if(sum < 1){
                sum = sum + p;
            }
            for(int i = sum; i <= h; i += p ){
                prime[i] = true;
            }
            //step 3 print all the prime number
            for(int i = l; i <= h; i++){
                if (prime[i] == false)
                    System.out.println(i + "");
            }

        }

    }
    //input of the question for question
    public static  void main(String[] args){
        segsieve(10,30);
    }
}
