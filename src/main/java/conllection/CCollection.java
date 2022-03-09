package conllection;

import java.util.*;

public class CCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        Iterator<String> iterable = list.iterator();
        while (iterable.hasNext()) {
            System.out.println("iterable = " + iterable.next());
        }
        Object[] objects = Arrays.copyOf(list.toArray(), list.size() - 1);
        for (Object object : objects) {
            System.out.println("object.toString() = " + object.getClass());
        }
        System.out.println("objects = " + objects);
        List<String> list1 = new LinkedList<>();
        Set<String> strings = new HashSet<>();
        System.out.println( 1 << 4);
        TreeMap treeMap = new TreeMap();
        int h;
        String k = new String("aa");
        System.out.println((k == null) ? 0 : (h = k.hashCode()) ^ (h >>> 16));

    }
}
