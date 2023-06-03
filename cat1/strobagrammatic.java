import java.util.*;

public class strobagrammatic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check = ");
        String n = sc.nextLine();
        System.out.println("Is " + n + " is Strobogrammatic? ");
        System.out.println(is_Strobogrammatic(n));
    }

    public static boolean is_Strobogrammatic(String n) {
        if (n == null || n.length() == 0) {
            return true;
        }
        HashMap < Character, Character > map = new HashMap < Character, Character > ();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        int left = 0;
        int right = n.length() - 1;
        while (left <= right) {
            if (!map.containsKey(n.charAt(right)) || n.charAt(left) != map.get(n.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*
breakdown of the code:

The code starts with importing the necessary classes from the java.util package.
The strobogrammatic class is defined, which serves as the main class for the program.
Inside the main method, the code prompts the user to enter a number and reads it using a Scanner object named sc.
The code then calls the is_Strobogrammatic method and passes the entered number as an argument.
The result of the is_Strobogrammatic method is printed to the console, indicating whether the number is strobogrammatic or not.
The is_Strobogrammatic method takes a string n as input and returns a boolean value. Here's how it works:

First, it checks if the input string n is null or has a length of 0. If so, it immediately returns true as an empty string or null is considered strobogrammatic.
The method then creates a HashMap called map to store the strobogrammatic mappings. For example, '0' maps to '0', '1' maps to '1', '8' maps to '8', '6' maps to '9', and '9' maps to '6'.
Two pointers, left and right, are initialized to the start and end of the input string, respectively.
The method enters a loop that continues until the left pointer is less than or equal to the right pointer.
Inside the loop, it checks two conditions:
If the character at the right pointer is not present in the map or if the character at the left pointer is not equal to the mapped value of the character at the right pointer,
it means the number is not strobogrammatic. In this case, the method returns false.
If the conditions above are not met, the left and right pointers are updated by incrementing the left pointer and decrementing the right pointer.
If the loop completes without returning false, it means the number is strobogrammatic, and the method returns true.
Overall, this code efficiently determines whether a given number is strobogrammatic by checking the mappings of each pair of corresponding characters from the start and end of the number.
*/
