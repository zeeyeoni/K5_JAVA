package edu.ch06;

public class ArmorTest {
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		
		// ex.suit1 = null; 주입하면 객체 주소값을 없애주기때문에 NullPoint
	
		suit1.setName("zee");
		suit1.setHeight(158);
		
		suit2.setName("sssong");
		suit2.setHeight(157);
		
		suit3.setName("heee");
		suit3.setHeight(155);
		
		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());

	}
}

