package ch09;

public class review2 {

	public static void main(String[] args) {
		
	int count = 0; // 7의 배수의 개수를 셀 변수
        
    // 1부터 100까지 반복
    for (int i = 1; i <= 100; i++) {
        if (i % 7 == 0) { // 7의 배수인 경우
        	System.out.print(i + " "); // 숫자 출력
            count++; // 개수 증가
        }
    }
    System.out.println("");
    // 7의 배수의 개수 출력
    System.out.println("7의 배수의 개수: " + count );
    }
}
