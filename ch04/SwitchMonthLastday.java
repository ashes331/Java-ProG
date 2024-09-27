package ch04;

public class SwitchMonthLastday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int)(Math.random()*12) +1;
		
		int Lastday;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			Lastday = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			Lastday = 30;
			break;
			
		case 2:
			Lastday = 28;
			break;
			
		default:
            Lastday = 0; 
            break;
		}
		
		System.out.println("임의로 선택된 월: " + month);
		System.out.println("해당 월의 마지막 날: " + Lastday);
	}

}
