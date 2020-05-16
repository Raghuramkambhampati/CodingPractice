package LeetCode187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public String destCity(List<List<String>> paths){
		String ans=new String(),start,end;
		HashSet<String>  cities=new HashSet<String>();
		HashMap<String,String> path=new HashMap<String,String>();
		List<String> tmp=new ArrayList<String>();
		for(int i=0;i<paths.size();i++) {
			tmp=paths.get(i);
			start=tmp.get(0);
			end=tmp.get(1);
			cities.add(tmp.get(0));
			cities.add(tmp.get(1));
			path.put(start, end);
		}
		for(String city:cities) {
			if(!path.containsKey(city))
				return city;
		}
		return ans;
	}
}
