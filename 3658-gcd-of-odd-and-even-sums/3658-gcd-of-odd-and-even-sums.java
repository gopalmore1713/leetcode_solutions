class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int evn = 0;
        for(int i = 1; i<=(n+n);i++){
            if(i%2 == 0){
                evn = evn + i;
            }
            else{
                odd = odd + i;
            }
        }
        int sum = 0;
        for(int j = 1;j<=n; j++){
            if(evn % j == 0 && odd % j ==0){
                sum = j;
            }
        }
        return sum;
    }
}