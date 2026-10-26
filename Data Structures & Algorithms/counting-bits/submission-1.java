class Solution {
    public static boolean checkBit(int n,int x){
        int ans=(n>>x)&1;
        if(ans==1){
            return true;
        }
        return false;
    }
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        int idx=0;
        int org=n;
       for(int i=0;i<=n;i++){
        int count=0;

            for(int j=1;j<=32;j++){
                if(checkBit(i,j)){
                    count++;
                }
            }

            arr[idx++]=count;

       }
       return arr;
        
    }
}
