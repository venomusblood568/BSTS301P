import java.util.Scanner; //scanner import line 
public class string_palindrone{
    public static void main(String args[]){
        String str , rev = " ";
        Scanner sc = new Scanner(System.in);//scanner class 
        System.out.println("enter a string: ");//for input 
        str = sc.nextLine();
        int length = str.length(); //to check the length of the string input
        for (int i = length-1; i >= 0 ; i--)//for reversing the string
            rev = rev + str.charAt(i);//then store the reverse string 
        if(str.equals(rev)){
            System.out.println(rev) //print the reverse output 
            System.out.println(str + " is a palidrome");//result 
        }
        else{
          System.out.println(rev) //print the reverse output 
          System.out.println(str + " is not a palidrome"); //result
        }
           
    }
}
/*
sc. nextLine() where sc is the object of the Scanner class. 
example : For String "Hello World" the next() method will read only the "Hello" word. 
example : For String "Hello World" the nextLine() method will read the "Hello World" word.
*/
