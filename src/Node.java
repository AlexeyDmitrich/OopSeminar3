public class Node<T> {
    private T element;
    private T prev;
    private T next;
    private int index;

    public Node(T element, T prev, T next, int index) {
        this.element = element;
        this.prev = prev;
        this.next = next;
        this.index = index;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getPrev() {
        return prev;
    }

    public void setPrev(T prev) {
        this.prev = prev;
    }

    public T getNext() {
        return next;
    }

    public void setNext(T next) {
        this.next = next;
    }
}
