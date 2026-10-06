package Easy_difficulty;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int rSum = 0,lSum = 0;

        for(int i = 0;i < nums.length;i++){
                rSum += nums[i];
        }

        for(int i = 0;i < nums.length;i++){
            rSum -= nums[i];
            if(i == 0){
                if(rSum == 0){
                        return 0;
                }
            }else{
                lSum += nums[i-1];
                if(lSum == rSum){
                    return i;
                }

            }
        }

        return -1;

    }
}
