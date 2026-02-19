import java.util.Locale;

public class Main {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Saída de Dados com Int (Inteiro)
		int y = 32;
		System.out.println(y);
		System.out.println("Bom dia!");
		
		// Saída de Dados com Float (Real)
		double x = 10.34602233;
		System.out.println();
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		
		// Concatenação de Vários Modos.
		System.out.println("Resultado = " + x + " metros.");
		System.out.printf("Resultado = %.2f metros.%n", x);
		
		// Concatenar com variáveis.
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		
	}
}
