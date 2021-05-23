package JuneChallenge;

import java.util.ArrayList;
import java.util.Collections;
/*
 * 
 * [[945,563],[598,753],[558,341],[372,54],[39,522],[249,459],[536,264],[491,125],[367,118],[34,665],[472,410],[109,995],[147,436],[814,112],[45,545],[561,308],[491,504],[113,548],[626,104],[556,206],[538,592],[250,460],[718,134],[809,221],[893,641],[404,964],[980,751],[111,935]]
 */
public class June3 {

	public static void main(String[] args) {
		int[][] costs=new int[28][2];
		
		costs[1][0]=980;costs[1][1]=751;
		costs[2][0]=404;costs[2][1]=964;
		costs[3][0]=893;costs[3][1]=641;
		costs[4][0]=809;costs[4][1]=221;
		costs[5][0]=718;costs[5][1]=134;
		costs[6][0]=250;costs[6][1]=460;
		costs[7][0]=538;costs[7][1]=592;
		costs[8][0]=556;costs[8][1]=206;
		costs[9][0]=626;costs[9][1]=104;
		costs[10][0]=113;costs[10][1]=548;
		costs[11][0]=491;costs[11][1]=504;
		costs[12][0]=561;costs[12][1]=308;
		costs[13][0]=45;costs[13][1]=545;
		costs[14][0]=814;costs[14][1]=112;
		costs[15][0]=147;costs[15][1]=436;
		costs[16][0]=109;costs[16][1]=995;
		costs[17][0]=472;costs[17][1]=410;
		costs[18][0]=34;costs[18][1]=665;
		costs[19][0]=367;costs[19][1]=118;
		costs[20][0]=491;costs[20][1]=125;
		costs[21][0]=536;costs[21][1]=264;
		costs[22][0]=249;costs[22][1]=459;
		costs[23][0]=39;costs[23][1]=522;
		costs[24][0]=372;costs[24][1]=54;
		costs[25][0]=558;costs[25][1]=341;
		costs[26][0]=598;costs[26][1]=753;
		costs[27][0]=111;costs[27][1]=935;
		costs[0][0]=945;costs[0][1]=563;
		
		System.out.println("Answer"+twoCitySchedCost(costs));
	}
	
	
	 public static int twoCitySchedCost(int[][] costs) {
	     int mincost=0;
	     int[] cost;
	     int[] diflist=new int[costs.length];
	     ArrayList<Integer> diflistdup=new  ArrayList<Integer>();
		 for(int i=0;i<costs.length;i++) {
			  cost=costs[i];
			  diflist[i]=cost[1]-cost[0];
			  diflistdup.add(cost[1]-cost[0]);
		 }
		
		 Collections.sort(diflistdup);
		 
		 for(int i=diflistdup.size()-1;i>=diflist.length/2;i--)
			 diflistdup.remove(i);
		 
		 for(int i=0;i<diflist.length;i++) {
			  if(diflistdup.contains(diflist[i]))
				  mincost+= costs[i][1];
			  else
				  mincost+= costs[i][0];
		 }
		 return mincost;
	    }
}
