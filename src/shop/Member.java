package shop;


public class Member {

	//회원가입
	                       // 매개변수 (parameter,
	public String memInsert(String id, String pw, String name) {
		System.out.println(id + "," + pw + "," + name + "로 회원가입 성공");
		String status = "success";
		
		return status;
		
		// return 사용시 주의사항
		// 1. 데이터반환타입이랑 같아야함
		// 2. 호출한 변수의 자료형이 같아야함
	}
	
	
	//회원수정
	public void memUpdate() {
		
	}
	
	//회원탈퇴
	public void memDelete(String id,String pw) {
		
	}



}
