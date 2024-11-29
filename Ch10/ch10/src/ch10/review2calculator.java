package ch10;

import java.util.Scanner;

public class review2calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		while (true) {
            double num1 = 0, num2 = 0;
            char operator = ' ';
            
            while (true) {
                System.out.print("첫 번째 숫자: ");
                String input = sc.nextLine().trim();
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("프로그램 종료.");
                    sc.close();
                    return; 
                }

                if (!input.isEmpty()) {
                    try {
                        num1 = Double.parseDouble(input); 
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 숫자 형식입니다. 다시 입력해주세요.");
                    }
                } else {
                    System.out.println("빈 값을 입력할 수 없습니다. 다시 입력해주세요.");
                }
            }

            while (true) {
                System.out.print("연산자: ");
                String input = sc.nextLine().trim(); 
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("프로그램 종료.");
                    sc.close();
                    return; 
                }

                if (!input.isEmpty() && input.length() == 1) {
                    operator = input.charAt(0);
                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        break;
                    } else {
                        System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                    }
                } else {
                    System.out.println("빈 값을 입력할 수 없습니다. 다시 입력해주세요.");
                }
            }

            while (true) {
                System.out.print("두 번째 숫자: ");
                String input = sc.nextLine().trim(); 
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("프로그램 종료.");
                    sc.close();
                    return;
                }

                if (!input.isEmpty()) {
                    try {
                        num2 = Double.parseDouble(input); 
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 숫자 형식입니다. 다시 입력해주세요.");
                    }
                } else {
                    System.out.println("빈 값을 입력할 수 없습니다. 다시 입력해주세요.");
                }
            }
            
            double result = 0;
            boolean validOperation = true;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        validOperation = false;
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                    }
                    break;
                default:
                    validOperation = false;
                    System.out.println("잘못된 연산자입니다.");
            }

            if (validOperation) {
                System.out.println("결과: " + result);
            }
        }

    }
}

