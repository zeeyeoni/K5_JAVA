package 다형성;

public class Director extends Manager {

    public void calcBonus() {
        System.out.println("Director 보너스 = 기본급 12 * 6");
    }

    @Override
    public String toString() {
        return "dir" + super.toString() + super.hashCode();
    }
}