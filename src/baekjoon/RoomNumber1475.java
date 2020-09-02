package baekjoon;

import java.util.Scanner;

public class RoomNumber1475 {
	
	public static int someone(String str) {

		int[] number = new int[10];

		String roomNumber = str;

		roomNumber = roomNumber.replace('6', '9');

		int index;
		for (char ch : roomNumber.toCharArray()) {
			index = (int) ch - 48;

			number[index] += 1;
		}

		int maxUseCount = -1;
		int useCount = 0;

		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				useCount = (int) Math.round(number[9] / 2.0);
			} else {
				useCount = number[i];
			}

			if (useCount > maxUseCount) {
				maxUseCount = useCount;
			}
		}

		return maxUseCount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner scan = new Scanner(System.in);
    	int roomNumber = 0;
    	int [] parsedata = new int[10];
    	int result = 0;

    	roomNumber = Integer.parseInt(scan.nextLine());
        if(roomNumber==0){
            parsedata[0]++;
        }else{
            while(roomNumber != 0) {
    		//System.out.println(sum);
    		int tmp = roomNumber%10;
    		parsedata[tmp]++;
    		
    		roomNumber/=10;
    	    }
        }

    	if((parsedata[6]+parsedata[9])%2==1) {
    		//parsedata[6]=parsedata[9]=(parsedata[6]+parsedata[9]+1)/2;
    		parsedata[6]=parsedata[9] = (int) Math.round((parsedata[6]+parsedata[9]) / 2.0);
    	}else {
    		parsedata[6]=parsedata[9]=(parsedata[6]+parsedata[9])/2;
    		
    	}
    	for(int i=0; i<parsedata.length; i++) {
    		if(result<parsedata[i]) {
    			result = parsedata[i];
    		}
    	}
    	System.out.println(result);
	}


}
