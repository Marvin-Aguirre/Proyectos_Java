package gt.edu.umg.progra3.colas;
import java.util.LinkedList;
public class ColaImpl implements Cola{

    LinkedList cola=new LinkedList();

    @Override
    public void enqueue(String item) {
         cola.add(item);

    }

    @Override
    public String deque() {
        String item= (String) cola.remove();
        return item;
    }

    @Override
    public String peek() {
        String item= (String) cola.peek();
        return item;
    }

    @Override
    public int size() {
    cola.size();
    return cola.size();
    }

    @Override
    public boolean isEmpty() {

        return cola.isEmpty();
    }
}
