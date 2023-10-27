package 다형성;

public class HRSTest {
    public static void calcTax(Employee e){
        if (e instanceof Salesman) {
            System.out.println("Salesman 입니다.");
            System.out.println(((Salesman) e).annual_sales);

        } else if (e instanceof Manager) {
            System.out.println("Manager 입니다.");
            System.out.println(((Manager)e).num_team);

        } else if (e instanceof Consultant) {
            System.out.println("Consultant 입니다.");
            System.out.println(((Consultant)e).num_project);

        } else if (e instanceof Director) {
            System.out.println("Director 입니다.");

        }else {
            System.out.println("Employee 입니다.");
        }
    }

    public static void main(String[] args) {
        Salesman s  = new Salesman();
        Consultant c = new Consultant();
        Manager m = new Manager();
        Director d = new Director();

//        calcTax(s);
//        calcTax(m);
//        calcTax(c);
        calcTax(d);

    }
}
