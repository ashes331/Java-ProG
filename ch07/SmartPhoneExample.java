package ch07;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("������", "����");
		
		System.out.println("��: " + myPhone.model);
		System.out.println("����: " + myPhone.color);
		
		System.out.println("�������� ����: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		myPhone.sendVoice("��~ ��, �ݰ����ϴ�.");
		myPhone.hangUp();
		
		myPhone.setwifi(true);
		myPhone.internet();

	}

}
