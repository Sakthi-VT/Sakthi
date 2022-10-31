import java.util.*;
public class agecalculate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter date of brith");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println(a+"/"+b+"/"+c);
		System.out.println("enter the current date");
		int d=s.nextInt();
		int e=s.nextInt();
		int f=s.nextInt();
		int g=0;
		int  h=0;
		int i=0;
		System.out.println(d+"/"+e+"/"+f);
		if(d<a) //19<14 
			{
			d=d+30;//d=20+30=50
			g=d-a;//g=d-a=50-14=36
			e=e-1;//07-1 e=06
		}
		else {
			g=d-a;//20-14  g=6
		}
		if(e<b) {
			e=e+12;
			h=e-b;
			f=f-1;
		}
		else {
			h=e-b;
		}
		if(f>c) {
			i=f-c;
		}
		System.out.println("your age");
		System.out.println(g+"/"+h+"/"+i);
	}
}