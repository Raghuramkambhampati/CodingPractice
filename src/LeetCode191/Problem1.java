package LeetCode191;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums=new int[]{1,2,3,5,5};
        System.out.println("Answer: "+maxProduct(nums));
	}

	
public static int maxProduct(int[] nums) {
        int max1=0,max2=0,tmp;
        int len=nums.length;
	for(int i=len-1;i>=len-2;i--) {
		for(int j=i-1;j>=0;j--)
		{
			if(nums[j]>nums[i]) {
				tmp=nums[j];
				nums[j]=nums[i];
				nums[i]=tmp;
			}
		}
	}
	
	return (nums[len-1]-1)*(nums[len-2]-1);
    }
}
