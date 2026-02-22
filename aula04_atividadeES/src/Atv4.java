import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt(), hora = sc.nextInt();
		double sal = sc.nextDouble(), saltot;
		
		saltot = hora*sal;
	
		System.out.println("NUMBER = "+ id);
		System.out.println("SALARY = U$"+ saltot);
		
		sc.close();

	}

}
