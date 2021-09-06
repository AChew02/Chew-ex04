package Assignment01;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Adrian Chew
 */

import java.util.Scanner;

public class Solution04 {
    /*
    print "Enter a noun: "
    'noun' = get input from user
    print "Enter a verb: "
    'verb' = get input from user
    print "Enter an adjective: "
    'adjective' = get input from user
    print "Enter an adverb: "
    'adverb' = get input from user
    print "A lazy 'noun' tried to 'verb' at the 'adjective' moon but 'adverb' tripped instead."
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = input.nextLine();

        System.out.println("Enter a verb: ");
        String verb = input.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = input.nextLine();

        System.out.printf("A lazy %s tried to %s at the %s moon but %s tripped instead.", noun, verb, adjective, adverb);
    }
}
