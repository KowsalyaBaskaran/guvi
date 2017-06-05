import java.util.Scanner;

public class strrev {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		String val = s.next(),rev;
		StringBuilder input1 = new StringBuilder();
		input1.append(val);
		input1=input1.reverse();
		rev=input1.toString();
		System.out.println(rev);
	        System.out.println(rev.replaceAll("[aeiouAEIOU]", ""));
		s.close();
	}
	
	
	
}

