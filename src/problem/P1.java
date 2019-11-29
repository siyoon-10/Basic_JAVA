package problem;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
	
		
		System.out.println("입력 >>");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 
		 int num2 = (num / 100);
		 int num3 = ((num/10)-(num2*10));
		 int num4 = (num % 10);
		   
		 int sum = (num2+ num3+ num4);
		 System.out.println(sum);
		  
		
				 
		
		

	}

}
