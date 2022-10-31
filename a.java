import java.util.*;
public class a {
	public static void main(String[] args) {
		int count=0,count1=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=s.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
				System.out.print(str.charAt(i)+" ");
			}
		}
		System.out.println(count);
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u') {
				System.out.print(str.charAt(i)+" ");
				count1=n-count;
				}
			}
		System.out.println(count1);
		}
	}