package ch05;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];

        // �迭�� ������ ��(1~10) ����
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10) + 1; // 1���� 10������ ��
        }

        // �迭 ���
        System.out.print("�迭: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 7�� ��ġ ã��
        boolean found = false;
        System.out.print("7�� ��ġ: ");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                System.out.print((i + 1) + "��° "); // 1-based index
                found = true;
            }
        }

        if (!found) {
            System.out.println("7�� �迭�� �����ϴ�.");
        } else {
            System.out.println(); // �ٹٲ�
        }
    }
}
		
		


