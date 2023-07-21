//Let's say we have the decimal number 143, which in binary is 10001111. The two nibbles are 1000 (upper nibble) and 1111 (lower nibble).
//If we swap the nibbles, the binary representation would become 11111000, which is the decimal number 248.
public class main{
    //swap logic
    static int swapnibbles(int x){
        return((x & 0x0F)<<4|(x&0xF0)>>4);
    }
    
    public static void main(String[] args){
        int number = 123; //input number
        int swappednumber = swapnibbles(number); //number sawpped is assigned
        System.out.println("origital number: "+number);
        System.out.println("number after swapping nibbles: " + swappednumber);
    }
}
