package ch10;

import java.util.Scanner;

public class review1Oneshot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int iTotCnt = 4; 
        int[] arrInputNo = new int[iTotCnt]; 
        
        
        System.out.println("4개 정수 입력: ");
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
        
        System.out.print("결과: ");
        for (int i = 0; i < iTotCnt; i++) {
            System.out.print(arrInputNo[i] + " ");
        }
        sc.close();
    }
}

