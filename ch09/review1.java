package ch09;

public class review1 {

	public static void main(String[] args) {
		
		int count = 0; // 3�� ����� �ƴ� ������ ������ �� ����
        
        // 1���� 100���� �ݺ�
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) { // 3�� ����� �ƴ� ���
                System.out.println(i); // ���� ���
                count++; // ���� ����
            }
        }
        
        // 3�� ����� �ƴ� ������ ���� ���
        System.out.println("3�� ����� �ƴ� ������ ������ " + count + "���Դϴ�.");
    }
}
