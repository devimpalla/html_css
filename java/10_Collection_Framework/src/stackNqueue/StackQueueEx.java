package stackNqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		// stack 구조 : 책을 바닥부터 쌓는 모양으로 데이터가 만들어지는 형태 (후입 선출) - LIFO
		// queue 구조 : 양쪽이 열려있는 파이프 한쪽에서 데이터를 밀어 넣는 형태 (선입 선출) - FIFO
		
		
		// queue 가 더 많이 사용됨.
		
		Stack stack = new Stack();
		Queue queue = new LinkedList<>();
		
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		
		System.out.println("Stack 구조");
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("Queue 구조");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
