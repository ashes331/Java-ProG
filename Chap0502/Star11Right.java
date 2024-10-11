package Chap0502;

public class Star11Right {

	public static void main(String[] args) {
		int maxStars = 10; 

        for (int i = 0; i <= maxStars; i++)
        {
            
            for (int j = maxStars; j >= 0; j--)
            {
            	if(j <= i)
            		 System.out.print("*");
            	else
            		System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i = 0; i <= maxStars; i++) 
        {
            
            for (int j = 0; j <= maxStars; j++)
            {
            	if(j > i)
            		 System.out.print("*");
            	else
            		System.out.print(" ");
            }
            System.out.println();
        }
       
	}

}
