/*
	Author :: Ashwani Tiwari
	Code :: Strings:Making Anagrams(Cracking the Coding Interview)
	Problem statement :: From Hacker-rank
	link to problem :: https://www.hackerrank.com/challenges/ctci-making-anagrams
*/
import java.util.Scanner;
public class Learn {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int a[]=new int[26];
		int b[]=new int[26];
		long ans=0;
		for(int i=0;i<s1.length();i++){
			a[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s2.length();i++){
			b[s2.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++){
				ans+=Math.min(a[i], b[i]);
		}
		System.out.println(s1.length()+s2.length()-ans);
		sc.close();
	}
}
