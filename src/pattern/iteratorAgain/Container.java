package pattern.iteratorAgain;

import java.util.Iterator;

public interface Container<T> {
    Iterator<T> getIterator();
}
