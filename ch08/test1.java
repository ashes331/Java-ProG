package ch08;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");

        
        int score = scanner.nextInt();
        

        if (score >= 90) 
        {
            System.out.println("A");
        } 
        else if (score >= 90)
        {
            System.out.println("B");
        } 
        else if (score >= 80)
        {
            System.out.println("C");
        } 
        else if (score >= 70) 
        {
            System.out.println("D");
        } 
        else 
        {
            System.out.println("F");
        }
		
        
        scanner.close();
        System.out.print("���α׷� ����");

	}

}
