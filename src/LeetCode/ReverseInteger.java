package LeetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Answer: "+ Reverse(1534236469));
	}

	public static int Reverse(int x)
	{
		long ans=0;
       while(x!=0){
    	   
           ans=ans*10+x%10;
           x=x/10;
       }
       if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
		   return 0;
      return (int)ans;
	}
	
}
