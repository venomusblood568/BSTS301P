package com.coding;
import java.util.*;
public class update_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter either 0 or 1: ");
        int update_operation = sc.nextInt();
        int n = 5;
        int position = 1;
        int bitmask = 1 << position;
        if (update_operation == 1) {
            int New_number = bitmask | n;
            System.out.println(New_number);
        } else {
            int newbitmask = ~(bitmask);
            int new_number = newbitmask;
            System.out.println(newbitmask);
        }
    }
}
