package Pack_1;

import java.util.Random;

public class InputData {
	public int[] generateLottoNumbers() {
        int[] lottoNumbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < lottoNumbers.length; i++) {
            while (true) {
                int number = random.nextInt(45) + 1; // 1~45 범위
                boolean isDuplicate = false;

                // 중복 확인
                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[j] == number) {
                        isDuplicate = true;
                        break;
                    }
                }

                // 중복이 아니면 배열에 추가하고 반복 종료
                if (!isDuplicate) {
                    lottoNumbers[i] = number;
                    break;
                }
            }
        }
        return lottoNumbers;
    }
}


