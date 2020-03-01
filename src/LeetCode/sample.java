package LeetCode;

public class sample {

	public static void main(String[] args) {
		int x=10;
		System.out.println("Reverse of "+x+" is : "+reverse(x));
	}

	 static public int reverse(int x) {
		 int ans=0,r;    
         if(x==0)
            return ans;
        ans=1;
        boolean sign;
        sign = x>0 ? true:false;
        x=Math.abs(x);
        while(x==0) {
        	r=x%10;
        	x=x/10;
        	ans=ans*10+r;
        }
        return sign? ans: ans*-1;
    }
}
