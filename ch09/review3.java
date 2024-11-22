package ch09;

import java.util.Scanner;

public class review3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int iTotCnt = 4; 
        int[] arrInputNo = new int[iTotCnt]; 
        
        
        System.out.println("4개의 정수: ");
        for (int i = 0; i < iTotCnt; i++) {
            arrInputNo[i] = sc.nextInt();
        }
              
        int iTmp = 0;
        for (int i = 0; i < iTotCnt; i++) {
            for (int j = i + 1; j < iTotCnt; j++) {
                if (arrInputNo[i] < arrInputNo[j]) {
                    iTmp = arrInputNo[i];
                    arrInputNo[i] = arrInputNo[j];
                    arrInputNo[j] = iTmp;
                }
            }
        }
        
        System.out.print("큰 수 부터: ");
        for (int i = 0; i < iTotCnt; i++) {
            System.out.print(arrInputNo[i] + " ");
        }
        sc.close();
    }
}