package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		// Definição dos Valores Iniciais
		Double accountValue = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there a initial deposit? (y/n)? ");
		char choice = sc.next().charAt(0);
		
		if (choice == 'y' || choice == 'Y') {
			System.out.print("Enter initial deposit value: $");
			accountValue = sc.nextDouble();
		}
		
		Bank acc1 = new Bank(account, name, accountValue);
		System.out.println(acc1.toString());
		
		// Depósito e Saque
		System.out.print("Enter a deposit value: $");
		Double deposit = sc.nextDouble();
		acc1.deposit(deposit);
		System.out.println(acc1.toString());
		
		System.out.print("Enter a withdraw value: $");
		Double withdrawal = sc.nextDouble();
		acc1.withdrawal(withdrawal);
		System.out.println(acc1.toString());
		
		sc.close();
		
		
		
		
		
		

		
		sc.close();
		

	}

}
