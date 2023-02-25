package practice_DTNT.practice13;

import java.util.*;

public class Sokrative01 {


        public static void main(String[] args) {


        //1)
            Queue<Integer> queue = new LinkedList<>();

            queue.add(3);
            queue.add(5);
            queue.add(7);
            queue.add(9);
            queue.add(11);
            queue.add(13);

            int count = 0;
            while (queue.isEmpty() == false) {

                queue.remove();

                count++;

                if(count == 3) {
                    break;
                }
            }
            System.out.println(queue);
        //6)
            Queue<String> q = new PriorityQueue<>();

            q.add("Teddy");
            q.add("Mark");
            q.add("Leo");
            q.remove();

            //7)
            HashSet<String> hSet = new HashSet<>();

            hSet.add("Z");

            hSet.add("Y");

            hSet.add("A");

            hSet.add("T");
            hSet.add("X");

            System.out.println(hSet);//A

            TreeSet<String> tSet = new TreeSet<>(hSet);

            System.out.println(tSet);//B


        }//main
}//class
