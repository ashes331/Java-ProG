package ch09;

import java.util.Scanner;

public class review3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int iTotCnt = 4;
        int[] arrInputNo = new int[iTotCnt];
        
        System.out.println("4개의 정수 입력:");
        for (int i = 0; i < iTotCnt; i++) {
            arrInputNo[i] = sc.nextInt();
        }
        
        review3class sorter = new review3class();
        
        sorter.Review3class(arrInputNo);
        
        sorter.printSortedNumbers(arrInputNo);
        
        sc.close();
    }
}
