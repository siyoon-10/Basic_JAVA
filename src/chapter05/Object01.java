package chapter05;

public class Object01 {
	public static void main(String[] args) {
		// 프로그램의 메인부분
		
		// 객체 사용 3단계 : 2. 객체생성
		
		// 객체 생성 → 인스턴스(결과물) 생성
		// Cooking 타입의 변수 cook에 Cooking의 주소값을 저장 
		// stack 영역    Heap영역
		Cooking cook = new Cooking();

		
		// 객체 사용 3단계 : 3. 인스턴스(결과물) 사용
		cook.makeCake("초코");
		
	
	}
}
