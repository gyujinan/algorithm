package doit.CH4;
class Gqueue<E> {
	private int max;
	private int num;
	private E [] que;
	private int front;
	private int rear;
	
	Gqueue(int capacity){
		front = rear = num = 0;
		max = capacity;
		try {
			que = (E[])new Object [max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
		
	}
	
	public E enque(E x) throws OverflowIntQueueException{
		if(isFull()) {
			throw new OverflowIntQueueException();
		}
//		if(rear>=max) {
//			rear = 0;
//		}
//		num++;
//		que[rear++]=x;
		
		que[rear++]=x;
		num++;
		
		if(rear == max) {
			rear =0;
		}
		
		
		return x;
	}
	
	public E deque() throws EmptyIntQueueException{
		if(isEmpty()) {
			throw new EmptyIntQueueException();
		}
		
//		if(front >= max) {
//			front = 0;
//		}
//		
//		num--;
//		return que[front++];
		num--;
		E out = que[front];
		if(++front==max) {
			front = 0;
		}
		return out;
	}
	
	public E peek() {
		
		return que[front];
	}
	
	public int indexOf(int x) {
		
//		for(int i = 0; i<num; i++) {
//			int index = front;
//			if(index>=max) index = 0;
//			if(que[index]==x) {
//				return que[index];
//			}
//			index++;
//			
//		}
		
		for(int i = front; i<front+num; i++) {
			if(que[i%max].equals(x)) {
				return i%max;
			}
		}
		return -1;
	}
	
	public void clear() {
		front = rear = num = 0;
	}
	
	public int capacity() {
		
		return max;
	}
	
	public int size() {
		
		return num;
	}
	
	public boolean isEmpty() {
		
		return num <= 0 ? true : false;
	}
	
	public boolean isFull() {
		
		return num >= max ? true : false;
	}
	
	public void dump() {
//		for(int i = 0; i<num; i++) {
//			int index = front;
//			if(index<=max) index = 0;
//			System.out.println(que[index]);
//			index++;
//		}
		
		for(int i = front; i<front+num; i++) {
			
			System.out.println(que[i%max]);
		}
	}
	
	public int search(int x) {
//		int count = 0;
//		for(int i = front; i<front+num; i++) {
//			count++;
//			if(que[i%max]== x) {
//				return count; 
//			}
//			
//		}
//		return count;
		
		for(int i = front; i<front+num; i++) {
			if(que[i%max].equals(x)) {
				return i-front+1;
			}
			
		}
		
		return 0;
	}
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
