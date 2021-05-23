package JuneChallenge;

public class June10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums=new int[]{1,30,50,60};
        int n=22;
        System.out.println("Answer: "+searchInsert(nums,n));
	}

	
	 public static int searchInsert(int[] nums, int target) {
		 int len=nums.length-1;
		 if(target>nums[len])
			 return len+1;
		 if(target<=nums[0])
			 return 0;
	        return binarySearch(nums,0,nums.length-1,target);
	    }
	 
	 public static int binarySearch(int[] nums,int l,int h,int target) {
		 int m=(h+l)/2;
		 int tmp=nums[m];
		 int ans=0;
		 if(tmp==target)
			 ans=m;
		 else if(h==l+1)
			 ans=h;
		 else if(target<tmp)
			 ans= binarySearch(nums,l,m,target);
		 else if(target>tmp)
			 ans= binarySearch(nums,m,h,target);
		return ans;
		 
	 }
}
