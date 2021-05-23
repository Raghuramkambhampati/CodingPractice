package JuneChallenge;

public class June4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="facebook1";
       reverseString(s.toCharArray());
	}

	
public static void reverseString(char[] s) {
    char ch;    
	for(int i=0,j=s.length-1;i<j;i++,j--) {
        	ch=s[i];
        	s[i]=s[j];
        	s[j]=ch;
        }
    int a=1;
	
    }
}
