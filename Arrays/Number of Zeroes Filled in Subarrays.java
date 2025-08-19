class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,n=0;
        for(int a:nums){
            if(a==0){
                n++;
                count+=n;
            }
            else{
                
                n=0;
            }
        }
        return count;

    }
}
