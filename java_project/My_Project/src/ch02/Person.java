package ch02;

public class Person {

// 클래스의 구성 -> 인스턴스 변수, 메소드
	
//	2.Person 클래스를 만들어 보고, 아래의 회원 정보를 저장하는 변수들을 선언해봅시다.
//	변수이름을 작성하는 규칙에 맞게 직접 변수 이름을 정의해 보세요.
	
//	①회원이름을 저장하는 변수
	String name; //생략가능
	
//	②회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
	String memberPhoneNum = "000-0000-0000";
	
//	③회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
	String perNum1 = "890620-1234567";
	Long perNum2 = 8906201234567L;

//인스턴스 변수들의 데이터를 출력하는 메소드
	void showData() {
		System.out.println("회원이름 : " + name);
		System.out.println("회원의 주민번호1 :"  + perNum1);
		System.out.println("회원의 주민번호2 :"  + perNum2);
	}
	
	public static void main(String[] args) {
		
		// Person 인스턴스 생성
		Person person = new Person();
		
		System.out.println("이름 : " + person.name);
		person.name = "손형주";
		person.showData();
	}
}
