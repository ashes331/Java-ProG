package ch05;

import java.util.Scanner;

public class Bingo1to20Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        int random = (int) (Math.random() * 20) + 1;
        int user;
        int i = 0;


        while (true) {
            System.out.print("Input a number between 1 and 20. ");
            user = scanner.nextInt();
            i++;

            if (user < random) {
                System.out.println("Up!");
            } else if (user > random) {
                System.out.println("Down!");
            } else {
                System.out.println("Bingo!");
                break;
            }
         
        }
        //System.out.println("You passed the Quize, %d th try..\n", i);
         System.out.println("You passed the Quize, " + i + " th try..");

	}
}
