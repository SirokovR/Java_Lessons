package pattern.iteratorAgain;

import java.util.ArrayList;
import java.util.Iterator;

public class ConteinerImpl<T> implements  Container<T>{


    private  T[] storage;

    public ConteinerImpl(T... items) {
        this.storage = items;
    }

    @Override
    public Iterator getIterator() {
        return new MyIterator();
    }


    private  class MyIterator implements  Iterator<T>{

        private int cursor = 0;

        @Override
        public boolean hasNext() {

            return cursor < storage.length -1;
        }


        @Override
        public T next(){
            if(hasNext()){
                T next = storage[cursor];
                cursor++;
                return  next;
            }
            throw  new RuntimeException("Iterator is over");

        }

        @Override
        public void remove(){
//            T[] newStorage = new ArrayList<T>()[storage.length-1];
//             for (int i = 0; i < cursor; i++) {
//                 newStorage[i] = storage[i];
//             }
//             for (int i = cursor; i < storage.length; i++) {
//                 newStorage[i-1] = storage[i];
//             }
//             storage = newStorage;
        }
    }





}
