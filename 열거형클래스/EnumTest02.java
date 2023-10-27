package 열거형클래스;

public class EnumTest02 {
    public static void main(String[] args) {

        Mandarin ma = Mandarin.한라봉;
        if(ma == Mandarin.한라봉) {
            System.out.println("ma는 한라봉입니다.");
        }
        System.out.println(ma + "가격: " + ma.getPrice());

        Mandarin list[] = Mandarin.values();
        System.out.println("==귤의 종류==");
        for(Mandarin m : list) {
            System.out.println(m + ":" + m.getPrice());
        }
    }
}
