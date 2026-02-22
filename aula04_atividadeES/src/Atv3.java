import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt(), num4 = sc.nextInt(); 
		int diff = ((num1*num2)-(num3*num4));
		
		System.out.println("DIFERENCA = " + diff);
		
		sc.close();
		
	}

}
