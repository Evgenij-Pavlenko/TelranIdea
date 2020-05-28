import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "I", "am", "Andrey"));

        /*
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("I");
        list.add("am");
        list.add("Andrey");

         */
        System.out.println("Before " + list);
        List<String> list2 = getList3(list);
        System.out.println("After " + list);
        System.out.println("List2 =  " + list2);

        System.out.println("-------Method4--------");
        List<String> list3 = getList4(list, new Predicate1());
        System.out.println("After " + list);
        System.out.println("List3 =  " + list3);

        System.out.println("-------Method5--------");
        List<String> list4 = getList4(list, new MyPredicate() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        });
        System.out.println("List4 =  " + list4);


        System.out.println("-------Method4--------");
        List<String> list5 = getList4(list, s -> s.length() > 3);
        System.out.println("List5 =  " + list5);
    }


    //java.util.ConcurrentModificationException
    public static List<String> getList(List<String> list) {
        for (String s : list) {
            if (s.length() < 3) {
                list.remove(s);
            }
        }
        return list;
    }

    public static List<String> getList2(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() < 3) {
                listIterator.remove();
            }
        }

        return list;
    }

    public static List<String> getList3(List<String> list) {
        List<String> resList = new ArrayList<>();
        for (String s : list) {
            if (s.length() >= 3) {
                resList.add(s);
            }
        }

        return resList;
    }

    public static List<String> getList4(List<String> list, MyPredicate predicate) {
        List<String> resList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                resList.add(s);
            }
        }

        return resList;
    }
}
