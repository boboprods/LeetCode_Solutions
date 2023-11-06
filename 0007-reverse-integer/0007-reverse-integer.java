class Solution {
    public int reverse(int x) {
        long reverse=0;
        
        
        while(x!=0){
            
            int mod=x%10;
            reverse=(reverse*10)+mod;
            if(reverse > Integer.MAX_VALUE)return 0;
            if(reverse < Integer.MIN_VALUE)return 0;
            x=x/10;
        }
        return (int)reverse;
        
    }
}