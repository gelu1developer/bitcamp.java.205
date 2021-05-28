package ch06;

public class StudentMain {

	public static void main(String[] args) {

//		3.main()메소드에 아래 내용을 정의해봅시다.
//		①Student 타입의 배열을 선언하고
//		요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] studentScores = new Student[10];
		
//		②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		studentScores[0] = new Student("홍길동1", 100, 10, 100);//인스턴스의 주소값이 들어간다.
		studentScores[1] = new Student("홍길동2", 80, 20, 90);
		studentScores[2] = new Student("홍길동3", 70, 30, 80);
		studentScores[3] = new Student("홍길동4", 30, 40, 70);
		studentScores[4] = new Student("홍길동5", 80, 50, 60);
		studentScores[5] = new Student("홍길동6", 90, 60, 50);
		studentScores[6] = new Student("홍길동7", 60, 70, 40);
		studentScores[7] = new Student("홍길동8", 70, 80, 30);
		studentScores[8] = new Student("홍길동9", 30, 90, 20);
		studentScores[9] = new Student("홍길동10", 60, 100, 10);
		
		
//		③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		System.out.println("이름\t\t 국어\t 영어\t 수학\t 총점\t 평균 ");
		System.out.println("=====================================================");
		for(int i=0; i<studentScores.length; i++){
			System.out.print(studentScores[i].getName());
			System.out.print("\t\t");
			System.out.print(studentScores[i].getKor());
			System.out.print("\t");
			System.out.print(studentScores[i].getEng());
			System.out.print("\t");
			System.out.print(studentScores[i].getMath());
			System.out.print("\t");
			System.out.print(studentScores[i].getSum());
			System.out.print("\t");
			System.out.println(studentScores[i].getAverage());
		}
		
	}

}
