package ch10;

import java.util.Scanner;

public class review1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int iTotCnt = 4;
        int[] arrInputNo = new int[iTotCnt];
        
        System.out.println("Input 4 numbers:");
        for (int i = 0; i < iTotCnt; i++) {
            arrInputNo[i] = sc.nextInt();
        }
        
        review1class1 sorter = new review1class1();
        
        sorter.sortNumbers(arrInputNo);  
        
        sorter.printSortedNumbers(arrInputNo);  
        
        sc.close();
    }
}
