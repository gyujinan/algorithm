package doit.CH2;

public class Q11 {
	private static int isLeap(int year) {
		return (year % 4 == 0 && year %100 != 0 || year %400 ==0) ? 1:0;
	}
	
	
	static class YMD {
		private int [][] mdays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		
		int y;
		int m;
		int d;
		
		YMD(int y, int m, int d){
			this.y = y;
			this.m = m;
			this.d = d;
			
		}
		
		
		
		YMD after(int n) {
			int days=n+d;
			while(true) {
				if(mdays[isLeap(y)][m-1]>days) {
					if(m==12) {
						y++;
						m=1;
						days-=mdays[isLeap(y)][m-1];
					}else {
						m++;
						days-=mdays[isLeap(y)][m-1];
					}
					
				}else {
					d=days;
					break;
				}
				
			}
			return this;
		}
		
		
		YMD before(int n) {
			int days = d-n;
			while(true) {
				if(days<=0) {
					if(m==1) {
						y--;
						m=12;
						days+=mdays[isLeap(y)][m-1];
					}else {
						m--;
						days+=mdays[isLeap(y)][m-1];						
					}
				}else{
					d=days;
					break;
				}
			}
			return this;
		}
		
		public String toString() {
			
			return y+"/"+m+"/"+d;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YMD test = new YMD(2000,1,1);
		test.before(366);
		System.out.println(test.toString());

	}

}
