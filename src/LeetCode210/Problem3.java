package LeetCode210;

import java.util.HashSet;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet set=new HashSet();
     
	}

	
	 static int solutuion(String s,String t) {
		int ans=-1;
		int len1=s.length();
		int len2=t.length();
		if(len1==0 || len2==0 || len1%len2!=0)
			return -1;
		for(int i=0;i<len1;i=i+len2) {
			if(!t.equals(s.substring(i, i+len2-1)));
			   return -1;  
		}
		
		return ans;
	}
}



/**

// HashSet<Character> vertices=new HashSet<Character>();
    HashMap<Character,Integer> verticies=new HashMap<Character,Integer>();
    verticies.put('F',0);
    verticies.put('Y',1);
    verticies.put('H',2);
    
    for(char[] road:roads){
      vertices.add(road[0]);
      vertices.add(road[1]);
      
    }
    int nverticies=vertices.Size();
    char[][] graph=new char[nverticies][nverticies];
    for(char[] road:roads){
      graph[road[0]][road[1]]=
    }
    
    return "FRIEND WINS";
**/