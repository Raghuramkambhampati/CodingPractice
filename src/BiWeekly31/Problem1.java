package BiWeekly31;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=3,high=7; 
		int ans=0;
	        if(low%2!=0)
	        {
	            ans++;
	            low++;
	        }
	            
	        if(high%2==0){
	            high--;
	        }
	        ans+=(high-low+1)/2;    
	        System.out.println("answer: "+ans);
	}

}
