package ch05;

public class Garbage0bjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "����";
		hobby = null;
		
		String kind1 = "�ڵ���";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: " + kind2);
		

	}

}
