package Ex;

import java.util.Random;

public class Righting1to10 {

	public static void main(String[] args) {
		int[] numbers = new int[10];  // 크기가 10인 배열 생성
        int count = 0;  // 배열에 넣은 숫자의 개수를 추적
        Random random = new Random();
        
        // 배열에 중복되지 않는 숫자를 채움
        while (count < 10) {
            int randomNumber = random.nextInt(10) + 1;  // 1부터 10까지의 난수 생성
            boolean exists = false;
            
            // 중복 여부를 확인
            for (int i = 0; i < count; i++) {
                if (numbers[i] == randomNumber) {
                    exists = true;  // 중복되면 true로 설정
                    break;
                }
            }
            
            // 중복되지 않은 경우에만 배열에 추가
            if (!exists) {
                numbers[count] = randomNumber;
                count++;
            }
        }

        // 생성된 난수 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();  // 줄 바꿈

        // 큰 수부터 작은 수로 정렬 (버블 정렬)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {  // 조건을 변경하여 큰 수 먼저 정렬
                    // 두 숫자를 교환
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        // 정렬된 결과 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
		