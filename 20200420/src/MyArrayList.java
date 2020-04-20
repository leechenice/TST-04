import java.util.Arrays;

class MyArrayList {
    private int[] elem;
    private int usedSize;
    private static final int intCapacity = 10;

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    void clear() {
        this.usedSize = 0;
    }

    void disPlay() {

        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
    }
    int size() {
        return this.usedSize;
    }

    void remove(int toRemove) {
        int tmp = search(toRemove);
        if(tmp == -1) {
            return;
        }
        int i = tmp;
        while (i < this.usedSize - 1) {
            this.elem[i] = this.elem[i + 1];
            i++;
        }
        this.usedSize--;

    }

    boolean isEmpty() {
        return this.usedSize == 0;
    }

    int getPos(int pos) {
        if(isEmpty()) {
            throw new RuntimeException("7777777");
        }

        if(pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("7777777");
        }
        return  this.elem[pos];

    }

    int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    void setPos(int pos,int value) {
        if(pos < 0 || pos >= usedSize) {
            return;
        }
        this.elem[pos] = value;
    }

    boolean isFull() {
        return this.usedSize == this.elem.length;
    }
    void add(int pos,int data) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2 * this.elem.length);
        }
        if(pos < 0 || pos > this.usedSize) {
            return;
        }
        int i = pos;
        while (i <= this.usedSize) {
            this.elem[i + 1] = this.elem[i];
            i++;
        }
        this.elem[pos] = data;
        this.usedSize++;

    }


    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }
}
