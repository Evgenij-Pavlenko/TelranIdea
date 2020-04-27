package telran.arraylist;

public class CustomArrayList<E> implements CustomList<E> {

    private Object[] source;
    private int size;

    private static final int DEFAULT_CAPAICITY = 16;

    public CustomArrayList() {
        source = new Object[DEFAULT_CAPAICITY];
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void append(E o) {

        if (size == source.length) {
            Object[] newSource = new Object[size * 2];
            System.arraycopy(source, 0, newSource, 0, source.length);
            source = newSource;
        }
        source[size] = o;
        size++;
    }

    @Override
    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) source[index];
    }

    @Override
    public E removeById(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object o = source[index];

        System.arraycopy(source, index + 1, source, index, size - index);

        // через for тоже в тот же массив сохранять, только начиная с index
        //исправил
//        Object[]newSource = new Object[source.length-1];
//        for (int i = 0; i <source.length-1 ; i++) {
//            if (i>=index){
//                source[i]=source[i+1];
//            }
//        }

        size--;
        return (E) o;
    }

    // and test works
    @Override
    public boolean remove(E e) {

        for (int i = 0; i < size; i++) {
            if (source[i].equals(e)) {
                System.arraycopy(source, i + 1, source, i, size - i);
                size--;
                return true;
            }
        }
        return false;
    }
}