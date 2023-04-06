import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SpecList implements Iterable<T>  {
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
            this.last = new Node<T>(element, this.last, this.first, size);
            this.size++;
        }
        return last;
    }



}
