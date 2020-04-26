public class MyLinkedList {
    Node head = null;
    Node fail = null;
    public void addFirst(int data) {
        Node cur = new Node(data);
        if(this.head == null) {
            this.head = cur;
            this.fail = cur;
            return;
        }
        this.head.prev = cur;
        cur.next = this.head;
        this.head = cur;
    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public void addLast(int data) {
        Node cur = new Node(data);
        if(this.fail == null) {
            this.fail = cur;
            this.head = cur;
        }else {
            this.fail.next = cur;
            cur.prev = this.fail;
            this.fail = cur;

        }
    }
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == new Node(key).data) {
                return true;

            }
            cur = cur.next;
        }
        return false;
    }
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }
    private Node searchIndex(int index) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == index) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    public void addIndex(int index) {
        checkIndex(index);
        Node cur = searchIndex(index);
        if(cur == null) {
            return ;
        }
        if(index == 0) {
            addFirst(index);
        }else if(index == this.size()) {
            addLast(index);
        }else {
            Node node = new Node(index);
            node.prev = cur.prev;
            node.next = cur;
            cur.prev.next = node;
            cur.prev = node;
        }
    }
    public int remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;

                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.fail = cur.prev;
                    }

                }
                return oldData;
            }
            cur = cur.next;
        }
        return  -1;
    }
    public void clear() {
        while (this.head != null) {
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.fail = null;
    }


}