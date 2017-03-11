/*
	Author :: Ashwani Tiwari
	Code :: Hash Tables: Ransom Note
	Problem statement :: From Hacker-rank
	link to problem :: https://www.hackerrank.com/challenges/ctci-ransom-note
*/
import java.util.HashMap;
import java.util.Scanner;
public class Learn{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		String ransomnote=sc.nextLine();
		if(m>n){
			System.out.println("No");
		}
		else{
			int flag=0;
			HashMap<String,Integer>hm=new HashMap<String,Integer>();
			String words[]=s.split(" ");
			for(String temp : words){
				if(hm.containsKey(temp)==true){
					hm.put(temp, hm.get(temp)+1);
				}
				else{
					hm.put(temp, 1);
				}
			}
			String rnote[]=ransomnote.split(" ");
			for(int i=0;i<rnote.length;i++){
				if(hm.containsKey(rnote[i])==false){
					flag=1;
					break;
				}
				else{
					int x=hm.get(rnote[i]);
					hm.put(rnote[i], x-1);
					if(x==1){
						hm.remove(rnote[i]);
					}
				}
			}
			if(flag==1){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
		sc.close();
	}
}
