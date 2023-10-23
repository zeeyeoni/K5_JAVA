package edu.ch06;

public class Member {
	
	private String name;
	private int age;
	
	// 처음 클래스가 만들어질 때 자동으로 호출되는 것, 반환값이 없음
	// 생성자 == 클래스이름
	// 클래스가 만들어지면 무조건 한번은 실행됨
	// 생성자를 구분하는 기준은 들어오는 타입으로 판단함(변수의 이름으로 판단하지 않는다.)
	public Member() {
		System.out.println("생성자1");
	}
	//동일한 메서드에 파라미터만 다른 것 == 오버로딩
	public Member(String name) {
		System.out.println("생성자2");
	}
	public Member(int age) {
		System.out.println("생성자3");
	}
	
	public Member(String name, int age) {
		System.out.println("생성자4");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Member m = new Member();
		Member m1 = new Member("호잇");
		Member m2 = new Member(10);
		Member m3 = new Member("호잇", 7);
	}
	
}
