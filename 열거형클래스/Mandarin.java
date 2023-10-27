package 열거형클래스;

public enum Mandarin {
    금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

    private int price;

    Mandarin(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
