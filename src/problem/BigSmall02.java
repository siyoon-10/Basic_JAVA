package problem;

import java.util.Scanner;

public class BigSmall02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호1>>");
		int num1 = sc.nextInt();
		
		System.out.print("번호2>>");
		int num2 = sc.nextInt();
		
		System.out.print("번호3>>");
		int num3 = sc.nextInt();
		
		//System.out.println(num1 + ", " + num2 + ", " + num3);
		//System.out.println(num1 + "> " + num2 + "> " + num3);
		
		int max = (num1 > num2) ? num1 : num2 ;
		int min = (num1 > num2) ? num2 : num1 ;
		// num1 > num2 > num3
		// num1 > num3 > num2
		// num2 > num1 > num3
		// num2 > num3 > num1
		// num3 > num2 > num1
		// num3 > num1 > num2
	
		
		   
		if(max > num3) {
		         
			if(num3 > min) { 
				System.out.println(max +", "+ num3 +", "+ min);
			} else {
				System.out.println(max +", "+ min +", "+ num3);
			}
			
		} else  { 
			System.out.println(num3 + ", "+ max +", "+ min);
			
		}
			
		
		int temp = 0;
		
		// num1은 항상 num2보다 큰 경우
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// num1은 항상 num3보다 큰 경우
		if(num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		//num2는 항상 num3보다 큰 경우
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
			
		}
		
		System.out.println(num1 +" > "+ num2 + " > " + num3);
		
		
		
		
	}

}
