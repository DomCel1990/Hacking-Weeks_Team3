package main;

import java.util.Arrays;

public class SortableArray<T extends Comparable> implements SortableSequence {
    private T[] element;
    private int newSize;

    public SortableArray(int length) {
        this.element = (T[]) new Comparable[length];
        this.newSize = length;
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



    public void remove(int i) {
        //reset the last element to null
        //to move it to the last index
        element[i]=null;
        //decrease the size of the array to remove last element
        newSize=element.length-1;
    }


    @Override
    public void sort(Object[] array) {
        for (int i = 1; i < array.length; ++i) {
            T elementToInsert = (T) array[i];
            System.out.println("Inserting element " + elementToInsert);

            int j;
            for (j = i; j > 0 && elementToInsert.compareTo(array[j - 1]) < 0; --j) {
                System.out.println("" + elementToInsert + " is smaller than " + array[j - 1]);
                array[j] = array[j - 1];
            }
        }
    }

    @Override
    public boolean isSorted(Object[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1]))
                return false;
        }
        return true;
    }
}




