package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrizeHunter15953 {

    public static int kakao2017(int rank) {
        int reward [] = {0, 5_000_000, 3_000_000, 2_000_000, 500_000, 300_000, 100_000};

        if(rank==0 || 21<rank)
            return reward[0];

        for(int i=1; i<=6; i++) {
            int flag = i*(i+1)/2;

            if(rank>flag) {
                continue;
            }else {
                return reward[i];
            }
        }

        return 0;
    }

    public static int kakao2018(int rank) {

        if(rank==0 ||31<rank)
            return 0;
        for(int i=1; i<=5; i++) {
            int flag = (int)Math.pow(2,i)-1;
            if(rank > flag) {
                continue;
            }else {
                return (int)Math.pow(2, 10-i)*10000;
            }

        }
        return 0;
    }


    public static void solution(int times, BufferedReader in) {

        String[] ranks = new String[times];
        
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in2 = new Scanner(System.in);

        for(int i=0; i<times; i++) {
            try {
                ranks[i] = in.readLine();
                //ranks[i] = in2.nextLine();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        

        for(int i=0; i<ranks.length; i++) {

            String tmp [] = ranks[i].split(" ");
            int result = kakao2017(Integer.parseInt(tmp[0])) + kakao2018(Integer.parseInt(tmp[1]));

            System.out.println(result);

        }


    }

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//      for(int i = 0; i<=100; i++) {
//         System.out.printf("%3d %10d %10d %n",i,kakao2017(i),kakao2018(i));
//
//      }


        try {
            int times = Integer.parseInt(in.readLine());
            solution(times, in);




        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}