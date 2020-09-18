package doit.CH4;

import java.util.Scanner;

class EmptyIntStackException extends RuntimeException{
	EmptyIntStackException(){
		
	}
}

class OverflowIntStackException extends RuntimeException{
	OverflowIntStackException(){
		
	}
}

class IntStack{
	
	private int ptr;
	private int[] stack;
	private int capacity;
	
	public IntStack(int capacity) {
		this.ptr = 0;
		this.capacity = capacity;
		try {
			stack = new int[capacity];
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
	
	public int push(int x) throws OverflowIntStackException{
		if(this.isFull()) {
			throw new OverflowIntStackException();
		}
		
		
		return stack[ptr++] = x;
	}
	public int pop() throws EmptyIntStackException{
		if(this.isEmpty()) {
			throw new EmptyIntStackException();
		}
		return stack[--ptr];
	}
	public int peek() {
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
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) {
			if(stack[i] == x) return i;
			
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

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		IntStack stk = new IntStack(64);
		
		while(true) {
			System.out.printf("The number of data :%2d/%2d\n",stk.size(),stk.capacity());
			System.out.println("(1)push (2)pop (3)peek (4)dump (5)indexOf (6)clear (7)isEmpty (8)isFull (0)exit");
			
			int menu = 0;
			do {
				System.out.print("menu(0~8): ");
				menu = stdIn.nextInt();
			}while(!(0 <= menu && menu<=8));
			
			if(menu == 0) break;
			
			switch(menu) {
			case 1:
				System.out.print("data: ");
				int x = stdIn.nextInt();
				try {
					stk.push(x);
				}catch(OverflowIntStackException e) {
					System.out.println("The stack is full");
				}
				
				break;
			
			case 2:
				try {
					System.out.println(stk.pop());
				}catch(EmptyIntStackException e) {
					System.out.println("The stack is empty");
				}
				
				break;
			
			case 3:
				try {
					System.out.println(stk.peek());
				}catch(EmptyIntStackException e) {
					System.out.println("The stack is empty");
				}
				break;
			
			case 4:
				stk.dump();
				break;
				
			case 5:
				System.out.print("data: ");
				int index = stdIn.nextInt();
				System.out.println();
				System.out.println("stack["+index+"]: "+ stk.indexOf(index));
				break;
			
			case 6:
				stk.clear();
				stk.dump();
				break;
			
			case 7:
				if(stk.isEmpty()) {
					System.out.println("The stack is empty");
				}else {
					System.out.println("The stack is not empty");
				}
				break;
			
			case 8:
				if(stk.isFull()) {
					System.out.println("The stack is full");
				}else {
					System.out.println("The stack is not full");
				}
				break;
			}
		}
	}

}
