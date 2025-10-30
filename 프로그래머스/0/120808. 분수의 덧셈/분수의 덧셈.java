class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int sum = 0;
        for(int i=1; i<=numer && i<=denom;i++){
            if(numer%i==0&&denom%i==0){
                sum=i;
            }
        }
        numer /=sum;
        denom /=sum;
        
        int[] answer = {numer,denom};
        return answer;
    }
}