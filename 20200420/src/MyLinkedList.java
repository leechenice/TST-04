public class MyLinkedList {
    Node head;

    void addFrist(int data) {
        Node node = new Node(data);
        if(this.head.next == null) {
            head = node;
        }
        node.next = head;
        head = node;
    }

    void addLast(int data) {
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(data);
    }
    void disPlay() {
        Node cur = head.next;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key)
                return true;
            cur = cur.next;
        }
        return false;
    }
    int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    private Node searchIndex(int index) {
        if(index < 0 || index >size())
            throw new RuntimeException("index位置不合法！");
        Node cur = this.head;//index-1
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        return cur;

    }

    void addIndex(int index,int data) {
        if(index == 0)
            this.addFrist(data);
        if(index == size())
            this.addLast(data);
        Node cur = this.searchIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }

}
