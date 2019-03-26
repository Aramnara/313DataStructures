package anthonyramnarain;


import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class ArrayQueue<T> implements Queue<T> {
    private T data[];
    private int front, rear, size, capacity;

    public ArrayQueue() {
        capacity = 1000;
        data = (T[]) new Object[capacity];
        front = rear = size = 0;
    }

    public ArrayQueue(int c) {
        capacity = c;
        data = (T[]) new Object[capacity];
        front = rear = size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean empty() {
        return size == 0;
    }

    public void enqueue(T x) throws Exception {
        if (size() == capacity)
            throw new Exception("Queue<T> Full");
        data[rear++] = x;
        if (rear == capacity)
            rear = 0;
        size++;
    }

    public T dequeue() throws Exception {
        if (empty())
            throw new Exception("Queue<T> Empty");
        T answer = (T) data[front++];
        if (front == capacity)
            front = 0;
        size--;
        return answer;
    }

    // methods for testing purposes
    public String toString() {
        int i, j;
        String ans = "Array Queue<T>:  ";
        for (i = 0, j = front; i < size; i++, j++) {
            if (j == capacity)
                j = 0;
            ans += (data[j] + " -> ");
        }
        return ans;
    }

    public static void main(String args[]) {
        Queue<String> q = new ArrayQueue<String>();
        testQueue(q);
    }

    public static void testQueue(Queue<String> q) {
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        while (!done) {
            try {
                System.out.print(q + "  ");
                System.out.println("\ncmds are + - Q: >>");
                String cmd = sc.next();
                String entry = null;
                char command = cmd.charAt(0);
                if (command == '+')
                    entry = sc.next();
                switch (cmd.charAt(0)) {
                    case 'Q':
                        done = true;
                        break;
                    case '+':
                        q.add(entry);
                        break;
                    case '-':
                        q.remove();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        }
        sc.close();
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}