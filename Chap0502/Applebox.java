package Chap0502;

public class Applebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Totalapple = 573;
		int appleperbox = 12;
		int Totalbox = 100;
		
		int needbox = Totalapple / appleperbox + 1;
		
		int underbox = Totalbox - needbox;
		
		System.out.println("�� ���: " + Totalapple);
		System.out.println("�� �ڽ�: " + Totalbox);
		System.out.println("�� �ڽ��� ���� �� �ִ� ��� ����: " + appleperbox);
		System.out.println("����� ��� ��� ���� �ڽ� ����: " +  needbox);
		System.out.println("���� �ڽ� ����: " + underbox);

	}

}
