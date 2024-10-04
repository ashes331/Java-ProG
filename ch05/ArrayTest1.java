package ch05;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];

        // 배열에 임의의 수(1~10) 저장
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10) + 1; // 1부터 10까지의 수
        }

        // 배열 출력
        System.out.print("배열: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 7의 위치 찾기
        boolean found = false;
        System.out.print("7의 위치: ");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                System.out.print((i + 1) + "번째 "); // 1-based index
                found = true;
            }
        }

        if (!found) {
            System.out.println("7은 배열에 없습니다.");
        } else {
            System.out.println(); // 줄바꿈
        }
    }
}
		
		


