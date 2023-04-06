import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SpecList<T>  {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public int size() {
        return size;
    }

    public SpecList() {
        this.size = 10;
        this.first = null;
        this.last = null;
    }


}
