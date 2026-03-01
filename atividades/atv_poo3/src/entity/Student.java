package entity;

public class Student {
	public String name;
	public Double n1, n2, n3;
	
	
	public void getGrade (double n1, double n2, double n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		
	}
	
	public Double finalGrade() {
		double sum = n1+n2+n3;
		return sum;
		
	} 
	
	public void firstTri() {
		if (finalGrade()>54) {
			System.out.println("FINAL GRADE = " + finalGrade());
			System.out.println("PASS.");
		} else {
			System.out.println("FINAL GRADE = " +finalGrade());
			System.out.println("FAILED.");
			System.out.println("MISSING " + (54.00-finalGrade()) + " POINTS");
		}
	}
	
	public void secondTri() {
		if(finalGrade()>60) {
			System.out.println("FINAL GRADE = " + finalGrade());
			System.out.println("PASS.");
		} else {
			System.out.println("FINAL GRADE = " +finalGrade());
			System.out.println("FAILED.");
			System.out.println("MISSING " + (60-finalGrade()) + " POINTS");
		}
	}
	
	
	
	

}
