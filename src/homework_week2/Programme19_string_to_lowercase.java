package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19_string_to_lowercase {
    static String smallcase;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        smallcase = scanner.nextLine();
        smalllowercase();

    }

    //STATIC METHOD
    public static void smalllowercase() {
        smallcase = smallcase.toLowerCase();
        System.out.println(smallcase);
    }
}
