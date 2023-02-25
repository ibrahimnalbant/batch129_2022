package zaaadailystudy.study01;

import java.util.HashSet;

public class Test06 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("A");

        hs.add("B");

        hs.add("A");

        hs.add(null);

        hs.add(null);

        System.out.println(hs);//[null, A, B]

    }
}
