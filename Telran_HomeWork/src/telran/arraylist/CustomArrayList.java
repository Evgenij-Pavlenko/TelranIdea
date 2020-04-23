package telran.arraylist;

public class CustomArrayList<E> implements CustomList<E> {

    private Object[] sourse;
    private int size;

    private static final int DEFAULT_CAPAICITY = 16;

    public CustomArrayList() {
        sourse = new Object[DEFAULT_CAPAICITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(E o) {

        if (size == sourse.length) {
            Object[] newSource = new Object[size * 2];
            System.arraycopy(sourse, 0, newSource, 0, sourse.length);
            sourse = newSource;
        }
        sourse[size] = o;
        size++;
    }

    @Override
    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) sourse[index];
    }

    @Override
    public E removeById(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object o = sourse[index];

        System.arraycopy(sourse, index + 1, sourse, index, size - index - 1);
//        Object[]newSource = new Object[sourse.length];
//        for (int i = 0; i <newSource.length ; i++) {
//            if (i<index) {
//                newSource[i] = sourse[i];
//            }
//            if (i>=index){
//                newSource[i]=sourse[i+1];
//            }
//        }

        size--;
        return (E) o;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    public boolean removeByElement(E i) {
        return false;
    }
}