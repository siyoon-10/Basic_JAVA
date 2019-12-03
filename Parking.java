package problem;

public class Parking {
	int[] space = new int[5];   // 주차공간 (5대)
	// 전역변수 이므로 자바가 자동으로 0으로 초기화 시켜줌
	
	int carCnt = 0; // 현재 주차된 차량수


	// 1. 주차타워 현황
	public void viewParking() {
		System.out.println("=============");
		for(int j = 0; j < space.length;j++) {
			System.out.println("|| " + (j+1) +"층:"+ space[j] +" ||");
		}
		System.out.println("=============");
		
	}
	
	
	// 2. 주차타워 입고
	
	public void  inParking(int car) {

		if(carCnt == space.length) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ 공간이 부족합니다. 2번타워를 이용해주세요.");
			return ; // 메서드 실행종료 
					// continue; 한 클래스에서 만들 때는 코드를 하나로 쓰기 떄문에 가능하지만
			  		// 			 객체화로 바꿨기 때문에 메서드를 끝내야하기 때문에 return을 써준다
					// 			 void 는 return을 안 쓰는게 아니라, return으로 값을 안 보내겠다는 것 
		}
		
		// 반복문을 이용해 주차공간을 순회하면서 비어있는 (입고할공간)을 찾음
		for(int i = 0; i < space.length ; i++) {
			// 비어있는 공간을 찾음(값이 0이면 비어있음)
			if(space[i] == 0) {
				space[i] = car;
				carCnt += 1;
				// carCnt = carCnt +1 ;
				System.out.println("▒▒ "+ (i+1) + "층:" + car +"입고완료!");
				viewParking();
				break;
				
			} 
		} // for문에서 나오는 문
		
		
	} // EZParkingMain의 park.inParking(car);


	// 3. 주차타워 출고
	public void outParking(int car) {
			// 주차타워에 차량이 0대인 경우
			if(carCnt == 0) {
				System.out.println("주차중인 차량이 없습니다. 확인해주세요");
				return;
			}
			// 주차된 차량번호와 내가 입력한 차량번호가 같을 때 
			for(int i = 0 ;i<space.length; i++) {
				if(space[i]==car) {
					space[i] = 0; // 출고 → 공간 0
					carCnt -= 1;  // 현재주차차량 - 1 
					System.out.println("▒▒ "+(i+1) + "층" +  car + "출고완료!");
					viewParking();
					return;
					
				}
			
			}// 입력한 차량번호가 해당 주차 타워에 없음
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ 없는 차량번호 입니다. 다시 입력해주세요.");
	}
			
			
}
			
			
	
	
