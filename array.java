import java.util.*;
public class array {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=s.nextInt();
		int a[]=new int [n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();			
		}
		for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]==a[j]) {
                  a[j] =a[n-1];
                    n--;
                }
  	            }
        }
		 for (int i = 0; i<n; i++) {     
	            for (int j = i+1; j < n; j++) {     
	               if(a[i] > a[j]) {    
	                  int temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
	               }     
	            }     
	        }
		 System.out.println("Elements in ascending order: ");    
	        for (int i = 0; i < n; i++) {     
	            System.out.print(a[i] + " ");    
	            
	        }	        
	        }
}