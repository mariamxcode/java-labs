import java.util.Arrays;
public class Solution {

public static void main(String...args){
            int[] numbers = {2,3,4};
            System.out.print(Arrays.toString(twoSum(numbers,6)));
            }
public static  int[] twoSum(int[] nums, int target) {
        
        int [] theIndex = new int [1];
        int sum  = 0;
        for (int index = 0; index < nums.length;index++){
         if(nums[index] < target){
             sum+=nums[index];
             if(sum == target){
             break;
            }else{
           theIndex[index]=index;
            }
         }
        
            }
            return theIndex;
            
            
}
}
