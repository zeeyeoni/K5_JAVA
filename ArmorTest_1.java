package edu.ch06;

public class ArmorTest_1 {
	
	// 인스턴스를 만들고 난 후에 호출가능하기때문
	// 방법 1. public static void dowork() 메서드에 static 붙이기
	// 방법 2. 객체 생성 후, 참조변수로 찾아가기 
	public void dowork() {
		Armor a = new Armor();
		Armor b = new Armor();
		Armor c = new Armor();
		
		a.setName("a");
		a.setHeight(100);
		
		b.setName("b");
		b.setHeight(100);
		
		c.setName("c");
		c.setHeight(100);

		System.out.println(a.getName() + " : " + a.getHeight());
		System.out.println(b.getName() + " : " + b.getHeight());
		System.out.println(c.getName() + " : " + c.getHeight());
	}

	// 클래스의 인스턴스를 만들지 않고도 실행가능
	public static void main(String[] args) {
		ArmorTest_1 at = new ArmorTest_1();
		at.dowork();
	}

}
