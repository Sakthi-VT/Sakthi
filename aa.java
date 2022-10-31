import java.util.*;
public class aa {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=s.nextInt();
		int a[]=new int [n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}