package Chap0502;

public class Star25Try {

	public static void main(String[] args) {
		 int maxStars = 25; // ���� �� ����
	        int rows = 13;     // �� ����

	        // ���ﰢ�� ���
	        for (int i = 0; i < rows; i++) {
	            int stars = maxStars - (i * 2); // �� ���� �� ����

	            // ¦���� �ǳʶ�
	            if (stars < 1) {
	                break; // ���� 1�� �̸��� �Ǹ� ����
	            }

	            if (stars % 2 == 0) {
	                continue; // ¦���� �ǳʶ�
	            }

	            // ��� ������ ���� ���� ���
	            int spaces = (maxStars - stars) / 2;
	            for (int j = 0; j < spaces; j++) {
	                System.out.print(" "); // ���� ���
	            }

	            // �� ���
	            for (int j = 0; j < stars; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // ���� �ٷ� �̵�
	        }
	    }
	}
	
