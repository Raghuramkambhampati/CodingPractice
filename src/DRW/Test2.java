package DRW;


import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int[] numbers=new int[] {3,2,1,4};
		System.out.println("Answer:");
	}

	
	//int[]    3,2,1,4;
	 public static boolean solution(int[] elements) {
		Arrays.sort(elements);
		int n=elements.length;
		for(int i=0;i<n;i++)
			if(elements[i]!=i+1) return false;
		return true;
	    }
}
