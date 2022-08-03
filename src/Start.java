public class Start {
    public static void main(String[] args) {
        System.out.println("Si comincia buon lavoro");
        SortableArray<Integer> array= new SortableArray<>(Integer.class,5);
        array.set(0,10);
        array.set(1,100);
        array.set(2,70);
        array.set(3,1);
        array.set(4,34);
        System.out.println(array);
        System.out.println(array.isSorted());
        array.sort();

        System.out.println(array.isSorted());
    }
    }

