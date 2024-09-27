package ch04;

import java.util.Scanner;

public class vauleprintln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input Integet value : ");
        int iFstVal = scanner.nextInt();

    
        System.out.print("Input Integet value : ");
        int iSecval = scanner.nextInt();

        System.out.println("Input iFstVal = " + iFstVal);
        System.out.println("Input iFstVal = " + iSecval);
        
        if(iFstVal < iFstVal)
        {
        	int iTempVal = iFstVal;
        	iFstVal = iSecval;
        	iSecval = iTempVal;
        }
        
        System.out.println("Output iFstVal = " + iFstVal);
        System.out.println("Output iFstVal = " + iFstVal);

    
    }
}
