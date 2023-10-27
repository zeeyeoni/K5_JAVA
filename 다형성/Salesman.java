package 다형성;

public class Salesman extends Employee {

    // salesman은 Employee, Salesman, Object 세 가지의 형태로 만들 수 있다.

    int annual_sales;
    public void calcSalary() {
        System.out.println("Salesman 급여 = 기본급 + 판매수당");
    }

    public void calcBonus() {
        System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
    }

}
