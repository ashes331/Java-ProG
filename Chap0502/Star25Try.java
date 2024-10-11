package Chap0502;

public class Star25Try {

	public static void main(String[] args) {
		 int maxStars = 25; // 시작 별 개수
	        int rows = 13;     // 총 높이

	        // 역삼각형 출력
	        for (int i = 0; i < rows; i++) {
	            int stars = maxStars - (i * 2); // 각 줄의 별 개수

	            // 짝수는 건너뜀
	            if (stars < 1) {
	                break; // 별이 1개 미만이 되면 종료
	            }

	            if (stars % 2 == 0) {
	                continue; // 짝수는 건너뜀
	            }

	            // 가운데 정렬을 위해 공백 출력
	            int spaces = (maxStars - stars) / 2;
	            for (int j = 0; j < spaces; j++) {
	                System.out.print(" "); // 공백 출력
	            }

	            // 별 출력
	            for (int j = 0; j < stars; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // 다음 줄로 이동
	        }
	    }
	}
	
