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

        System.arraycopy(sourse, index + 1, sourse, index, size - index);

        // через for тоже в тот же массив сохранять, только начиная с index
        //исправил
//        Object[]newSource = new Object[sourse.length-1];
//        for (int i = 0; i <sourse.length-1 ; i++) {
//            if (i>=index){
//                sourse[i]=sourse[i+1];
//            }
//        }

        size--;
        return (E) o;
    }

    // and test works
    @Override
    public boolean remove(E e) {

        for (int i = 0, count = 0; i < size; i++) {
            if (sourse[i].equals(e)) {
                System.arraycopy(sourse, i + 1, sourse, i, size - i);
                size--;
                return true;
            }
        }
        return false;
    }
}