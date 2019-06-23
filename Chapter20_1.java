/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                         Chapter 20: Problem 1                                            *****
 *****__________________________________________________________________________________________________________*****
 *****   1. Write a program which inputs Strings from the user via a Scanner and stores them in a LinkedList.   *****
 *****   Next, sort the LinkedList using the Collections.sort and output the resulting Strings one at a time.   *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Chapter20_1 {


    public static void main(String[] args) {

        // LOCAL VARIABLE(s) declaration(s)
        Scanner input = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        // Print to the console the instruction to the user to input 10 Strings
        System.out.println("Enter 10 Strings (pressing \"Enter\" after each one): ");

        // for loop to get 10 Strings from the user, convert them to LowerCase and add them to the LinkedList
        for(int i = 0; i < 10; i++){
            System.out.print("#" + (i+1) + ": ");
            list.add(input.nextLine().toLowerCase());
        }

        // Sort the Strings in the LinkedList in alphabetical order
        Collections.sort(list);

        // Print to the console that the program is about to print all the user inputted Strings in alphabetical order
        System.out.println("\nThe 10 Strings you entered, after being alphabetically sorted: ");

        // Print to the console (one at a time) the String numbers and the user inputted Strings in alphabetical order
        for(int i = 0; i < list.size(); i++){
            System.out.println("String #" + (i+1) + " = " + list.get(i));
        }
    }
}
