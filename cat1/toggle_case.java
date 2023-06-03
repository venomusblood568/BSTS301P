package com.coding;

public class tooglecase {
    static void togglecase(char str[]) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z')
                str[i] = (char) (str[i] + 'a' - 'A');
            else if (str[i] >= 'a' && str[i] <= 'z')
                str[i] = (char) (str[i] + 'A' - 'a');
        }
    }
    public static void main(String[] args){
        char str[] = "iAMsam".toCharArray();
        togglecase(str);
        System.out.println("string after toogle: ");
        System.out.println(String.valueOf(str));
    }
}
/*
This code is a Java program that implements a function called `togglecase` to convert the case of characters in a given string. It then demonstrates the usage of the `togglecase` function in the `main` method.

Here's an explanation of the code:

- The code begins with a package declaration `package com.coding;`, indicating that this class belongs to the `com.coding` package.
- The `togglecase` class is defined, which serves as the main class for the program.
- Inside the `togglecase` class, there is a static method named `togglecase` that takes a character array (`char[]`) named `str` as input. This method performs the case conversion logic on the characters of the array.
- Within the `togglecase` method, a `for` loop is used to iterate over each character in the `str` array.
- Inside the loop, an `if` statement checks whether the character is an uppercase letter (between 'A' and 'Z'). If it is, the character's case is toggled by adding the difference between lowercase and uppercase letters ('a' - 'A') to convert it to lowercase.
- If the character is a lowercase letter (between 'a' and 'z'), another `if` statement toggles its case by adding the difference between uppercase and lowercase letters ('A' - 'a') to convert it to uppercase.
- The `main` method is defined to demonstrate the usage of the `togglecase` function.
- Inside the `main` method, a string "iAMsam" is converted to a character array using the `toCharArray()` method and stored in the `str` array.
- The `togglecase` function is called with the `str` array as an argument, which modifies the case of the characters in the array.
- Finally, the program prints the modified string by converting the character array back to a string using `String.valueOf()` and displaying it on the console.

In summary, this code showcases a simple case conversion functionality where uppercase letters are converted to lowercase, and lowercase letters are converted to uppercase. It demonstrates the usage of this function by converting a given string and displaying the result.
*/
