package inheritance;

public class Student extends Person{
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ":" + major;
	}
}
