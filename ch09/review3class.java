package ch09;

public class review3class {
	public void Review3class(int[] arr) {
        int iTmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {               
                if (arr[i] < arr[j]) {
                    iTmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = iTmp;
                }
            }
        }
    }
	
	public void printSortedNumbers(int[] arr) {
        System.out.print("큰수부터: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


