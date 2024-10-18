package cls06;

public class Calculator {
	
	void powerOn() {
		System.out.println("Àü¿øÀ» ÄÔ.");
	}
	void powerOff() {
		System.out.println("Àü¿øÀ» ²û.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y ) {
		double result = (double)x / (double)y;
		return result;
	}

}
