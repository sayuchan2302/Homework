package Task_2;

import java.util.LinkedList;
import java.util.Queue;

import Task_1.MyLIFO_App;

public class TestQueue {
	public static void main(String[] args) {
		MyFIFO_App fifo = new MyFIFO_App();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
//		fifo.stutter(queue);
//		System.out.println(queue);
		fifo.mirror(queue);
		System.out.println(queue);
	}
}
