package problem;

public class TotalSum {

	public static void main(String[] args) {
		// 1~100 수 중에 짝수, 홀수 각각 더해서 출력하시오
		// 시작값 : 1
		// 종료값 : 100
		// 짝수누적합 : even
		// 홀수누적합 : odd
		
		int even = 0; // 덧셈 결과의 누적
		int odd = 0;
		
		
		
		for(int i = 1; i <= 100; i++) {
		
			if(i % 2 == 0) {    // System.out.println(i); 짝수출력 2,4,6,8....100
			   even = even + i ;
		   } else { 			// System.out.println(i);  홀수출력 1,3,5,7...,99
			   odd = odd + i ; 
		   }
		}   System.out.println("1~100까지 짝수총합 " + even); 
			System.out.println("1~100까지 홀수총합 " + odd);

			   
	
		
		
		
		
	}	
		

}

