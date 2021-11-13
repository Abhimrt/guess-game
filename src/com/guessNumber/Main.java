package com.guessNumber;
import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            int a = (int)(Math.random()*100);
            Scanner sc = new Scanner(System.in);
            int chk = 1 ;//to check the conditions
            int steps = 0;//to count steps
            while(true){
                System.out.println("If you want to exit type any negative no.");
                System.out.print("Enter your Assumption between 1 to 100:- ");
                int asump = sc.nextInt();

                chk=asump;

                if(chk<0)
                    break;

                if(asump==a){
                    System.out.print("\n/*****************");
                    System.out.print("You Got it :-)");
                    System.out.println("*****************/\n");
                    break;}
                else if (asump>a){
                    System.out.print("\n/*****************");
                    System.out.print("Your thinking is high");
                    System.out.println("*****************/\n");}
                else{
                    System.out.print("\n/*****************");
                    System.out.print("Your thinking is low");
                    System.out.println("*****************/\n");}

                steps++;
            }
            System.out.println("\n\n\n\nThe number is "+a);
            System.out.println("You have tried "+steps+" times");

        }
    }


