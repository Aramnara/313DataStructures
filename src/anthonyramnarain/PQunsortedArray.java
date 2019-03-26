package anthonyramnarain;

import java.util.PriorityQueue;

public class PQunsortedArray<K extends Comparable<K>> extends PriorityQueue<K> {
    K[] data;
    int size;
    int capacity;

    public PQunsortedArray() {
        capacity = 100;
        size = 0;
        data = (K[]) new Comparable[capacity];
    }

    // easy insertion
    public boolean add(K x) /*throws Exception*/ {
        if (size >= capacity) try {
            throw new Exception("Queue full");
        } catch (Exception e) {
            e.printStackTrace();
        }
        data[size++] = x;
        return false;
    }

    public K removeMin() throws Exception {
        if (size == 0) throw new Exception("Queue Empty");
        int minIndex = 0;
        for (int i = 1; i < size; i++)
            if (data[i].compareTo(data[minIndex]) < 0)
                minIndex = i;
        K ans = data[minIndex];
        data[minIndex] = data[--size];
        return ans;
    }
}