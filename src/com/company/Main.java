package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  //declare
        Scanner keyboard;

        int Testing;
        String question;
        int number;
        String again;







        do {
            keyboard = new Scanner(System.in);
            System.out.println("Welcome to the magic 8 ball what is your yes or no question?");
            question= keyboard.nextLine();
            number = (int)  (Math.random()* 100);

            if  (number>= 1 && number <=10) {
                 System.out.println("yes");
            }
            else if (number>= 13 && number <=20) {
                 System.out.println("No");
            }
            else if (number>= 24 && number <=30) {
                 System.out.println("I disagree");
            }
            else if (number>= 32 && number <=40) {
                 System.out.println("I agree");
            }
            else if (number>= 45 && number <=50) {
                System.out.println("I absolutely agree");
            }
            else if (number>=  && number <=50) {
                System.out.println("I dont agre");
            }




























    }
}
