import java.util.Scanner;

public class Atv6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		
		// Área do Triângulo.
		System.out.println("TRIANGULO: "+((a*c)/2));
		
		// Área do Círculo.
		System.out.println("CIRCULO: "+(Math.PI*(Math.pow(c,2))));
		
		// Área do Trapézio.
		System.out.println("TRAPEZIO: "+((a+b)*c)/2);
		
		// Área do Quadrado.
		System.out.println("QUADRADO: "+((b*b)));
		
		// Área do Retângulo.
		System.out.println("RETANGULO: "+((a*b)));
		
		sc.close();
	}

}
