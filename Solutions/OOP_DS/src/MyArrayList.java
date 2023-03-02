public class MyArrayList<T extends Comparable> {

    /**
     * @param <T>
     * @param first 
     * @param second
     * @return a new MyArrayList that contains all elements from first and second
     */
    public static <T extends Comparable> MyArrayList merge(
        MyArrayList<T> first, MyArrayList<T> second){
        
            Object[] dummy = new Object[first.getCount() + second.getCount()];
            MyArrayList<T> result = new MyArrayList<T>((T[])dummy);
        for (int i = 0; i < first.getCount(); i++) {
            result.addLast(first.array[i]);
        }
        for (int i = 0; i < second.getCount(); i++) {
            result.addLast(second.array[i]);
        }
        return result;
    }

    private T[] array;

    private int index;

    /**
     * @param array the array to be used as the internal array
     */
    public MyArrayList(T[] array) {
        this.array = array;
    }

    /**
     * @param element the element to be added to the front of the list
     * 
     */
    public void addFront(T element){
        if (index == array.length) {
            grow();
        }
        for (int i = index; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = element;
        index++;
    }

    /**
     * @param element the element to be added to the end of the list
     */
    public void addLast(T element){
        if (index == array.length) {
            grow();
        }
        array[index] = element;
        index++;
    }

    /**
     * @return the number of elements in the list
     */
    public int getCount(){
        return index;
    }

    /**
     * @param first the element to be inserted before
     * @param Second the element to be inserted
     *  insert Second before first
     */
    public void insertBefore(T first, T Second){
        if (index == array.length) {
            grow();
        }
        for (int i = 0; i < index; i++) {
            if (array[i].equals(first)) {
                for (int j = index; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[i] = Second;
                index++;
                break;
            }
        }
    }

    /**
     *   
     */
    public void inplaceSort(){
        quickSort(0, index - 1);
    }

    private void quickSort(int left, int right){
        if (left >= right) {
            return;
        }
        int pivot = partition(left, right);
        quickSort(left, pivot - 1);
        quickSort(pivot + 1, right);
    }


    private int partition(int left, int right){
        T pivot = array[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (array[j].compareTo(pivot) < 0) {
                swap(i, j);
                i++;
            }
        }
        swap(i, right);
        return i;
    }

    /**
     * @param first
     * @param second
     * swap the elements at first and second
     */
    public void swap(int first, int second){
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    /**
     *  delete the first element
     */
    public void deleteFirst(){
        for (int i = 0; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    /**
     *  delete the last element
     */
    public void deleteLast(){
        index--;
    }

    /**
     *  delete the first occurrence of element
     */
    public void rotateLeft(){
        T temp = array[0];
        for (int i = 0; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        array[index - 1] = temp;
    }

    /**
     *  delete the last occurrence of element
     */
    public void rotateRight(){
        T temp = array[index - 1];
        for (int i = index - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
 
    public void printAllForward(){
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printAllBackward(){
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void grow(){
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
