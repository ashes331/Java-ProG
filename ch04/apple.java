package ch04;

public class apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalApples = 123; 
        int applesPerBasket = 10; 

        
        int basketsNeeded = totalApples / applesPerBasket;
        
        
        if (totalApples % applesPerBasket != 0) {
            basketsNeeded++; 
        }

        System.out.println("필요한 바구니의 개수: " + basketsNeeded);
    }
}

