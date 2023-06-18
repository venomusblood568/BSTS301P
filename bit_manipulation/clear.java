package com.coding;

public class clear_bit {
    public static void main(String[] args){
        int n = 5;
        int position = 2;
        int bitmask = 1 << position;
        int not_bitmask = ~(bitmask);
        int newnumber = not_bitmask & n;
        System.out.println(newnumber);
    }
}
