package LeetCode189;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<List<String>> orders=new ArrayList<List<String>>();
		 List<String> order;
		/*
		 * ["David","3","Ceviche"], ["Corina","10","Beef Burrito"],
		 * ["David","3","Fried Chicken"], ["Carla","5","Water"],
		 * ["Carla","5","Ceviche"], ["Rous","3","Ceviche"]
		 */
		 order=new ArrayList<String>();
		 order.add("David");
		 order.add("3");
		 order.add("Ceviche");
		 orders.add(order);
		 order=new ArrayList<String>();
		 order.add("Corina");
		 order.add("10");
		 order.add("Beef Burrito");
		 orders.add(order);
		 order=new ArrayList<String>();
		 order.add("David");
		 order.add("3");
		 order.add("Fried Chicken");
		 orders.add(order);
		 order=new ArrayList<String>();
		 order.add("Carla");
		 order.add("5");
		 order.add("Water");
		 orders.add(order);
		 order=new ArrayList<String>();
		 order.add("Carla");
		 order.add("5");
		 order.add("Ceviche");
		 orders.add(order);
		 order=new ArrayList<String>();
		 order.add("Rous");
		 order.add("3");
		 order.add("Ceviche");
		 orders.add(order);
		 displayTable(orders);
	}

	
	 public static List<List<String>> displayTable(List<List<String>> orders) {
	        
		 List<List<String>> ans =new ArrayList<List<String>>();
		 List<String> tmp;
		 //contians all the food items
		 List<String> foodItems=new ArrayList<String>();
		 //TreeMap contains table no and corresponding food items
		 TreeMap<Integer,TreeMap<String,Integer>> tICountMap=new TreeMap<Integer,TreeMap<String,Integer>>();
		 TreeMap<String,Integer> ItemCountMap;
		 for(List<String> order:orders)
		 {
			 String table=order.get(1);
			 int tableno=Integer.parseInt(table);
			 String Item=order.get(2);
			 if(!foodItems.contains(Item)) {
				 foodItems.add(Item);
			 }
		     if(!tICountMap.containsKey(tableno))	 
		     {
		    	 ItemCountMap=new  TreeMap<String,Integer>();
		    	// ItemCountMap.put(Item, 1);
		    	 tICountMap.put(tableno,ItemCountMap);
		     }
		     ItemCountMap=tICountMap.get(tableno);
		     int count=ItemCountMap.containsKey(Item)==false? 0 : ItemCountMap.get(Item);
		     ItemCountMap.put(Item, ++count);
		 }
		 
		 Collections.sort(foodItems);
		 foodItems.add(0, "Table");;
		 ans.add(foodItems);
		 for(Entry e:tICountMap.entrySet()) {
			 tmp=new ArrayList<String>();
			 tmp.add(e.getKey().toString());
			 ItemCountMap=(TreeMap<String,Integer>)e.getValue();
			 for(int i=1;i<foodItems.size();i++) {
				 String Item=foodItems.get(i);
				 if(!ItemCountMap.containsKey((Item)))
					 ItemCountMap.put(Item, 0);
				 //Integer count=ItemCountMap.get(Item)==null?0:ItemCountMap.get(Item);
				 tmp.add(ItemCountMap.get(Item).toString());
			 }
			 ans.add(tmp);
		 }
		 
		 return ans;
	    }
}
