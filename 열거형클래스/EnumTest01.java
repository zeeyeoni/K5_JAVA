package 열거형클래스;

public class EnumTest01 {
    public static void main(String[] args) {
        Status work = null;

        int n = 4;

        switch (n) {
            case 1:
                work = Status.READY;
                break;
            case 2:
                work = Status.SEND;
                break;
            case 3:
                work = Status.COMPLETE;
                break;
            case 4:
            default:
                work = Status.CLOSE;
                break;
        }

        System.out.println("현재 작업 상태 : " + work);
    }
}
