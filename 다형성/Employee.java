package 다형성;

abstract public class Employee {

    String name;
    int salary;

    // 자손에게 구현을 강제하기 위해서 추상 클래스를 가진다
    // 추상클래스는 자신의 인스턴스를 만들 수 없다.
    public abstract void calcSalary();
    public abstract void calcBonus();

}
