package LeetCode187;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ans=new int[] {1,0,1};
        int k=2;
        System.out.println("Answer :"+kLengthApart(ans,k));
	}

	
	public static boolean kLengthApart(int[] nums, int k)  {
		 boolean ans=true,firstoccurance=true;
			int j=0;
			for(int i=0;i<nums.length;i++) {
				if(nums[i]==1) {
					if(firstoccurance)
					{
						firstoccurance=false;
						j=i;
					}
					else {
						if(i-j-1<k) 
							return false;
						j=i;
					}
				}
			}
			
			
		
		return ans;
	}
}
