package doit.CH4;

class EmptyIntQueueException extends RuntimeException{
	EmptyIntQueueException(){
	}
}

class OverflowIntQueueException extends RuntimeException{
	OverflowIntQueueException(){	
	}
}
class IntAryQueue {
	private int max;
	private int num;
	private int [] que;
	
	IntAryQueue(int capacity){
		num = 0;
		max = capacity;
		
	}
	
	public int enque(int x) throws OverflowIntQueueException{
		if(isFull()) {
			throw new OverflowIntQueueException();
		}
		
		
		que[num++]=x;
		
		
		return x;
	}
	
	public int deque() throws EmptyIntQueueException{
		if(isEmpty()) {
			throw new EmptyIntQueueException();
		}
		
		int out = que[0];
		for(int i=1;i<num; i++) {
			que[i-1] = que[i];
		}
		num--;
		return out;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyIntQueueException();
		}
		
		return que[num-1];
	}
	
	public int indexOf(int x) throws EmptyIntQueueException{
		
		for(int i=0;i<num; i++) {
			if(que[i]==x) return i;
		}
		return -1;
	}
	
	public void clear() {
		
		num = 0;
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
		
		
		for(int i = 0; i<num; i++) {
			System.out.println(que[i]);
		}
	}
}

public class Q4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
