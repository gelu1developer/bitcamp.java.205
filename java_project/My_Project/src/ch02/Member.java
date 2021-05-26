package ch02;

// ch02.Member 다른 패키지의 Member.java 와는 다르다.
public class Member {
	
	int num; 

	public static void main(String[] args) {
		// 변수 선언
		// 데이터의 타입 식별 이름
		// 데이터 타입 -> 내가 다루어야 하는 데이터의 특징에 의해서 결정
		// 기본형 타입 8가지 -> 정수형, 실수형, bool, 문자
		
//		①String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
		String name = "손형주";
		
//		②int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
		int age = 33;   //나이
//		③double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
		double height = 172.7d; //키
		float weight = 77.3f; //몸무게   
		
//		④boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
		boolean hasBook = false; //변수명 캐멀케이스..

//		⑤이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		System.out.println("저의 이름은" + name); // String + String
		System.out.println("키는" + height + "cm 입니다."); //String + any Type -> String + String
		System.out.println("나이는" + age + "살 입니다."); //String + int + String
		System.out.println("책의 보유 여부 " + hasBook); //String + Boolean = String
		
		if(hasBook) {
			System.out.println("책 있어요 !!!!!");
		} else {
			System.out.println("책 없어요 !!!!!");
		}
		
		
	}

}
