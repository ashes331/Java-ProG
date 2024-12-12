package Play;

import java.util.Arrays;
import Pack_1.InputData;

public class Play {

	public static void main(String[] args) {
		InputData inputData = new InputData();
        int[] lottoNumbers = inputData.generateLottoNumbers();

        // 로또 번호 오름차순 정렬
        Arrays.sort(lottoNumbers);

        // 로또 번호 출력
        System.out.print("생성된 로또 번호: ");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
    }
}
