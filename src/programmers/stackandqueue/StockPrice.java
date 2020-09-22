package programmers.stackandqueue;

public class StockPrice {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++){
            int count = 0;    
            for(int j =i+1; j<prices.length; j++){
                count++;
                if(prices[i]>prices[j] || j==prices.length-1){
                    answer[i] = count;
                    break;
                }
            }
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
