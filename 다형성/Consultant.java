package 다형성;

public class Consultant extends Employee {

    int num_project;
    public void calcSalary() {
        System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
    }

    public void calcBonus() {
        System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
    }

}
