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
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		if(password.equals("12345")) {
			throw new WrongPasswordException("패스퉈드가 틀립니다.");
		}
	}
}
