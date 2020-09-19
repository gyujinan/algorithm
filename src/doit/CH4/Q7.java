package doit.CH4;
class IntDeck {
	private int max;
	private int num;
	private int [] que;
	private int front;
	private int rear;
	
	IntDeck(int capacity){
		if(capacity<2) {
			max = 2;
		}
		max = capacity;
		front = 0;
		rear = front + 1;
		num = 0;
		try {
			que = new int [max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
		
	}
	public boolean isEmpty() {
		
		return num <= 0 ? true : false;
	}
	
	public boolean isFull() {
		
		return num >= max ? true : false;
	}
	
	public int enqueFront(int x) throws OverflowIntQueueException{
		if(isFull()) {
			throw new OverflowIntQueueException();
		}
		num++;
		que[front--] = x;
		if(front==-1) front = max;
		
		
		return x;
	}
	
	public int enqueRear(int x) throws OverflowIntQueueException{
		if(isFull()) {
			throw new OverflowIntQueueException();
		}
		num++;
		que[rear++] = x;
		if(rear==max) rear = 0;
		
		return x;
	}
	
	
	
	public int dequeFront() throws EmptyIntQueueException{
		if(isEmpty()) {
			throw new EmptyIntQueueException();
		}
		num--;
		if(++front == max) front = 0;
		return que[front];
	}
	
	public int dequeRear() throws EmptyIntQueueException{
		if(isEmpty()) {
			throw new EmptyIntQueueException();
		}
		num--;
		if(--rear == -1) rear = max - 1;
		return que[rear];
	}
	
	public int peekFront() {
		int i = front +1;
		if(i == max) {
			i=0;
		}
		return que[i];
	}
	
	public int peekRear() {
		int i = rear -1;
		if(i == -1) {
			i = max -1;
		}
		return que[i];
	}
	
	public int indexOf(int x) {
		
		for(int i=0; i<num; i++) {
			int index = (i+front+1)%max;
			if(que[index]==x) {
				return index;
			}
			
		}

		return -1;
	}
	
	public void clear() {
		front = 0;
		rear = front + 1;
		num = 0;
	}
	
	public int capacity() {
		
		return max;
	}
	
	public int size() {
		
		return num;
	}
	

	
	public void dump() {
		for(int i=0; i<num; i++) {
			int index = (i+front+1)%max;
			System.out.println(que[index]);
		}
	}
	
	public int search(int x) {
		for(int i=0; i<num; i++) {
			int index = (i+front+1)%max;
			if(que[index]==x) {
				return i+1;
			}	
		}
		return 0;
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
