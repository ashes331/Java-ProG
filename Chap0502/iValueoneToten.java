package Chap0502;

import java.util.Scanner;

public class iValueoneToten {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Insert 1 ~ 10 Value : ");
        int iValue1 = scanner.nextInt();
        System.out.print("Insert 1 ~ 10 Value : ");
        int iValue2 = scanner.nextInt();
        System.out.print("Insert 1 ~ 10 Value : ");
        int iValue3 = scanner.nextInt();
        
        if (iValue1 < 1 || iValue1 > 10 || iValue2 < 1 || iValue2 > 10 || iValue3 < 1 || iValue3 > 10) {
            return;
        
        }
        int[] values = {iValue1, iValue2, iValue3};

        java.util.Arrays.sort(values);

        System.out.println("[First]." + values[2] + ", [Second]." + values[1] + ", [Third]." + values[0]);

        scanner.close();
    }
    
}

