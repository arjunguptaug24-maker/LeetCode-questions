class Solution {
    public int smallestValue(int n) {
        if(IsPrime(n)){
            return n;
        }
        if(n == 4){
            return 4;
        }

        int sum = 0 ;
        int i = 2;
        while(n>1){
            if(n%i == 0 ){
                n=n/i;
                sum = sum+i;
                i =1;
            }
            i++;

        }

        
        return smallestValue(sum);
        
    }
    private boolean IsPrime(int n){
        for(int i = n-1 ; i>1 ; i--){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}