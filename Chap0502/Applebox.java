package Chap0502;

public class Applebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Totalapple = 573;
		int appleperbox = 12;
		int Totalbox = 100;
		
		int needbox = Totalapple / appleperbox + 1;
		
		int underbox = Totalbox - needbox;
		
		System.out.println("총 사과: " + Totalapple);
		System.out.println("총 박스: " + Totalbox);
		System.out.println("한 박스당 담을 수 있는 사과 개수: " + appleperbox);
		System.out.println("사과를 모두 담기 위한 박스 개수: " +  needbox);
		System.out.println("남은 박스 개수: " + underbox);

	}

}
