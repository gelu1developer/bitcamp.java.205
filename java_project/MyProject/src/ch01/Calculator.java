package ch01;

public class Calculator { //퍼블릭클래스의 시작

		//메소드 -> 기능 (재료 -> 처리 -> 결과물 반환)
		//반환타입, 메소드이름(매개변수들) { 처리 구문 }
		
		void plus(int n1, int n2) {//더하기 //반환이 없을 때 void
		
			System.out.println(n1+n2);
		
		}
		
		void minus(int n1, int n2) { //빼기
			
			System.out.println(n1-n2);
			
		}
		
		void multi(int n1, int n2) { //곱하기
			
			System.out.println(n2*n2);
			
		}
		
		void div(int n1, int n2) { //나누기
			
			System.out.println(n1/n2);
			
		}
		
	public static void main(String[] args) { //메인메소드의 시작
		
		//인스턴스 생성 -> 클래스의 정의가 필요하다 ( 필요한 변수, 필요한 메소드)
		//참조타입 참조변수 = new 클래스이름
		
		
		Calculator cal = new Calculator(); //메모리에 정의되어있는 메소드 코드를 연산해주는 것
		
		cal.plus(10, 20);
		cal.minus(20, 10);
		cal.div(10, 3);
		cal.multi(2, 5);
		
	} //메인메소드의 끝
	​
	​​
} // 퍼블릭 클래스의 끝
