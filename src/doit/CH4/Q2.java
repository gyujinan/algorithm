package doit.CH4;

class GStack<E>{
	
	private int ptr;
	private E[] stack;
	private int capacity;
	
	public GStack(int capacity) {
		this.ptr = 0;
		this.capacity = capacity;
		try {
			stack = (E[]) new Object[capacity];
		}catch(OutOfMemoryError e) {
			capacity =0;
		}
		
	}
	public int size() {
		return ptr;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public E push(E x) throws OverflowIntStackException{
		if(this.isFull()) {
			throw new OverflowIntStackException();
		}
		
		
		return stack[ptr++] = x;
	}
	public E pop() throws EmptyIntStackException{
		if(this.isEmpty()) {
			throw new EmptyIntStackException();
		}
		return stack[--ptr];
	}
	public E peek() {
		if(this.isEmpty()) {
			throw new EmptyIntStackException();
		}
		return stack[ptr-1];
	}
	public void dump() {
		System.out.println("from top");
		for(int i=ptr-1; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
	public int indexOf(E x) {
		for(int i=ptr-1; i>=0; i--) {
			if(stack[i].equals(x) ) return i;
			
		}
		return -1;
	}
	public void clear() {
		
		ptr = 0;
	}
	public boolean isEmpty() {
		
		return ptr <= 0 ? true : false;
	}
	public boolean isFull() {
		return ptr >= capacity ? true : false;
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
