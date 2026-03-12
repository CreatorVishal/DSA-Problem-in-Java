public class Problem3{

    public static int maxSubArray(int[] nums) {
        int currSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>MaxSum){
                MaxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }

      return MaxSum;  
    }

  
  public static void main(String[] args) {

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
  }
