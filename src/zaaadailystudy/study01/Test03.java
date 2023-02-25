package zaaadailystudy.study01;

import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {

        TreeSet<String> tSet = new TreeSet<>(); // TreeSet natural order'a dizer, unique yapar: cift eklemez

        tSet.add("C");

        tSet.add("B");

        tSet.add("C");

        tSet.add("A");

        for (String w : tSet){

            System.out.print(w + " "); //A B C

        }

    }
}
