package Chap0502;

public class iRsltVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iValue1 = 5;
		int iValue2 = 8;
		int iValue3 = 3;
		int iRsltVal = (iValue1++) + (++iValue2) % (--iValue3) / 2 + 4;
		System.out.println(iValue1++);
		System.out.println(++iValue2);
		System.out.println(--iValue3);
		System.out.println(iRsltVal);
		

	}

}
