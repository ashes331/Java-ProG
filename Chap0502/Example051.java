package Chap0502;

public class Example051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];

        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10) + 1; 
        }

        
        System.out.print("");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        boolean found = false;
        System.out.print("7 is ");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                System.out.print((i + 1) + " th Number. ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("7 is not here.");
        } else {
            System.out.println(); 
        }
    }
}