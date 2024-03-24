class Solution {
    public int majorityElement(int[] nums) {
        //boyer-moore-voting-algo
        int majority=-1;
        int count=0;
        for(int i : nums){
            if(count ==0){
                majority=i;
            }
            count+=(i == majority)? 1:-1;
            // if(i == majority){
            //     count++;
            // }else{
            //     count--;
            // }
        }
        return majority;
    }
}