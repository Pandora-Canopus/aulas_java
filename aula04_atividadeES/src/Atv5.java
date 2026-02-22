import java.util.Scanner;

public class Atv5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qnt1, qnt2;
		double preco1, preco2;
		
		// Produto 1
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		// Produto 2
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		preco2 = sc.nextDouble(); 
		
		// Processo de Dados.
		System.out.println("VALOR A PAGAR: R$"+((qnt1*preco1)+(qnt2*preco2)));
		
		sc.close();
		
		

	}

}
