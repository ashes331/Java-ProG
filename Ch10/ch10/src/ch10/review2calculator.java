package ch10;

import java.util.Scanner;

public class review2calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		while (true) {
            double num1 = 0, num2 = 0;
            char operator = ' ';
            
            while (true) {
                System.out.print("ù ��° ����: ");
                String input = sc.nextLine().trim();
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("���α׷� ����.");
                    sc.close();
                    return; 
                }

                if (!input.isEmpty()) {
                    try {
                        num1 = Double.parseDouble(input); 
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("�߸��� ���� �����Դϴ�. �ٽ� �Է����ּ���.");
                    }
                } else {
                    System.out.println("�� ���� �Է��� �� �����ϴ�. �ٽ� �Է����ּ���.");
                }
            }

            while (true) {
                System.out.print("������: ");
                String input = sc.nextLine().trim(); 
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("���α׷� ����.");
                    sc.close();
                    return; 
                }

                if (!input.isEmpty() && input.length() == 1) {
                    operator = input.charAt(0);
                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        break;
                    } else {
                        System.out.println("�߸��� �������Դϴ�. �ٽ� �Է����ּ���.");
                    }
                } else {
                    System.out.println("�� ���� �Է��� �� �����ϴ�. �ٽ� �Է����ּ���.");
                }
            }

            while (true) {
                System.out.print("�� ��° ����: ");
                String input = sc.nextLine().trim(); 
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("���α׷� ����.");
                    sc.close();
                    return;
                }

                if (!input.isEmpty()) {
                    try {
                        num2 = Double.parseDouble(input); 
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("�߸��� ���� �����Դϴ�. �ٽ� �Է����ּ���.");
                    }
                } else {
                    System.out.println("�� ���� �Է��� �� �����ϴ�. �ٽ� �Է����ּ���.");
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
                        System.out.println("����: 0���� ���� �� �����ϴ�.");
                    }
                    break;
                default:
                    validOperation = false;
                    System.out.println("�߸��� �������Դϴ�.");
            }

            if (validOperation) {
                System.out.println("���: " + result);
            }
        }

    }
}

