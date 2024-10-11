package Chap0502;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int line = 2; line <= 9; line++) {
			if (line == 6) {
                continue; 
            }
			System.out.println("<" + line + " Dan>");
			for(int i = 1; i <= 9; i++) {
				System.out.println(line + " * " + i + " = " + (line * i));
			}
		}

	}

}
