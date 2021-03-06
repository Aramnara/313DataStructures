package anthonyramnarain;


import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

class ListAdapterQueue<T> implements Queue<T> {
    private LinkedList<T> l;

    public ListAdapterQueue() {
        l = new LinkedList<T>();
    }

    public int size() {
        return l.size();
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
        return l.isEmpty();
    }

    public void enqueue(T d) {
        l.addTail(d);
    }

    public T dequeue() throws Exception {
        return l.removeHead();
    }

    public String toString() {
        return l.toString();
    }

    public static void main(String args[]) {
        Queue<String> q = new ListAdapterQueue<String>();
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