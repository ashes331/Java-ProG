package ch05;

public class StrngsTot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sTotStr = "10point, 23point, 33point, 45point, 55point, 67point";
		String[] arEach = sTotStr.split("Point, ");
		
		int iTotCnt = arEach.length;
		int iSumVal = 0;
		float fAverageVal = 0f;
		
		for(int i=0; i<iTotCnt; i++)
		{
			//System.out.println(i + " : " + arEach[i].replace("Point", ""));
			iSumVal += Integer.parseInt(arEach[i].replace("Point", ""));
		}
		
		fAverageVal = (float)(iSumVal) / (float)(iTotCnt);
		System.out.println("1.TotCnt :" + iTotCnt);
		System.out.println("2.SumValue :" + iSumVal);
		System.out.println("3.Average :" + fAverageVal);
		System.out.printf("4.Average : %10.2f\n" + fAverageVal);

	}

}
