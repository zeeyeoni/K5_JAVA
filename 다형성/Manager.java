package 다형성;

class Manager extends Employee {
    int num_team;
    public Manager(int num_team) {
        this.num_team = num_team;
    }

    public Manager() {
        this(2);
    }
    public void calcSalary() {
        System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
    }

    @Override
    public void calcBonus() {

    }

}
