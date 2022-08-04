package main;

public interface SortableSequence <T> {

    void sort(T[] array);

    boolean isSorted(T[] array);
}

