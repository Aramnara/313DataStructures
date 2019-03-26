package anthonyramnarain;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue<T> implements Queue<T> {
    protected Node<T> front, rear;
    private int size;

    public LinkedQueue() {
        front = rear = null;
        size = 0;
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

    public T dequeue() throws Exception {
        if (empty())
            throw new Exception();
        T answer = front.getData();
        front = front.getNext();
        size--;
        if (front == null)
            rear = front;
        return answer;
    }

    public void enqueue(T x) {
        Node<T> newRear = new Node<T>(x, null);
        if (rear != null)
            rear.setNext(newRear);
        else
            front = newRear;
        rear = newRear;
        size++;
    }

    public String toString() {
        String ans = "Linked Queue<T>:  ";
        Node<T> n = front;
        while (n != null) {
            ans += (n.getData() + " -> ");
            n = n.getNext();
        }
        return ans;
    }

    public static void main(String args[]) {
        Queue<String> q = new LinkedQueue<String>();
        ArrayQueue.testQueue(q);
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