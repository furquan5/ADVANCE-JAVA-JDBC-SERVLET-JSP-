package maccess;
import java.util.*;
public class Queue {
	public static void main(String[] args) {
		System.out.println("==========Priority Queue==========");
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(new Integer(12));
		pq.add(new Integer(15));
		pq.add(new Integer(11));
		pq.add(new Integer(19));
		pq.add(new Integer(16));
		System.out.println(pq);
		
		
		System.out.println("========ArrayDeque=======");
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(new Integer(80));
		ad.add(new Integer(90));
		ad.add(new Integer(70));
		ad.add(new Integer(100));
		ad.add(new Integer(50));
		ad.add(new Integer(40));
		System.out.println(ad);
		
		
		System.out.println("=========Linkedlist==========");
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(new Integer(500));
		ll.add(new Integer(600));
		ll.add(new Integer(400));
		ll.add(new Integer(800));
		ll.add(new Integer(900));
		System.out.println(ll);
		ll.addFirst(51);
		ll.addLast(511);
		ll.remove(2);
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}

}
