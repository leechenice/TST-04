import org.omg.CORBA.PUBLIC_MEMBER;

public class SingleLinkedList {
    private Node head;
    //头插法    
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;

    }
    //尾插法    
    public void addLast(int data) {
        if(this.head == null) {
            this.head = new Node(data);
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(data);

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
    //任意位置插入,第一个数据节点为0号下标    
    public void addIndex(int index,int data) {
        if(index == 0) {
            this.addFirst(data);
            return;
        }
        if(index == this.size()) {
            this.addLast(data);
            return;
        }
        Node cur = this.searchIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;

    }
    //查找是否包含关键字key是否在单链表当中    
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    private Node scarchKey(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }
    //删除第一次出现关键字为key的节点    
    public void remove(int key) {
        if(this.head == null){
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = this.scarchKey(key);
        if(prev == null) {
            System.out.println("找不到");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;

    }
    //删除所有值为key的节点    
    public void removeAllKey(int key) {
        if(this.head == null){
            return;
        }
        while (this.head.data == key) {
            this.head = this.head.next;
        }
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }

    }
    //得到单链表的长度    
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;

    }
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();

    }
    public void clear() {
        this.head = null;
    }
    public Node reverseOrder() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void reverseOrder2() {

        Node cur = this.head.next;
        this.head.next = null;
        while (cur != null) {
            Node curNext = cur.next;
            this.addFirst(cur.data);
            cur = curNext;
        }

    }
    public Node middleNode() {

        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
    public Node findKthToTail(int k) {
        if(k <= 0) {
            System.out.println(k + "不合法");
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k > 1) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println(k + "不合法");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public Node xxx(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                //第一次插入
                if(bs == null) {
                    bs = cur;
                    be = bs;
                }else {
                    be.next = cur;
                    be = cur;
                }
            }else {
                //第一次插入
                if(as == null) {
                    as = cur;
                    ae = as;

                }else {
                    ae.next = cur;
                    ae = cur;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空  如果bs == null 返回as
        if(bs == null) {
            return as;
        }

        //2、如果bs不为空  需要进行拼接
        else{
            be.next = as;
        }

        //3、如果ae不为空    ae的next需要置为空
        if(ae != null) {
            ae.next = null;
        }

        return bs;

    }
    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp =newHead;
        while(cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;

    }
    public boolean is121() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while (this.head != slow) {
            if (slow.data != this.head.data) {
                return false;
            }
            if(this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }

}

