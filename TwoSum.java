class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> maps = new HashMap();
       //fill HM
       for (int i=0;i<nums.length;i++){
           maps.put(nums[i],i);
       }        
       for (int i=0;i<nums.length;i++){
           int num = nums[i];
           int rem = target - num;
           if(maps.containsKey(rem)){
               int index = maps.get(rem);
               if(index==i)continue;
               return new int[]{i,index};
           }
       }
       return new int[]{};
    }
    
}
