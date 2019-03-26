package anthonyramnarain;

import java.util.PriorityQueue;

public class PQsortedArray<K extends Comparable<K>> extends PriorityQueue<K> {
    K[] data;
    int size;
    int capacity;

    public PQsortedArray() {
        capacity = 100;
        size = 0;
        data = (K[]) new Comparable[capacity];
    }
    public boolean add(K x) /*throws Exception*/ {
        if (size >= capacity) try {
            throw new Exception("Queue Full");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = size++;
        while (i > 0 && data[i - 1].compareTo(x) < 0) {
            data[i] = data[i - 1];
            i--;
        }
        data[i] = x;
        return false;
    }

    public K removeMin() throws Exception {
        if (size == 0) throw new Exception("Queue Empty");
        return data[--size];
    }
}