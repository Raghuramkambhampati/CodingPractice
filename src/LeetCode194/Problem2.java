package LeetCode194;

import java.util.ArrayList;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] names=new String[] {"kaido","kaido(1)","kaido","kaido(1)"};
     System.out.println("asn"+getFolderNames(names));
	}

	
public static String[] getFolderNames(String[] names) {
    
	//HashMap<String,Integer> files=new HashMap<String,Integer>();
	ArrayList<String>  files=new ArrayList<String>();
	String filename,name;
	int prefix;
	for(int i=0;i<names.length;i++) {
		filename=names[i];
		name=filename;
		prefix=1;
		while(files.contains(name)) {
			name=filename+"("+prefix+")";
			prefix++;
		}
		names[i]=name;
		files.add(name);
	}
	return names;
    }
}
