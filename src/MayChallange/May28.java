package MayChallange;

public class May28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countBits(10);
	}

public static int[] countBits(int num) {
	if(num==0)
		return new int[]{0};
    int[] ans=new int[num+1];   
    int r,q;
    ans[0]=0;
    ans[1]=1;
	for(int n=2;n<=num;n++) {
		r=n%2;q=n/2;
		if(r==0)
			ans[n]=ans[q];
		else
			ans[n]=ans[q]+1;
	}
	
	return ans;
    }
	
	
}
