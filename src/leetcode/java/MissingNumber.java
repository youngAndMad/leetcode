package leetcode.java;

import java.util.Arrays;

public class MissingNumber {
        public int missingNumber(int[] nums) {
        Arrays.sort(nums);
          if(nums.length==1 && nums[0]==0){
          return 1;
        }
        if(nums[0]!=0){
          return 0;
        }
        for(int i =0;i<nums.length-1;i++){
          if(nums[i]!=nums[i+1]-1){
            return nums[i]+1;
          }
        }
        return nums.length;
    }
}
