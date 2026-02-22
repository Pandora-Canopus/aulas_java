import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		pi = (double) 3.14159;
		
		raio = sc.nextDouble();
		
		area = (double) pi*(Math.pow(raio,2));
		
		System.out.printf("A=%.4f",area);
		
		sc.close();

	}

}
