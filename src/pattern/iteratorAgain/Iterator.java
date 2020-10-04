package pattern.iteratorAgain;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
