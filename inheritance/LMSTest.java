package inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("지연");
		e.setAge(10);
		e.setDept("입학처");
		
		p.setName("푸름");
		p.setAge(20);
		p.setSubject("자바");
		
		s.setName("유빈");
		s.setAge(30);
		s.setMajor("컴공");
		
		// toString은 자기 클래스의 toStirng이 호출됨
		// 만약 자손의 클래스에 toString이 존재하지 않는다면 조상의 toString이 자동으로 호출됨
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
