/*
Single File Programming Question
Ram wants to keep a profile picture on Gmail.Gmail has some restriction over the dimension of the picture that we can upload.
The minimum dimension of the picture can be L xL, where L is the length of the side of the square.
Dimension of a photo is denoted as W X H, where W - width of the photo and H - Height of the photo
When any photo is uploaded following events may occur:
1. If any of the width or height is less than L, the user is prompted to upload another one. Print "CHANGE" in this case.
2. If width and height, both are large enough and
(a) if the photo is already square then it is accepted. Print
"ACCEPTED" in this case.
(b) else user is prompted to crop it. Print "CROP" in this case.
*/

package com.coding;

import  java.util.Scanner;

public class crop_img {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the L size: ");
        int L = sc.nextInt();
        System.out.println("enter the W size: ");
        int W = sc.nextInt();
        System.out.println("enter the H size: ");
        int H = sc.nextInt();
        if(W == L && H == L){
            System.out.println("ACCEPTED");
        }
        else if(W < L || H < L){
            System.out.println("CHANGE");
        }
        else {
            System.out.println("CROP");
        }
    }
}
