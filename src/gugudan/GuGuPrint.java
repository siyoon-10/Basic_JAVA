package gugudan;

// 1. 클래스 만들기 (설계도면) 
public class GuGuPrint {

	public void guGuDan(int dansu) {
		// 변수 result 선언,초기화x
				int result;        
				
				for(int i = 1; i <= 9; i++) {
					result = dansu * i; // 2 x i의 값이 result에 저장(대입)
					System.out.println(dansu + " x " + i + " = " + result);
				}
				
				// return 을 만나면 끝남
				
				
	}
	
}
