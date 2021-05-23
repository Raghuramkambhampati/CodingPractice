package LeetCode215;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	HashMap<Integer,String> str;
    int ptr,n;

	/*
	 * public OrderedStream(int n) { str=new HashMap<Integer,String>(n); for(int
	 * i=0;i<n;i++) str.put(i,""); ptr=1; this.n=n; }
	 */
    public List<String> insert(int id, String value) {
       str.put(id,value);
       
        ArrayList<String> ans=new ArrayList();
        String cur=new String();
        for(int i=ptr;i<n;i++){
            cur=str.get(i);
            if(cur=="") {
            	ptr=i;
            	break;
            }
            
            ans.add(cur);
        }
        return ans;
    }
}
