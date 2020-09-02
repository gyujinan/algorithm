package baekjoon;

import java.util.Scanner;

public class RoomNumber1475 {
	
	public static int someone(String str) {

		// �? 숫�?별(0~9) 사용한 횟수를 저장하는 배열�?� �?성한다.
		int[] number = new int[10];

		String roomNumber = str;

		// 6과 9는 혼용�?�어서 사용할 수 있으므로
		// 6�?� 9로 값�?� 변경한다.
		roomNumber = roomNumber.replace('6', '9');

		int index;
		for (char ch : roomNumber.toCharArray()) {
			index = (int) ch - 48;

			// 숫�? 사용 횟수를 �?가시킨다.
			number[index] += 1;
		}

		int maxUseCount = -1;
		int useCount = 0;

		for (int i = 0; i < 10; i++) {
			// 숫�? 9�?� 경우 6과 함께 카운트가 �?�었으므로 2로 나누어서 반올림한다.
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
        	//왜 roomNumber�?� 0�?� 경우를 �?�?하지 못 했�?�까?
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
