package gugudan;

import java.util.Scanner;

public class GuGuMain {

	public static void main(String[] args) {
		// JAVA는 프로그램 실행시 무조건 Main 메서드부터 시작
		
		// 구구단 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// 2 x 5 = 10
		// 2 x 6 = 12
		// 2 x 7 = 14
		// 2 x 8 = 16
		// 2 x 9 = 18
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		
		// 1. 사용자에게 단수를 입력 받는 부분
		// 2. 구구단을 출력하는 부분
		
		
		//객체 자료형 : 객체자료형 첫문자는 대문자
		//1.객체 생성 
		Scanner sc = new Scanner(System.in);
		// 입력 받는 기능이 필요할 때 : Scanner 
		
		System.out.print("단수>> ");
		// 2.인스턴스 사용
		int dansu = sc.nextInt(); 
		// 변수 단수에 
						// nextInt(); 사용자가 입력한 정수 값을 가져와라
		System.out.println("구구단 "+ dansu +"단 출력");

		// 2. 객체 생성
		GuGuPrint ggp = new GuGuPrint();
		// 2-1 GuGuprint 생성해라
		// 
		
		
		// 3.인스턴스 사용
		// guGuDan의 함수만 호출(== 분기 / 갔다가 다시 와라 )  
		ggp.guGuDan(dansu);
		
		
		
	}
	
	
}
