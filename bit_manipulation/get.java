package com.coding;

public class bit_get {
    public static  void main(String[] args){
        int n = 5; // 5 = 0101 in binary
        int position = 3;
        int bitmask = 1 << position; //this is function and (<< means left shift)

        if((bitmask & n) == 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}
