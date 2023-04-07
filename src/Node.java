public class Node<T> {
    private T element;
    private Node<T> prev;
    private Node<T> next;
    private int index;

    public Node(T element, Node<T> prev, Node<T> next, int index) {
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

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }
}
