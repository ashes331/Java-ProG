package cls06;

public class Car253p {
	
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		
		Car253p myCar = new Car253p();
		
		myCar.speed = 200;
		myCar.run();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simulate();
		
		Car253p myCar = new Car253p();
		
		myCar.speed = 60;
		myCar.run();

	}

}
