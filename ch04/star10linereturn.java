package ch04;

public class star10linereturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) 
		{
			for (int j = 0; j < 10 - i; j++) {
                System.out.print(" "); 
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
            
            
            // 		for(int j=10; j >= 0; j--)
            //		{
            //			if(j <= i)
            //				System.out.print("*");
            //			else
            //				System.out.print(" ");
            //		}	
            //		System.out.print("");
            
        }
	}
}
