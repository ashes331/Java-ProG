package ch05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Var1 = "ȫ�浿";
		String Var2 = "�O�浿";
		
		if(Var1 == Var2) {
			System.out.println("Var1��  Var2�� ������ ����");
		} else {
			System.out.println("Var1��  Var2�� ������ �ٸ�");
		}
		
		if(Var1.equals(Var2)) {
			System.out.println("Var1��  Var2�� ���ڿ��� ����");
		}

	}

}
