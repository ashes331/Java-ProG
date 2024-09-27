package ch04;

import java.util.Random;
import java.util.Scanner;

public class onetotenbingWhiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = random.nextInt(10) + 1; 
        int chances = 3; 
        
        for (int i = 0; i < chances; i++) {
            System.out.print("숫자를 입력하세요: ");
            int userInput = scanner.nextInt();

            if (userInput < randomNum) {
                System.out.println("up!");
            } else if (userInput > randomNum) {
                System.out.println("down!");
            } else {
                System.out.println("bingo!");
                break; 
            }            
        } 
	}
}
