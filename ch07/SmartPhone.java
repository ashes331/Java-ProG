package ch07;

public class SmartPhone extends Phone {
	
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� �����մϴ�.");
	}

}
