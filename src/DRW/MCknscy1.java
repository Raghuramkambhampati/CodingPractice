package DRW;

public class MCknscy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	
}



class myNum implements Comparable  {
	
	int n;
	int cardinality;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getCardinality() {
		return cardinality;
	}
	public void setCardinality(int cardinality) {
		this.cardinality = cardinality;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		myNum o2=(myNum)o;
		if(this.cardinality<o2.cardinality)
			return -1;
		else if(this.cardinality>o2.cardinality)
			return 1;
		else
		{
			if(this.n>o2.n)
				return -1;
			else if(this.n<o2.n)
				return 1;
		}
		return 0;
	}
}
