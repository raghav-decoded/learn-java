package learnjava;

import java.util.*;
public class arrdeq extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        ad1.addFirst(5);
        ad1.offerFirst(10);

        ad1.addLast(5);
        ad1.offerLast(10);
        
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());

        ad1.pollFirst(); //deletes 6
        ad1.removeFirst(); //deletes 56

        ad1.pollLast(); //deletes 19
        ad1.removeLast(); //deletes 91
        
        ad1.addFirst(5);
        
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        System.out.println(ad1);

    }
}
