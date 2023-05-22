class main {
    // this boolean converts the input in binary respresnstation of n for checking the
    public static boolean bit_palindrone(int n){
        // rev stores the reverse bin resp of 'n'
        int rev = 0;
        // do till all the bits are reversed of n
        int k = n;

        while (k >0){
            // add the all bits of n are processed
            rev = (rev << 1 ) | (k & 1); // this is all the condition you need for checking the palindrone condtions
            k = k >> 1 ; //drop the last bits
        }
        // returns ture if reverse(n) is the same as 'n'
        return n == rev;

    }
    public static void main(String args[]){
        int n = 10;  //here n is the input for checking the conditions like 10 is bits are 1010
        if(bit_palindrone(n)){
            System.out.println(n + " is palindrone");
        }
        else{
            System.out.println(n + " is not palindrone");
        }
    }
}
