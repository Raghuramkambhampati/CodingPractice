package DRW;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Answer: " + solution(6238352));
	}

	//5213475
	// 6238352
	// 6-2+3-8+3-5+2
	//4,3,1,2,5
	 public static int solution(int n) {
		 int sum=0;
	     int r,digit;
	     boolean sign=true;
	     int[] digits=new int[(int)Math.log(n)];
	    int i=0;
		 for(i=0;n!=0;n=n/10,i++) 
			 digits[i]=n%10;
		 for(i--;i>=0;i--) {
			 if(sign) {
				 sum=sum+digits[i];
				 sign=false;
			 }
			 else if(sign) {
				 sum=sum-digits[i];
				 sign=true;
			 }
		 }
			 
		 
		 return sum;
	 }
	 
	 
	 
}
