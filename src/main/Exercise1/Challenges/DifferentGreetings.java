package Challenges;

import java.util.Scanner;

public class DifferentGreetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // using hashcodes modulo 5 to generate different greetings based on the name
        if (name.hashCode() % 5 == 0) {
            System.out.printf("Hello %s, nice to meet you!", name);
        }
        else if (name.hashCode() % 5 == 4) {
            System.out.printf("How's it going %s, beautiful day isn't it?", name);
        }
        else {
            System.out.printf("Good day, %s, hope you have a good one!", name);
        }
    }
}
