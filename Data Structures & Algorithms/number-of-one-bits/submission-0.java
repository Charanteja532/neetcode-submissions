class Solution {
    public static boolean checkBit(int n,int x){
        int ans=(n>>x)&1;
        if(ans==1){
            return true;
        }
        return false;
    }
    public int hammingWeight(int n) {
        int count=0;
        for(int i=1;i<=32;i++){
            if(checkBit(n,i)){
                count++;
            }
        }
        return count;
        
    }
}
