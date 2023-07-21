//convert a given decimal number to its equivalent binary
public class Main{
    public static void main(String args[]){
        int n = 1023;
        int sum = 0;
        int poweroftwo = 1;
        StringBuilder binary_number = new StringBuilder();
        
        while(n>0){
            int bit = n % 2;
            sum += bit * poweroftwo;
            binary_number.insert(0,bit);
            poweroftwo *= 2;
            n /= 2;
        }
        System.out.println(sum);
        System.out.println(binary_number);
    }
}
