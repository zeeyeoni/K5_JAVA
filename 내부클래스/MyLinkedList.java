package 내부클래스;

public class MyLinkedList {
    private Node head;

    private class Node {
        private String data;
        private Node link;

        public Node(String data) {
            this.data = data;
        }
    }

    // LinkedList는 null일 때와 아닐 때 숫자 쌓는게 다르기 때문에 초기화를 무조건 해줘야 한다.
    public MyLinkedList(Node head) {
        this.head = head;
    }

    public MyLinkedList() {
        this(null);
    }

    public void add(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        } else {
            Node next = head;
            while(next.link != null) {
                next = next.link;
            }
            next.link = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("등록된 데이터가 없습니다.");
        } else {
            System.out.println("등록된 데이터는 다음과 같습니다.");
            Node next = head;
            while (next != null) {
                System.out.println(next.data);
                next = next.link;
            }
        }
    }
}
