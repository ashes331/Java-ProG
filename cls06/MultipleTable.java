package cls06;

public class MultipleTable {
	int number;

    
    public MultipleTable(int number) {
        this.number = number;
    }

    
    public void ShowMultipleTable(int num) {

        System.out.println("[ " + number + " ´Ü ]");
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        System.out.println("[ " + num + " ´Ü ]");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        System.out.println(); 
    }

}
