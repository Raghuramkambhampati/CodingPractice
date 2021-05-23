package CoderPro;

import java.util.HashMap;

/***
 * 
 * @author raghu
 *Ransom note is problem whether if a note can be prepared from a magazine
 *magazine is a collection of letters. It can be of any size (0,1,2,50,100) say n and can contain duplicates.
 *note is a also collection of letters. It can be of any size (0,1,2,3,100) say m.
 *a note is constructed from taking out a letter from magazine.
 *the given question is whether if a note can be prepared from magazine or not.
 */
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String note="aa";
		String magzaine="aab";
		System.out.println("Is a note can be contructed with Note: "+note+" and Magzaine: "+magzaine+" Result: "+constructNote(note,magzaine));
	}

	
	public static boolean constructNote(String note,String magzine) {
		HashMap<Character,Integer> magzineCount= new HashMap<Character,Integer>();
		Integer count;
		
		for(int i=0;i<magzine.length();i++) {
			count=magzineCount.containsKey(magzine.charAt(i))==false? 0 : magzineCount.get(magzine.charAt(i));
			magzineCount.put(magzine.charAt(i), ++count);
		}
		//System.out.println(mydisdtance);
		
		for(int i=0;i<note.length();i++) {
			if(!magzineCount.containsKey(note.charAt(i)))
				return false;
			else {
				count=magzineCount.get(note.charAt(i));
				if(count<=0)
					return false;
				magzineCount.put(note.charAt(i),--count );
			}
	}
		return true;
}

}