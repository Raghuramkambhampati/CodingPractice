package LeetCode179;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] light= {3,2,4,1,5};
      System.out.println("Answer: "+Problem21(light));
	}

	
	public static int Problem21(int[] light) {
		//0-off 1-on 2-blue
		//int switchOnLight;
//		int ans=0,j;
//		int on=0,blue=0;
//		HashMap<Integer,Integer> statusMap=new HashMap<Integer,Integer>();
//		for(int i=0;i<light.length;i++)
//			statusMap.put(i,0);
//		
//		for(int switchOnLight: light ) {
//			switchOnLight--;
//			statusMap.put(switchOnLight,1);
//			on++;
//			for(j=0;j<light.length;j++) {
//				if(statusMap.get(j)!=1)
//					break;
//				blue+=1;
//			}
//				if(on==blue)
//					ans++;
//		}
//		
		int n=light.length;
        int mx=0,ans=0;
        for ( int i=0; i<n; i++ ) {
            int x=light[i];
            mx=Math.max(mx, x);
            if ( mx==i+1 ) ans++;
        }
		return ans;
	}
}
