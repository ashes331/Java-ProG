package ch11;

import java.util.Scanner;

public class Q7Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("���ڸ� �Է��ϼ���: ");
        
        try {
        	String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("�Է��� ���ڴ�: " + number);
        } catch (NumberFormatException e) {
            System.out.println("���� �ƴ�!!");
        } finally {
        	scanner.close();
        }
    }
}