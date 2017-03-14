/*
	Author :: Ashwani Tiwari
	Code :: Stacks: Balanced Brackets  
	Problem statement :: From Hacker-rank
	link to problem :: https://www.hackerrank.com/challenges/ctci-balanced-brackets
*/
import java.util.Scanner;
import java.util.Stack;
public class Solution {
	public static boolean solve(String s){
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.isEmpty())
			{
				if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'){
					return false;
				}
				else{
					st.push(s.charAt(i));
				}
			}
			else{
					if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
					{
						st.push(s.charAt(i));
					}
					else{
							char c=st.pop();
							if(s.charAt(i)=='}'&& c=='{')
								continue;
							if(s.charAt(i)==')'&& c=='(')
								continue;
							if(s.charAt(i)==']'&& c=='[')
								continue;
							return false;
					}
			}
		}
		if(st.size()==0){
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			String s=sc.nextLine();
			if(s.length()%2!=0){
				System.out.println("NO");
			}
			else{
				System.out.println(solve(s)?"YES":"NO");
			}
		}
		sc.close();
	}
}
