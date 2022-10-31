import java.util.*;
public class abcd {
	public static void main(String[] args) {
		int count=0,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		int input1=s.nextInt();
		if(input1>=1 && input1<=25000){
			int a[]=new int [10];
			while(input1!=0){
				temp=input1%10;
				if(a[temp]==0){
					a[temp]=1;
					count++;
				}
				input1/=10;
			}
			System.out.println(count);
			
		}


	}

}
