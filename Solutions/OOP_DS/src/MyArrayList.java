public class MyArrayList<T extends Comparable> {
    private T[] array;
    private int index;

    public MyArrayList(T[] array) {
        this.array = array;
    }

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

    public void addLast(T element){
        if (index == array.length) {
            grow();
        }
        array[index] = element;
        index++;
    }

    public int getCount(){
        return index;
    }

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

    // quicksort to sort the array inplace
    public void inplaceSort(){
        // use fastest sorting algorithm
        quickSort(0, index - 1);
    }

    public void quickSort(int left, int right){
        if (left >= right) {
            return;
        }
        int pivot = partition(left, right);
        quickSort(left, pivot - 1);
        quickSort(pivot + 1, right);
    }

    public int partition(int left, int right){
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


    public void swap(int first, int second){
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public void deleteFirst(){
        for (int i = 0; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    public void deleteLast(){
        index--;
    }

    public void rotateLeft(){
        T temp = array[0];
        for (int i = 0; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        array[index - 1] = temp;
    }

    public void rotateRight(){
        T temp = array[index - 1];
        for (int i = index - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    public static <T extends Comparable> MyArrayList merge(MyArrayList<T> first, MyArrayList<T> second){
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

    private void grow(){
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
