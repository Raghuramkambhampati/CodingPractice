package LeetCode30;

import java.util.HashMap;

public class Problem1 {

	static HashMap<String,String> monthMap=new HashMap<String,String>(){ 
		{
    put("Jan","01");
    put("Feb","02");
    put("Mar","03");
    put("Apr","04");
    put("May","05");
    put("Jun","06");
    put("Jul","07");
    put("Aug","08");
    put("Sep","09");
    put("Oct","10");
    put("Nov","11");
    put("Dec","12"); } };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Answer: "+reformatDate("20th Oct 2052"));
	}

	
	
	 public static String reformatDate(String date) {
		    
	        String[] datearr=date.split(" ");
	        String year=datearr[2];
	        String month=monthMap.get(datearr[1]);
	        String day=datearr[0].length()==4?datearr[0].substring(0, 2):"0"+datearr[0].substring(0, 1);
		 return year+"-"+month+"-"+day;
	    }
}
