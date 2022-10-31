import java.util.*;
public class alphabetposition {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=s.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++) {
			int a=(int)str.charAt(i)-96;
			System.out.println(str.charAt(i)+" "+a);
		}
	}
}