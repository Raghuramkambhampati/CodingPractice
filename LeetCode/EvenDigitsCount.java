package leetcodepratcie;


//to find the length of the number
public class EvenDigitsCount {

	public static void main(String[] args) {
	int n=1234567345;	
    System.out.println("Number "+n+" length is:"+digits(n));
	}

	public static int digits(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
}
