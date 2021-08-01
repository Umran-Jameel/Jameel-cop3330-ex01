/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        String output = "Hello, ";
        output = output.concat(name + ", nice to meet you!");
        System.out.println(output);

    }
}
