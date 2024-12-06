package ch11;

import java.util.Scanner;

public class Q7Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        
        try {
        	String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("입력한 숫자는: " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자 아님!!");
        } finally {
        	scanner.close();
        }
    }
}