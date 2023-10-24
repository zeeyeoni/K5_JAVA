package constructor;

public class Parent {
	
	private String name;
	
	public Parent() {
		this.name = "지연";
	}
	
	public Parent(String name) {
		this.name = name;
		System.out.println("Parent(String)");
	}
	
	
	public String getName() {
		return name;
	}
}
