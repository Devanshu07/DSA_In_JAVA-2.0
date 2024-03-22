class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n= nums.length;
        // for(int i=0; i<n-1; i++)
        // for(int j=i+1; j<n; j++){
        //     if(nums[i] + nums[j] == target)
        //     return new int[]{i, j};
        // }
        // return new int[]{};
        int[] res ={-1, -1};
        HashMap<Integer, Integer> map =new HashMap<> ();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
             if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!= i){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
            }
        }
        return res;
    }
}