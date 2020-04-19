import java.util.Arrays;

class MyArrayList {

    private int[] elem;
    private int usedSize ;
    private static final int intCapacity = 10;
    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    void remove(int toRemove) {
        if(this.usedSize == 0) {
            return;
        }
//        int i = 0;
//        for (; i <this.usedSize - 1; i++) {
//            if(this.elem[i] == toRemove) {
//                break;
//            }
//        }
//        if(i == this.usedSize) {
//            return;
//        }
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没数");
            return;
        }
        if (this.usedSize - 1 - index >= 0)
            System.arraycopy(this.elem, index + 1, this.elem, index, this.usedSize - 1 - index);
        this.usedSize--;
    }

    int getPos(int pos) {
        if(this.usedSize == 0) {
            return -1;
        }
        if(pos < 0 || pos > this.usedSize -1) {
            return -1;
        }
        return this.elem[pos];
    }

    int size() {
        return this.usedSize;
    }
    boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;

    }

    int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    void disPlay() {

        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }

    private boolean isFull() {

         return this.usedSize == this.elem.length;
    }

    void add(int pos,int data) {

         if(isFull()) {
             this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
         }

         if(pos < 0 || pos > this.usedSize) {
             return;
         }

        System.arraycopy(this.elem, pos, this.elem, pos + 1, usedSize - pos);

        this.elem[pos] = data;
        this.usedSize++;
    }

    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
