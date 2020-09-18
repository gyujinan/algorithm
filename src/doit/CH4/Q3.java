package doit.CH4;

public class Q3 {
	class IntStack{
		
		private int ptrA;
		private int ptrB;
		private int[] stackAB;
		private int capacity;
		
		public IntStack(int capacity) {
			this.ptrA = 0;
			this.ptrB = capacity-1;
			this.capacity = capacity;
			try {
				stackAB = new int[capacity];
			}catch(OutOfMemoryError e) {
				capacity =0;
			}
		}
		
		public int sizeA() {
			return ptrA;
		}
		
		public int sizeB() {
			return capacity - (ptrB + 1);
		}
		
		
		
		public int capacityAB() {
			return capacity;
		}
		
		public int capacityA() {
			return capacity- sizeB();
		}
		
		public int capacityB() {
			return capacity - sizeA();
		}
		
		public int pushA(int x) throws OverflowIntStackException{
			if(this.isFull()) {
				throw new OverflowIntStackException();
			}
			return stackAB[ptrA++] = x;
		}
		
		public int pushB(int x) throws OverflowIntStackException{
			if(this.isFull()) {
				throw new OverflowIntStackException();
			}
			
			
			return stackAB[ptrB--] = x;
		}
		public int popA() throws EmptyIntStackException{
			if(this.isEmptyA()) {
				throw new EmptyIntStackException();
			}
			return stackAB[--ptrA];
		}
		public int popB() throws EmptyIntStackException{
			if(this.isEmptyB()) {
				throw new EmptyIntStackException();
			}
			return stackAB[++ptrB];
		}
		public int peekA() {
			if(this.isEmptyA()) {
				throw new EmptyIntStackException();
			}
			return stackAB[ptrA-1];
		}
		public int peekB() {
			if(this.isEmptyB()) {
				throw new EmptyIntStackException();
			}
			return stackAB[ptrB+1];
		}
		public void dumpA() {
			System.out.println("from top");
			for(int i=ptrA-1; 0<=i; i--) {
				System.out.println(stackAB[i]);
			}
		}
		public void dumpB() {
			System.out.println("from top");
			for(int i=ptrB+1; i<capacity; i++) {
				System.out.println(stackAB[i]);
			}
		}
		public int indexOfA(int x) {
			for(int i=ptrA-1; 0<=i; i--) {
				if(stackAB[i]==x) {
					return i;
				}
			}
			return -1;
		}
		public int indexOfB(int x) {
			for(int i=ptrB+1; i<capacity; i++) {
				if(stackAB[i]==x) {
					return i;
				}
			}
			return -1;
		}
		public void clearAB() {
			
			ptrA = 0;
			ptrB = capacity - 1;
		}
		public void clearA() {
			
			ptrA = 0;
		}
		public void clearB() {
			
			ptrB = capacity - 1;
		}
		public boolean isEmptyA() {
			
			return ptrA <= 0 ? true : false;
		}
		public boolean isEmptyB() {
			
			return ptrB >= capacity-1 ? true : false;
		}
		public boolean isFull() {
			return ptrA > ptrB  ? true : false;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
