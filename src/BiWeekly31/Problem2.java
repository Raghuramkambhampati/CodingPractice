package BiWeekly31;

import java.util.HashMap;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Anser: "+NumSplits("acbadbaada"));
	}

	
public static int NumSplits(String s) {
        int ans=0,count;
        HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
        char[] chararray=s.toCharArray();
        for(char ch:chararray) {
        	count=map1.getOrDefault(ch, 0);
        	map1.put(ch, ++count);
        }
        
        for(char ch:chararray) {
        	count=map1.get(ch);
        	if(count==1)
        		map1.remove(ch);
        	else 
        		map1.put(ch, --count);
        	count=map2.getOrDefault(ch, 0);
        	map2.put(ch, ++count);
        	
        	if(map1.size()==map2.size())
        		ans++;
        }
        return ans;
    }
}
