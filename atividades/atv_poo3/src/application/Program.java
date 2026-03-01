package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("Grade 1, 2 and 3: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		student.getGrade(n1, n2, n3);
		
		student.firstTri();
		
		
		sc.close();

	}

}
