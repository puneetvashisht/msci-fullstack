package behavioral;

import java.util.Iterator;
import java.util.NoSuchElementException;

// The Iterator Pattern provides a way to sequentially access elements of a collection without exposing its underlying representation.

// Custom collection
class CustomCollection<T> {
    private T[] items;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public CustomCollection(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public void add(T item) {
        if (size >= items.length) {
            throw new IllegalStateException("Collection is full");
        }
        items[size++] = item;
    }

    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    // Inner class for Iterator
    private class CustomIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items[index++];
        }
    }
}

// Main method
public class IteratorExample {
    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>(5);
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}



