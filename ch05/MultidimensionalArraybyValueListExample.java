package ch05;

public class MultidimensionalArraybyValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		System.out.println("1���� �迭 ���� (���� ��): " + scores.length);
		System.out.println("2���� �迭 ���� (1���� �л� ��): " + scores[0].length);
		System.out.println("2���� �迭 ���� (2���� �л� ��): " + scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("1���� ��� ����: " + class1Avg);
		
		
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class1Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("2���� ��� ����: " + class2Avg);
		
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("��ü �л��� ��� ����: " + totalAvg);

	}

}
