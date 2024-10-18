package cls06;

import java.util.Scanner;

public class GetReadLine {
	Scanner sc = new Scanner(System.in);
	
	public int GetReadLineNo()
	{
		System.out.print("Input a number between 1 and 20.");
		return Integer.parseInt(sc.nextLine());
	}
}
