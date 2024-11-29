package ch10;

import java.util.Arrays;

public class review1class1 {

    // 숫자 정렬을 수행하는 메소드
    public void sortNumbers(int[] arr) {
        int iTmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {  // 내림차순 정렬
                    iTmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = iTmp;
                }
            }
        }
    }

    // 정렬된 숫자 출력 메소드
    public void printSortedNumbers(int[] arr) {
        System.out.print("result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

