import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SpecList<T> implements Iterable<T>  {
    private int size;
    private boolean isEmpty;
    private Node<T> first;
    private Node<T> last;

    public int size() {
        return size;
    }

    public SpecList() {
        this.size = 0;
        this.first = null;
        this.last = null;
        this.isEmpty = true;
    }

    public Node<T> add (T element){
        if (isEmpty){
            this.first = new Node<T>(element, null, null, size);
            isEmpty=false;
            this.size++;
            this.last = this.first;
        }
        else {
            this.last = new Node<T>(element, this.last, null, this.last.getIndex()+1);
            this.last.getPrev().setNext(this.last);
            this.size++;
        }
        return last;
    }

    public T getLast(){
        return this.last.getElement();
    }

    public T getFirst() {
        return this.first.getElement();
    }

    public T getByIndex(int index){
        if (index == 0){
            return first.getElement();
        }
        if (index == this.size()-1){
            return last.getElement();
        }
        Node<T> temp = last.getPrev();
        while (temp != null){
            if (temp.getIndex() == index) return temp.getElement();
            temp = temp.getPrev();
        }
        return null;
    }

    public Node<T> getNodeByIndex(int index){
        if (index == 0){
            return first;
        }
        if (index == this.size()-1){
            return last;
        }
        Node<T> temp = last.getPrev();
        while (temp != null){
            if (temp.getIndex() == index) return temp;
            temp = temp.getPrev();
        }
        return null;
    }

    public void remove(int index){
        Node<T> element = getNodeByIndex(index);
        Node<T> prev = element.getPrev();
        Node<T> next = element.getNext();

        prev.setNext(next);
        next.setPrev(prev);

        for (int i = next.getIndex(); i <= this.last.getIndex(); i++) {
            Node<T> changed = getNodeByIndex(i);
            changed.setIndex(i-1);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                if (counter<size()) return true;
                return false;
            }

            @Override
            public T next() {
                return getByIndex(counter++);
            }
        };
    }
}
