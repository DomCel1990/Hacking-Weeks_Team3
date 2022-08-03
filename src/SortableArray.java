import java.util.Arrays;

public class SortableArray<T extends Comparable> implements SortableSequence {
    private T[] element;
    private int newSize;

    public SortableArray(int length) {
        this.element = (T[]) new Comparable[length];
        this.newSize=length;
    }

    public void set(int i, T element) {
        this.element[i] = element;
    }

    public T get(int i) {
        return this.element[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(element);

    }

    @Override
    public void sort() {
        for (int i = 0; i < element.length - 1; i++) {
            //if the element is greater than the next exchange the values
                if (element[i].compareTo(element[i + 1]) > 0) {
                    T k = element[i];
                    element[i] = element[i + 1];
                    element[i + 1] = k;
                }
        }

    }

    @Override
    public boolean isSorted() {
        for (int i = 0; i < element.length; i++) {
            for (int j = i + 1; j < element.length; j++) {
                if (element[j].compareTo(element[i]) < 0)
                    return false;
            }
        }
        return true;
    }
    public void remove(int i) {
        //reset the last element to null
        //to move it to the last index
        element[i]=null;
        //decrease the size of the array to remove last element
        newSize=element.length-1;
    }
}



