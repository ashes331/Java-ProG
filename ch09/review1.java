package ch09;

public class review1 {

	public static void main(String[] args) {
		
		int count = 0; // 3의 배수가 아닌 숫자의 개수를 셀 변수
        
        // 1부터 100까지 반복
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) { // 3의 배수가 아닌 경우
                System.out.println(i); // 숫자 출력
                count++; // 개수 증가
            }
        }
        
        // 3의 배수가 아닌 숫자의 개수 출력
        System.out.println("3의 배수가 아닌 숫자의 개수는 " + count + "개입니다.");
    }
}
