package ch09;

public class review2 {

	public static void main(String[] args) {
		
	int count = 0; // 7�� ����� ������ �� ����
        
    // 1���� 100���� �ݺ�
    for (int i = 1; i <= 100; i++) {
        if (i % 7 == 0) { // 7�� ����� ���
        	System.out.print(i + " "); // ���� ���
            count++; // ���� ����
        }
    }
    System.out.println("");
    // 7�� ����� ���� ���
    System.out.println("7�� ����� ����: " + count );
    }
}
