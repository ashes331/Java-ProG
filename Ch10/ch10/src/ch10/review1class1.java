package ch10;

import java.util.Arrays;

public class review1class1 {

    // ���� ������ �����ϴ� �޼ҵ�
    public void sortNumbers(int[] arr) {
        int iTmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {  // �������� ����
                    iTmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = iTmp;
                }
            }
        }
    }

    // ���ĵ� ���� ��� �޼ҵ�
    public void printSortedNumbers(int[] arr) {
        System.out.print("result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

