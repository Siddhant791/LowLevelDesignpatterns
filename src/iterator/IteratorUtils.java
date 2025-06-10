package iterator;

public class IteratorUtils {
    public static <E> void printAll(PlayListIterator<E> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}