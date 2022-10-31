import java.util.*;
public class alpha {
	public static void main(String args[]) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=s.nextLine();
		int n=str.length();
		//char ch=' ';
		for(int i=0;i<n;i++) {
			if (str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if(str.charAt(i)!='A'&&str.charAt(i)!='E'&&str.charAt(i)!='I'&&str.charAt(i)!='O'&&str.charAt(i)!='U')  {
				sum+=str.charAt(i)-'A'+1;
			}
			}	
			else if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')  {
				sum+=str.charAt(i)-'a'+1;
		}
			//sum=sum+index;
		}
		System.out.println(sum);
	}
}