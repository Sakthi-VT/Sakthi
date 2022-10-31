import java.util.*;
public class anagram {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String str1=s.nextLine();
		System.out.println("Enter the String2: ");
		String str2=s.nextLine();
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if(count==str1.length()) {
			System.out.println("Anagrams");
			}
		else {
			System.out.println("Not Anagram");
			}
		}
	}