package cls06;

public class Car {
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	
	
	Car() {}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
