package com.coding;

public class set_bit {
    public static  void main(String[] args){
        int n = 5; // 5 = 0101 in binary
        int position = 1;
        int bitmask = 1 << position; //this is function and (<< means left shift)
        int new_number = bitmask | n;
        System.out.println(new_number);
    }
}
