package ch08;


public class test2one {
	static int[] arrTempVAL;
	static int iCnt = 0;

	public static void main(String[] args) {
		 int[] numbers = new int[10];
	        
	        int count = 0;
	        
	        
	        while (count < 10) {
	            
	            int number = (int)(Math.random() * 100) + 1;
	            
	            
	            if (!contains(numbers, number)) {
	                numbers[count] = number;  
	                count++;
	            }
	        }

	        
	        int minValue = findMin(numbers);  
	        int maxValue = findMax(numbers);  

	       
	        System.out.println("�ּҰ�: " + minValue);
	        System.out.println("�ִ밪: " + maxValue);
	    }

	  
	    private static boolean contains(int[] numbers, int number) {
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == number) {
	                return true; 
	            }
	        }
	        return false; 
	    }

	    
	    private static int findMin(int[] numbers) {
	        int min = numbers[0];
	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	        }
	        return min;
	    }

	    // �迭���� �ִ밪�� ���ϴ� �޼ҵ�
	    private static int findMax(int[] numbers) {
	        int max = numbers[0];
	        for (int num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }

}
