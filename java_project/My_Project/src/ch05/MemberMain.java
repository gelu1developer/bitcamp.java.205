package ch05;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member(
				"철수", 
				"010-1234-5678",
				"음악", 4,
				"ch@gmail.com",
				"2000-10-01",
				"서울");
		
		
		//member1.name="영희";
		member1.setName("영희");
		member1.showInfo();
		System.out.println(member1.getName());
		

	}

}
