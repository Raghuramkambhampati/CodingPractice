package LeetCode;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums=new int[] {0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println("Answer: "+removeElement(nums,val));
	}

	
	public static int removeElement(int[] nums,int val) {
		 int i = 0, j = 0;
	        for (; i < nums.length; i++)
	            if (nums[i] != val)
	                nums[j++] = nums[i];
	        return j;
	}
}
