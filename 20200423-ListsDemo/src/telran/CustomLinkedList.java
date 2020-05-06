package telran;


import javax.xml.soap.Node;

public class CustomLinkedList<E> implements CustomList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(E o) {

        if (size > 0) {
            Node newNode = new Node(null, last, o);
            last.next = newNode;
            last = newNode;
        } else {
            Node newNode = new Node(null, null, o);
            first = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node ret = getNode(index);
        return (E) ret.value;
    }

    private Node getNode(int index) {
        Node ret = first;
        for (int i = 0; i < index; i++) {
            ret = ret.next;
        }
        return ret;
    }
    // this method repeat 2 time:
    private boolean deleteElement(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return true;
    }
    @Override
    public E removeById(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node node = getNode(index);
        deleteElement(node);
        return (E)node.value;
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    private static class Node<E> {
        E value;
        Node next;
        Node prev;


        public Node(Node next, Node prev, E value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}
