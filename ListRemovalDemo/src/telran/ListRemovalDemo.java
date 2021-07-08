package telran;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemovalDemo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(10);
        al.add(20);
        al.add(30);

        List<Integer> result = getReduceList(al, 10);


        System.out.println("Modified ArrayList: " + result);

        System.out.println("al ArrayList: " + al);

    }

    public static List<Integer> getReduceList(List<Integer> list, int n) {
        //создаем новый лист
        List<Integer> ret = new ArrayList<>();
        for (Integer a: list){
            if (a<n){
                ret.add(a);
            }
        }

//        Iterator itr = ret.iterator();
//        while (itr.hasNext()) {
//            int x = (Integer) itr.next();
//            if (x >= n)
//                itr.remove();
//        }
        return ret;
    }
}
