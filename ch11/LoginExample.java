package ch11;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("White", "12345");
		} catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		try {
			login("Blue", "54321");
		} catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}

	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		
		if(id.equals("Blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		if(password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
}
