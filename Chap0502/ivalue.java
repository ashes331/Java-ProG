package Chap0502;

public class ivalue {

	public static void main(String[] args) {
		int iValue1 = 5;
		int iValue2 = 8;
		System.out.println("1. iValue1 : " + iValue1);
		System.out.println("1. iValue2 : " + iValue2);
		
		System.out.println("Change Value---------------------------------");
		
		int temp = iValue1;
		iValue1 = iValue2;
		iValue2 = temp;
		System.out.println("2. iValue1 : " + iValue1);
		System.out.println("2. iValue2 : " + iValue2);
		

	}

}
