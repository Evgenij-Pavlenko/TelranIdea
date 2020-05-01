package telran;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        Collections.addAll(list, "one", "two", "three");
        Collections.sort(list);
        System.out.println(list);

        List<String> strings = Arrays.asList("Hello", "World", "one", "two", "three"); // size is constant
        System.out.println(strings);

        System.out.println(strings.getClass().getName());
//        for (String s:list){
//            System.out.println(s);
//        }
//        Iterator<String> iterator = list.iterator();
        Iterator<String> iterator = getIterator();

                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }

//        System.out.println(list.toString());

    }

    public static Iterator<String> getIterator(){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        return list.iterator();
    }

    public static List<String> getList(){ //ArrayList<String> - неправильно, если в теле метода
        // тоже ArrayList<String>. И если нужен другой лист - типа LinkedList - все сломается
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        return list;
    }



}
