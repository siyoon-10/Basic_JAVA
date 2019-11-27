package problem;

import java.util.Scanner;

public class ReversePrint {
/*
 * 1. 사용자가 임의의 정수를 입력
 * 2. 사용자가 입력한 정수를 역으로 1까지 출력
 * 출력예제
 * 입력 >> 5
 * 5
 * 4
 * 3
 * 2
 * 1
 * 
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//임의로 정수 입력
		System.out.print("입력>>");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		for(int i = 1; i <= num1; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("역순으로 출력");
		
		for(int i = num1; i > 0;i--) {
		//   5           시작값: 5
		//   4           종료값: 0
		// 	 3
		//   2
		//   1	
			System.out.println(i);
		}
		
		
		
		
	}

}
