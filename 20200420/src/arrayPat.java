public class arrayPat {

    boolean contains(int[][] array,int target) {
        int rows = array.length;
        int cols = array[0].length;

        int i = rows - 1;
        int j = 0;
        while (i >= 0 && j < cols) {
            if (target > array[i][j])
                j++;
            else if (target < array[i][j])
                i--;
            else
                return true;
        }
        return false;
    }
    void moveZeroes(int[] nums) {
        
    }


}
