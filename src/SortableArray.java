import java.lang.reflect.Array;
import java.util.Arrays;

public class SortableArray<T extends Comparable> implements SortableSequence {
    private T[] element;

    public SortableArray(Class<T> cls, int length) {
        this.element = (T[]) Array.newInstance(cls, length);
    }

    public void set(int i, T element) {
        this.element[i] = element;
    }

    public T get(int i) {
        return this.element[i];
    }

    @Override
    public String toString() {
        return "SortableArray{" +
                "element=" + Arrays.toString(element) +
                '}';
    }

    @Override
    public void sort() {
        for (int i = 0; i < element.length; i++) {
            for (int j = i + 1; j < element.length; j++) {
                T tmp;
                if (element[i].compareTo(element[j]) > 0) {
                    tmp = element[i];
                    element[i] = element[j];
                    element[j] = tmp;
                }
            }
        }
        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }
    }

    @Override
    public boolean isSorted() {
        for (int i = 1; i < element.length; i++){
            if (element[i-1].compareTo(element[i]) > 0)
                return false;
            else if (element[i-1].compareTo(element[i]) == 0 || element[i-1].compareTo(element[i]) < 0)
                return true;
        }
            return false;
    }
}



