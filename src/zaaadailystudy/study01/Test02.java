package zaaadailystudy.study01;

import java.util.LinkedList;
import java.util.Queue;

public class Test02 {
    public static void main(String[] args) {



        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);

        queue.add(5);

        queue.add(7);

        queue.add(9);

        queue.add(11);

        queue.add(13);



        int count = 0;

        while (queue.isEmpty() == false) {

            queue.remove(); //Retrieves and removes the head of this queue, or returns null if this queue is empty.

            count++;

            if(count == 3) {

                break;

            }

        }

        System.out.println(queue); // [9, 11, 13]

    }
}
